import java.util.Scanner;

public class Main {
    private static final int INF = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[m];
        for(int i = 0; i < m; i++) {
            coins[i] = sc.nextInt();
        }

        int[][] dp = new int[m][n + 1];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n + 1; j++) {
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n + 1; j++) {
                if(i > 0) dp[i][j] = dp[i - 1][j];
                if(j >= coins[i]) dp[i][j] = Math.min(dp[i][j], dp[i][j - coins[i]] + 1);
            }
        }

        System.out.println(dp[m - 1][n]);

        sc.close();
    }
}
