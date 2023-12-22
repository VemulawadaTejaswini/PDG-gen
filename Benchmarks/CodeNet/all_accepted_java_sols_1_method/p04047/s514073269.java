import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
