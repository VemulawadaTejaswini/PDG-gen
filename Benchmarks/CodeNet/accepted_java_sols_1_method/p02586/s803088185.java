import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int kk = scan.nextInt();
        int[][] a = new int[n + 1][m + 1];
        for (int i = 1; i <= kk; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int val = scan.nextInt();
            a[x][y] = val;
        }
        long[][][] dp = new long[2][m + 1][4];
        int x = 1;
        for (int i = 1; i <= n; i++) {
            int pre = 1 ^ x;
            for (int j = 1; j <= m; j++) {
                dp[x][j][0] = dp[pre][j][3];
                for (int k = 1; k <= 3; k++) {
                    long tmp = dp[pre][j][3] + a[i][j];
                    tmp = Math.max(tmp, dp[x][j - 1][k]);
                    tmp = Math.max(tmp, dp[x][j - 1][k - 1] + a[i][j]);
                    dp[x][j][k] = tmp;
                }
            }
            x = pre;
        }
        System.out.println(dp[1 ^ x][m][3]);
    }
}
