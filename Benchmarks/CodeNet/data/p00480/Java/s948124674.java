import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n][21];
        dp[0][sc.nextInt()] = 1;
        for (int i = 1; i < n - 1; i++) {
            int x = sc.nextInt();
            for (int j = 0; j + x <= 20; j++) {
                dp[i][j + x] += dp[i - 1][j];
            }
            for (int j = 20; j - x >= 0; j--) {
                dp[i][j - x] += dp[i - 1][j];
            }
        }
        int ans = sc.nextInt();
        System.out.println(dp[n - 2][ans]);
    }
}

