
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DijkstraVerify solver = new DijkstraVerify();
        solver.solve(1, in, out);
        out.close();
    }

    static class DijkstraVerify {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int source = in.nextInt();
            Graph g = new Graph(n);
            for (int i = 0; i < m; i++) {
                g.addEdge(new Edge(in.nextInt(), in.nextInt(), in.nextInt()));
            }
            long[] d = g.dijkstra(source);
            for (int i = 0; i < n; i++) {
                if (d[i] > 1e15) out.println("INF");
                else out.println(d[i]);
            }
        }

    }

    static class Graph {
        public int size;
        public ArrayList<Edge>[] adj;
        public int[] inDeg;
        public int[] vertexCost;

        @SuppressWarnings("unchecked")
        public Graph(int size) {
            this.size = size;
            adj = new ArrayList[size];
            inDeg = new int[size];
            vertexCost = new int[size];
            for (int i = 0; i < size; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
            inDeg[e.to]++;
        }

        public long[] dijkstra(int from) {
            long[] d = new long[size];
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(e -> d[e]));
            for (int i = 0; i < size; i++) {
                d[i] = (i == from) ? 0 : (long) 1e18;
                pq.add(i);
            }
            // System.out.println(Arrays.toString(pq.toArray()));
            while (!pq.isEmpty()) {
                int search = pq.poll();
                // System.out.println("now: " + search);
                ArrayList<Edge> edges = adj[search];
                for (Edge e : edges) {
                    // System.out.println(e.toString());
                    long cmp = d[search] + e.cost;
                    if (d[e.to] > d[search] + e.cost) {
                        // 更新が入る
                        // 処理を入れたい場合はここに入れる
                        d[e.to] = d[search] + e.cost;
                        pq.add(e.to);
                    }
                }
                //  System.out.println(Arrays.toString(pq.toArray()));
            }
            return d;
        }

    }

    static class Edge {
        public int from;
        public int to;
        public long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }
}


