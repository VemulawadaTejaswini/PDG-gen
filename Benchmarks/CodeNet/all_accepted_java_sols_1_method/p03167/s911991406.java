import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        char[][] map = new char[H][W];
        int mod = 1_000_000_007;
        for (int i=0;i<H;i++) {
            String S = sc.next();
            for (int j=0;j<W;j++) {
                map[i][j] = S.charAt(j);
            }
        }

        long[][] dp = new long[H+1][W+1];
        dp[1][1] = 1;
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                if (!(i==0 && j==0) && map[i][j]=='.') {
                    dp[i+1][j+1] = (dp[i][j+1]+dp[i+1][j])%mod;
                }
            }
        }
        System.out.println(dp[H][W]);
    }
}