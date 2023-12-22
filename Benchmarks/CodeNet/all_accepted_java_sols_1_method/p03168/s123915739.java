import java.util.Scanner;

/**
 * Coins
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            double[] P = new double[N + 1];
            for (int i = 1; i <= N; i++) {
                P[i] = sc.nextDouble();
            }

            double[][] dp = new double[N + 1][N + 1];
            dp[0][0] = 1;

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= i; j++) {
                    dp[i][j] = dp[i - 1][j] * (1 - P[i]);
                    if (j > 0) {
                        dp[i][j] += dp[i - 1][j - 1] * P[i];
                    }
                }
            }

            double sum = 0;
            for (int i = N / 2 + 1; i <= N; i++) {
                sum += dp[N][i];
            }

            System.out.println(sum);
        }
    }

}
