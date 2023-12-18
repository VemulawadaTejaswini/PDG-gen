import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        long[] wary = new long[n];
        long[] vary = new long[n];
        for (int i = 0; i < n; i++) {
            wary[i] = Long.parseLong(sc.next());
            vary[i] = Long.parseLong(sc.next());
        }
        long[][] dp = new long[n + 1][w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (j < wary[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][(int) (j - wary[i])] + vary[i]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}