
import java.util.Scanner;

public class Main {

    static int rmax = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        int[][] item = new int[r][c];
        for (int i = 0; i < k; i++) {
            int rk = Integer.parseInt(scan.next());
            int ck = Integer.parseInt(scan.next());
            int vk = Integer.parseInt(scan.next());
            rk--;
            ck--;
            item[rk][ck] = vk;
        }
        scan.close();

        long[][][] dp = new long[r][c][rmax + 1];
        if (item[0][0] != 0) {
            dp[0][0][1] = item[0][0];
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int l = 0; l <= rmax; l++) {
                    // 下方向への移動
                    if (i + 1 < r) {
                        dp[i + 1][j][1] = Math.max(dp[i + 1][j][1], dp[i][j][l] + item[i + 1][j]);
                        dp[i + 1][j][0] = Math.max(dp[i + 1][j][0], dp[i][j][l]);
                    }
                    // 右方向への移動
                    if (j + 1 < c) {
                        if (l < rmax) {
                            dp[i][j + 1][l + 1] = Math.max(dp[i][j + 1][l + 1], dp[i][j][l] + item[i][j + 1]);
                        }
                        dp[i][j + 1][l] = Math.max(dp[i][j + 1][l], dp[i][j][l]);
                    }
                }
            }
        }

        long ans = 0;
        for (int l = 0; l < rmax; l++) {
            ans = Math.max(ans, dp[r - 1][c - 1][l]);
        }
        System.out.println(ans);
    }
}
