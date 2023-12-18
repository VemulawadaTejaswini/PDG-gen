import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
         
        for (int i = 0; i < n; i++) array[i] = input.nextInt();
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(array[n - 1]);
    }
}