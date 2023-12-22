import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxW = sc.nextInt();

        long[][] dp = new long[n + 1][maxW + 1];

        for (int i = 1; i <= n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            dp[i] = dp[i - 1].clone();
            for (int j = 0; j <= maxW - w; j++) {
                if (dp[i - 1][j + w] == 0) {
                    dp[i][j + w] = dp[i - 1][j] + v;
                } else {
                    dp[i][j + w] = Math.max(dp[i - 1][j + w], dp[i - 1][j] + v);
                }
            }
        }

        System.out.println(dp[n][maxW]);
    }
}