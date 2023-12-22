import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int[] dp = new int[N + 1];
            Arrays.fill(dp, (int) 1e9);
            dp[0] = 0;
            for (int i = 0; i < dp.length; i++) {
                for (int j = 1; i + j < dp.length; j += (int) 1e9) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
                for (int j = 6; i + j < dp.length; j *= 6) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
                for (int j = 9; i + j < dp.length; j *= 9) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
            }

            System.out.println(dp[N]);
        }
    }
}
