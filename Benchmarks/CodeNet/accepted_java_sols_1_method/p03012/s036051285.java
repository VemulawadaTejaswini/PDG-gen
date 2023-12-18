
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        int[] sums = new int[n];
        for (int i = 0; i < n; i++) {
            sums[i] += nums[i];
            if (i > 0) {
                sums[i] += sums[i - 1];
            }
        }
        int value = sum;
        for (int i = 0; i < n; i++) {
            final int abs = Math.abs(sum - sums[i] - sums[i]);
            value = Math.min(value, abs);
        }
        System.out.println(value);
    }
}
