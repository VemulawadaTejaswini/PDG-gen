import java.util.Scanner;

/**
 * Candies
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            long[][] dp = new long[N + 1][K + 1];
            dp[0][0] = 1;

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= K; j++) {
                    dp[i][j] = dp[i - 1][j];

                    if (j > 0 && A[i] > 0) {
                        dp[i][j] += dp[i][j - 1];
                        if (j - A[i] - 1 >= 0) {
                            dp[i][j] -= dp[i - 1][j - A[i] - 1];
                        }

                        dp[i][j] = (dp[i][j] + 1000000007) % 1000000007;
                    }
                }
            }

            System.out.println(dp[N][K]);
        }
    }

}
