import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, m, k;
    Node[][] graph;
    int[][] minTimes;
    int[][] minCosts;
    int[] qa, qb, qc;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        graph = new Node[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int cost = sc.nextInt();
            int time = sc.nextInt();
            Node n = new Node(time, cost);
            graph[a][b] = n;
            graph[b][a] =n;
        }
        minTimes = new int[n][n];
        minCosts = new int[n][n];
        k = sc.nextInt();
        qa = new int[k]; qb = new int[k]; qc = new int[k];
        for (int i = 0; i < k; i++) {
            qa[i] = sc.nextInt() - 1;
            qb[i] = sc.nextInt() - 1;
            qc[i] = sc.nextInt();
        }
    }

    private void solve() {
        makeTable(minCosts, true);
        makeTable(minTimes, false);
        int[][] ptr;
        for (int i = 0; i < k; i++) {
            ptr = qc[i] == 0 ? minCosts : minTimes;
            System.out.println(ptr[qa[i]][qb[i]]);
        }
    }

    private void makeTable(int[][] dp, boolean flg) {
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], 100001);
            dp[i][i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] != null) {
                    dp[i][j] = flg ? graph[i][j].cost : graph[i][j].time;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                        dp[j][k] = Math.min(dp[j][k], dp[j][i] + dp[i][k]);
                }
            }
        }
    }

    private class Node {
        int time, cost;
        Node (int time, int cost) {
            this.time = time;
            this.cost = cost;
        }
    }
}