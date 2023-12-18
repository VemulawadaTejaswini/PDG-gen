
import java.util.Scanner;

public class Main {

    static int inf = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.next());
        int e = Integer.parseInt(scan.next());
        int[][] dist = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                dist[i][j] = inf;
            }
        }
        for (int i = 0; i < e; i++) {
            int s = Integer.parseInt(scan.next());
            int t = Integer.parseInt(scan.next());
            int d = Integer.parseInt(scan.next());
            dist[s][t] = d;
        }
        scan.close();

        int[][] dp = new int[1 << v][v];
        for (int i = 0; i < (1 << v); i++) {
            for (int j = 0; j < v; j++) {
                dp[i][j] = inf;
            }
        }
        dp[1][0] = 0;

        for (int i = 0; i < (1 << v); i++) {
            for (int j = 0; j < v; j++) {
                if (dp[i][j] == inf) {
                    continue;
                }

                for (int k = 0; k < v; k++) {
                    if ((i & (1 << k)) != 0) {
                        continue;
                    }

                    if (dist[j][k] == inf) {
                        continue;
                    }
                    int nextI = i | (1 << k);
                    dp[nextI][k] = Math.min(dp[nextI][k], dp[i][j] + dist[j][k]);
                }
            }
        }

        int ans = inf;
        for (int i = 0; i < v; i++) {
            if (dp[(1 << v) - 1][i] == inf) {
                continue;
            }
            if (dist[i][0] == inf) {
                continue;
            }
            int result = dp[(1 << v) - 1][i] + dist[i][0];
            ans = Math.min(ans, result);
        }

        if (ans == inf) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }

    }

}

