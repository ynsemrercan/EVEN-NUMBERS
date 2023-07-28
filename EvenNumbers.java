import  java.util.Arrays;
public class EvenNumbers {
    public static void main(String[] args) {

        int[] numbers = {21,31,34,22,24,54,76,-54,56,0,234};
        System.out.println("Dizi : " + Arrays.toString(numbers));
        //Diziyi küçükten büyüğe sıralıyoruz.
        Arrays.sort(numbers);
        System.out.println("Sıralı : " + Arrays.toString(numbers));
        //Dizi sıralandığında tekrarlayan değerler sıralı geldi.
        int counter=0;
        for(int i=0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                int evenNumber = numbers[i];
                if(evenNumber % 2 == 0){
                    counter++;
                    System.out.print(evenNumber + " ");
                }
            }
        }
        if(counter == 0){
            System.out.println("Tekrar Eden Çift Sayı Bulunamadı !");
        }
    }
}




