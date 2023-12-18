import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int left = 0;
        int right = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            right += arr[i];
        }
        int minDiff = right;

        for (int i = 0; i < n; i++) {
            left += arr[i];
            right -= arr[i];
            int diff = Math.abs(left - right);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println(minDiff);
    }
}
