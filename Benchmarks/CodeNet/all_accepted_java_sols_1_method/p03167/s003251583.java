import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000000 + 7;
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int w = std.nextInt();
        int[][] dp = new int[h][w];

        int[][] table = new int[h][w];
        for (int i = 0; i < h; i++) {
            String text = std.next();
            for (int j = 0; j < text.length(); j++) {
                int p = (text.charAt(j) == '.') ? 0 : -1;
                table[i][j] = p;
            }
        }

        dp[0][0] = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j != w - 1) {
                    if (table[i][j + 1] != -1) {
                        dp[i][j + 1] += dp[i][j];
                        dp[i][j + 1] %= mod;
                    }
                }

                if (i != h - 1) {
                    if (table[i + 1][j] != -1) {
                        dp[i + 1][j] += dp[i][j];
                        dp[i + 1][j] %= mod;
                    }
                }
            }
        }

        System.out.println(dp[h-1][w-1]);
    }
}
