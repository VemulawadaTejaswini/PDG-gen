import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int[][] dis;
    static int[][] dp;
    static int rs[];
    static int n;
    static final int INF = 1 << 28;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            if (n == 0)
                break;
            Map<String, Integer> item = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                for (int j = 0; j < k; j++) {
                    String name = sc.next();
                    int value = sc.nextInt();
                    if (!item.containsKey(name)) {
                        item.put(name, value);
                    } else {
                        if (value < item.get(name)) {
                            item.put(name, value);
                        }
                    }
                }

            }
            int q = sc.nextInt();
            boolean imp = false;
            String[] list = new String[q];
            for (int i = 0; i < q; i++) {
                list[i] = sc.next();
                if (!item.containsKey(list[i])) {
                    imp = true;
                    break;
                }
            }
            if (imp) {
                System.out.println("impossible");
                break;
            }
            int m = sc.nextInt();
            dis = new int[n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dis[i], INF);
                dis[i][i] = 0;
            }
            for (int i = 0; i < m; i++) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                int d = sc.nextInt();
                dis[s][t] = dis[t][s] = d;
            }
            dp = new int[1 << (n + 1)][n + 1];
            for (int i = 0; i < 1 << (n + 1); i++) {
                Arrays.fill(dp[i], -1);
            }
            int sum = 0;
            for (int i = 0; i < q; i++) {
                sum += item.get(list[i]);
            }
            int dis = tsp(0, 0);
            System.out.println(sum + " " + dis);
        }
    }

    public static int tsp(int S, int v) { // S:既に訪れた頂点、v:現在いる頂点
        if (dp[S][v] >= 0) {
            return dp[S][v];
        }
        if (S == (1 << n) - 1 && v == 0) {
            return dp[S][v] = 0;
        }
        int res = INF;
        for (int u = 0; u < n; u++) {
            if ((S & (1 << u)) == 0) {
                res = Math.min(res, tsp(S | 1 << u, u) + dis[v][u]);
            }
        }
        return dp[S][v] = res;
    }
}