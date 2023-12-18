
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, m;
    int[] ns;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ns = new int[m];
        for (int i = 0; i < m; i++)
            ns[i] = sc.nextInt();
    }

    void solve() {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++)
            Arrays.fill(dp[i], 10000001);
        dp[0][0] = 0;
        for (int i = 1; i < m + 1; i++) {
            int trg = ns[i-1];
            for (int j = 0; j < n + 1; j++) {
                if (j - trg >= 0)
                dp[i][j] = Math.min(dp[i-1][j-trg]+1,
                        Math.min(dp[i-1][j], dp[i][j-trg]+1));
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[m][n]);
    }
}