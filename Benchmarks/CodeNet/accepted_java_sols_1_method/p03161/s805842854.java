import java.util.Scanner;

/**
 * Frog 2
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] H = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                H[i] = sc.nextInt();
            }

            long[] dp = new long[N + 1];

            for (int i = 2; i <= N; i++) {
                dp[i] = Long.MAX_VALUE;

                for (int j = 1; j <= K; j++) {
                    if (i - j >= 1) {
                        dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(H[i] - H[i - j]));
                    }
                }
            }

            System.out.println(dp[N]);
        }
    }

}
