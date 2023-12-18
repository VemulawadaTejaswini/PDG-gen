import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AizuMST1 solver = new AizuMST1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuMST1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            final int[][] g = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int w = in.nextInt();
                    g[i][j] = w;
                }
            }

            out.printf("%d\n", prims(g, 0));
        }

        private int prims(final int[][] g, final int s) {
            final int n = g.length;
            Set<Integer> visited = new HashSet<>();
            visited.add(s);

            Set<AizuMST1.Edge> mst = new HashSet<>();

            PriorityQueue<AizuMST1.Edge> pq = new PriorityQueue<>((x, y) -> Integer.compare(x.weight, y.weight));
            for (int i = 0; i < n; i++) {
                if (g[s][i] != -1) {
                    pq.add(new AizuMST1.Edge(s, i, g[s][i]));
                }
            }

            while (!pq.isEmpty()) {
                final AizuMST1.Edge e = pq.poll();

                if (visited.contains(e.to)) {
                    continue;
                }

                visited.add(e.to);
                for (int j = 0; j < n; j++) {
                    if (g[e.to][j] != -1) {
                        pq.add(new AizuMST1.Edge(e.to, j, g[e.to][j]));
                    }
                }
                mst.add(e);
            }

            int w = 0;
            for (final AizuMST1.Edge e : mst) {
                w += e.weight;
            }

            return w;
        }

        static class Edge {
            int from;
            int to;
            int weight;

            Edge(final int from, final int to, final int weight) {
                this.from = from;
                this.to = to;
                this.weight = weight;
            }


            public boolean equals(final Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                final AizuMST1.Edge edge = (AizuMST1.Edge) o;
                return from == edge.from &&
                        to == edge.to;
            }


            public int hashCode() {
                return Objects.hash(from, to);
            }

        }

    }
}


