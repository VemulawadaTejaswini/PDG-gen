import java.util.*;

public class Main {
    private static int INF = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] s = new char[H][W];
        for (int i = 0; i < H; i++) {
            String S = sc.next();
            for (int j = 0; j < W; j++) {
                s[i][j] = S.charAt(j);
            }
        }

        int[][] dp = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp[i][j] = INF;
            }
        }

        dp[0][0] = s[0][0] == '.' ? 0 : 1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                // right
                if (j < W-1) {
                    int nextVal = dp[i][j];
                    if (s[i][j] == '.' && s[i][j+1] == '#') {
                        nextVal++;
                    }
                    dp[i][j+1] = Math.min(dp[i][j+1], nextVal);
                }
                // down
                if (i < H-1) {
                    int nextVal = dp[i][j];
                    if (s[i][j] == '.' && s[i+1][j] == '#') {
                        nextVal++;
                    }
                    dp[i+1][j] = Math.min(dp[i+1][j], nextVal);
                }
            }
        }

        System.out.println(dp[H-1][W-1]);
    }
}

