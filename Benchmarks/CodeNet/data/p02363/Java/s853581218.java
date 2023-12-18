import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, m;
    long[][] graph;
    final long INF = Long.MAX_VALUE;

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
        for (int i = 0; i < n; i++)
            Arrays.fill(graph[i], INF);
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            long cost = sc.nextLong();
            graph[from][to] = cost;
        }
    }

    void solve() {
        long[][] anss = new long[n][n];
        long[] dist = new long[n];

        for (int start = 0; start < n; start++) {
            Arrays.fill(dist, INF);
            dist[start] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (dist[j] != INF &&
                                graph[j][k] != INF &&
                                dist[k] > dist[j] + graph[j][k]) {
                            dist[k] = dist[j] + graph[j][k];
                            if (i == n - 1) {
                                System.out.println("NEGATIVE CYCLE");
                                return;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                anss[start][i] = dist[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (anss[i][j] == INF)
                    sb.append("INF ");
                else
                    sb.append(anss[i][j]+ " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

}