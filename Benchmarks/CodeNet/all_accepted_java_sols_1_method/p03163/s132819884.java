import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxW = scanner.nextInt();

        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }

        long[][] dp = new long[n + 1][maxW + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < maxW + 1; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < maxW + 1; j++) {
                if (j - w[i] >= 0) {
                    dp[i + 1][j] = dp[i][j - w[i]] + v[i];
                }
                dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
            }
        }

        System.out.println(dp[n][maxW]);
    }
}