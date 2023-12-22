import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= n; i++) {
            int power = 1;
            while (power <= i) {
                dp[i] = Math.min(dp[i], dp[i - power] + 1);
                power *= 6;
            }

            power = 1;
            while (power <= i) {
                dp[i] = Math.min(dp[i], dp[i - power] + 1);
                power *= 9;
            }
        }

        System.out.println(dp[n]);
    }
}
