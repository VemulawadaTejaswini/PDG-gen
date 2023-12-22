import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        long total = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
            total += array[i];
        }
        Arrays.sort(array);
        System.out.println(array[0]+" "+array[array.length-1]+" "+total);
    }
}