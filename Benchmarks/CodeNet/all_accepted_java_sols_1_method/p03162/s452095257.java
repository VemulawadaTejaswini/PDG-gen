import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arya = new int[n];
        int[] aryb = new int[n];
        int[] aryc = new int[n];
        for(int i = 0; i < n; i++) {
            arya[i] = Integer.parseInt(sc.next());
            aryb[i] = Integer.parseInt(sc.next());
            aryc[i] = Integer.parseInt(sc.next());
        }
        long[][] dp = new long[n + 1][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == k) {
                        continue;
                    }
                    long temp = 0;
                    if (k == 0) {
                        temp = arya[i];
                    } else if (k == 1) {
                        temp = aryb[i];
                    } else {
                        temp = aryc[i];
                    }
                    dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + temp);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = Math.max(ans, dp[n][i]);
        }
        System.out.println(ans);
    }
}