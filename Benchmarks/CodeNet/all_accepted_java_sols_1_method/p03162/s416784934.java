import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] h = new int[n][3];
        int[][] dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                h[i][j] = sc.nextInt();
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        dp[0][0] = h[0][0];
        dp[0][1] = h[0][1];
        dp[0][2] = h[0][2];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k != j) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + h[i][j]);
                    }
                }
            }
        }

        int max = Math.max(dp[n - 1][0], dp[n - 1][1]);
        System.out.println(Math.max(max, dp[n - 1][2]));

    }
}
