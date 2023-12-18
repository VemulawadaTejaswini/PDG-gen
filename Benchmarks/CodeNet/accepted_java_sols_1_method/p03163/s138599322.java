import java.util.Scanner;

/**
 * Knapsack 1
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int W = sc.nextInt();

            long[][] dp = new long[N + 1][W + 1];

            for (int i = 1; i <= N; i++) {
                int w = sc.nextInt();
                int v = sc.nextInt();

                for (int j = 1; j <= W; j++) {
                    if (j < w) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
                    }
                }
            }

            System.out.println(dp[N][W]);
        }
    }

}
