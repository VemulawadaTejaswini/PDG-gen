import java.util.Scanner;

public class Main {
    int n, w;
    Item[] is;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        is = new Item[n];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            is[i] = new Item(w, v);
        }
    }

    void solve() {
        int[][] dp = new int[n+1][w+1];
        for (int i = 1; i < n+1; i++) {
            int w = is[i-1].w;
            int v = is[i-1].c;
            for (int j = 0; j < this.w+1; j++) {
                if (j - w < 0)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i][j-w]+v,
                            Math.max(dp[i-1][j], dp[i-1][j-w]+v));
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < w + 1; i++) {
            ans = ans > dp[n][i] ? ans : dp[n][i];
        }
        System.out.println(ans);
    }

    private class Item {
        int w, c;
        Item(int w, int c) {
            this.w = w;
            this.c = c;
        }
    }
}