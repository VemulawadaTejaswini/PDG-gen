import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();
        int[][][] g = buildDirectedWeightedGraph(sc, v, e);
        long[] d = dijkstra(v, g, r);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v; i++) {
            sb.append(d[i] == Long.MAX_VALUE ? "INF" : d[i]).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

    public static int[][][] buildDirectedWeightedGraph(Scanner sc, int n, int m) {
        int[][][] graph = new int[n][][];
        int[][] edges = new int[m][3];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            edges[i][0] = a;
            edges[i][1] = b;
            edges[i][2] = c;
            deg[a]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]][2];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
            graph[a][--deg[a]] = new int[]{b, c};
        }

        return graph;
    }


    public static long[] dijkstra(int n, int[][][] graph, int s) {
        // {sからの最短距離, 頂点}
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>((x, y) -> Long.compare(x[0], y[0]));
        long[] d = new long[n]; // sからの最短距離
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0;
        pq.add(new long[] { 0, s });
        while (!pq.isEmpty()) {
            long[] a = pq.poll();
            int v = (int) a[1];
            if (d[v] < a[0])
                continue;
            for (int[] g : graph[v]) {
                int to = g[0];
                int cost = g[1];
                if (d[to] > d[v] + cost) {
                    d[to] = d[v] + cost;
                    pq.add(new long[] { d[to], to });
                }
            }
        }

        return d;
    }
}

