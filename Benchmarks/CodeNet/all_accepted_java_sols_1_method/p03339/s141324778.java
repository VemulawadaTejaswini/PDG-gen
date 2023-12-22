import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();

        int[][] dp = new int[n + 1][2];
        Arrays.fill(dp[0], Integer.MAX_VALUE);
        Arrays.fill(dp[1], Integer.MAX_VALUE);
        dp[0][0] = 0;
        dp[n][1] = 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                char leftC = s.charAt(i - 1);
                if (leftC == 'W') {
                    dp[i][0] = dp[i - 1][0] + 1;
                } else {
                    dp[i][0] = dp[i - 1][0];
                }
            }
        }
        
        for (int i = n - 1; i >= 0; i--) {
            char rightC = s.charAt(i);
            if (rightC == 'E') {
                dp[i][1] = dp[i + 1][1] + 1;
            } else {
                dp[i][1] = dp[i + 1][1];
            }
        }

        for (int i = 0; i <= n; i++) {
            ans = Math.min(dp[i][0] + dp[i][1], ans);
        }

        System.out.println(ans);
    }
}