
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int n, m;
    long[][] graph;
    final long INF = 1000000000L;

    public static void main(String[] args) {
        Main prob = new Main();
        prob.read();
        prob.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new long[n][n];
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            long cost = sc.nextLong();
            graph[from][to] = cost;
        }
    }

    void solve() {
        long[][] dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = graph[i][j] == 0 ? INF : graph[i][j];
                if (i == j)
                    dp[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    dp[j][k] = Math.min(dp[j][k], dp[j][i] + dp[i][k]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dp[i][i] < 0) {
                System.out.println("NEGATIVE CYCLE");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] != INF)
                    sb.append(dp[i][j] +  " ");
                else
                    sb.append("INF ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        System.out.print(sb.toString());

    }

}