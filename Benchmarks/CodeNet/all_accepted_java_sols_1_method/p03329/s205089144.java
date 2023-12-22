import java.util.Scanner;

public class Main {
    static int[][] dp;
    static int[] yen = new int[]{6, 36, 216, 36 * 36, 36 * 36 * 6, 216*216, 9, 81, 729, 81 * 81, 81 * 729, 729* 729};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dp = new int[yen.length + 1][100001];

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }

        for (int i = 0; i < yen.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j - yen[i] >= 0) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j - yen[i]] + 1, dp[i][j]);
                }
                else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }
        System.out.println(dp[dp.length - 1][n]);
    }
}