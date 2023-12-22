import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) arr[i] = scan.nextInt();
        for(int i = 0; i < size; i++){
            int tmp = arr[i], j = i;
            for(; 0 < j && tmp <= arr[j - 1]; j--) arr[j] = arr[j - 1];
            arr[j] = tmp;
            for(j = 0; j < size; j++)
                System.out.print((j == 0 ? "" : " ") + arr[j]);
            System.out.println();
        }
    }
}