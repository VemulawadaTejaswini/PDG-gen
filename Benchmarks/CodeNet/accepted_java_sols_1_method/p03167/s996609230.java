import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int mod = 1000000007;
        boolean[][] a = new boolean[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            String s = sc.next();
            for (int j = 1; j <= w; j++) {
                if ('.' == s.charAt(j - 1)) {
                    a[i][j] = true;
                }
            }
        }
        long[][] dp = new long[h + 1][w + 1];

        dp[1][1] = 1;
        for (int i = 2; i <= w; i++) {
            if (a[1][i]) {
                dp[1][i] = dp[1][i - 1];
            }
        }

        for (int i = 2; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (a[i][j]) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    if (dp[i][j] >= mod) {
                        dp[i][j] = dp[i][j] - mod;
                    }
                }
            }
        }

        System.out.println(dp[h][w]);
    }
}
