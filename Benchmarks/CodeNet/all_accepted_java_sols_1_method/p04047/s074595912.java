
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int[] arr = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            arr[i] = In.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        for (int i = 0; i < arr.length; i=i+2) {
            total += arr[i];
        }
        System.out.println(total);
    }

}
