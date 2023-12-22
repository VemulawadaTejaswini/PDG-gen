import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        if (k >= n) System.out.println(0);
        else {
            long sum = 0;
            for (int i = 0; i < n - k; i++) sum += arr[i];
            System.out.println(sum);
        }
    }
}
