import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int n, m, start;
    ArrayList<ArrayList<Edge>> es;

    public static void main(String[] args) {
        Main prob = new Main();
        prob.read();
        prob.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();
        es = new ArrayList<ArrayList<Edge>>(n);
        for (int i = 0; i < n; i++) {
            es.add(new ArrayList<Edge>());
        }
        for (int i = 0; i < m; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt();
            es.get(f).add(new Edge(t, c));
        }
    }

    void solve() {
        boolean[] used = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int count = 0;
        dist[start] = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0 ; i < n; i++) {
                for (Edge e: es.get(i)) {
                    if (dist[i] != Integer.MAX_VALUE
                            && dist[e.to] > dist[i] + e.cost) {
                        dist[e.to] = dist[i] + e.cost;
                        if (j == n - 1) {
                            System.out.println("NEGATIVE CYCLE");
                            return;
                        }
                    }
                }
            }
        }

        for (int d: dist) {
            if (d == Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(d);
        }
    }

    private class Edge {
        int to, cost;
        Edge(int t, int c) {
            to = t; cost = c;
        }
    }
}