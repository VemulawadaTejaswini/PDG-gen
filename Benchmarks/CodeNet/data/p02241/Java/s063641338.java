import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            Kruskal ksk = new Kruskal(N);

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    int w = in.nextInt();
                    if (w >= 0) ksk.addEdge(i, j, w);
                }
            }

            ksk.setMST();
            out.println(ksk.getTotalCost());
        }
    }

    static class Kruskal {
        private int totalCost;

        private UnionFind uf;
        private List<Edge> edges;
        private List<Edge> mst;

        public Kruskal(int n) {
            this.totalCost = 0;
            this.uf = new UnionFind(n);
            this.edges = new ArrayList<>();
            this.mst = new ArrayList<>();
        }

        public void setMST() {
            Collections.sort(edges);
            for (Edge e : edges) {
                if (!uf.same(e.src, e.dest)) {
                    uf.unite(e.src, e.dest);
                    totalCost += e.weight;
                    mst.add(e);
                }
            }
        }

        public int getTotalCost() {
            return totalCost;
        }

        public List<Edge> getEdges() {
            return mst;
        }

        public void addEdge(int u, int v, int w) {
            edges.add(new Edge(u, v, w));
        }

        public class Edge implements Comparable<Edge> {
            private int src;
            private int dest;
            private int weight;

            public Edge(int s, int d, int w) {
                this.src = s;
                this.dest = d;
                this.weight = w;
            }

            @Override
            public int compareTo(Edge e) {
                return this.weight - e.weight;
            }
        }

        private class UnionFind {
            private int[] rank, parent;

            public UnionFind(int size) {
                this.rank = new int[size];
                this.parent = new int[size];
                for (int i = 0; i < size; ++i) {
                    parent[i] = i;
                    rank[i] = 0;
                }
            }

            public boolean same(int x, int y) {
                return root(x) == root(y);
            }

            public void unite(int x, int y) {
                int a = root(x);
                int b = root(y);

                if (rank[a] < rank[b]) {
                    int tmp = a;
                    a = b;
                    b = tmp;
                }

                parent[b] = a;
                if (rank[a] == rank[b])
                    rank[a]++;
            }

            public int root(int x) {
                if (parent[x] != x) {
                    parent[x] = root(parent[x]);
                }
                return parent[x];
            }
        }
    }
    static class InputReader {
        static int BUFSIZE = 32768;

        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), BUFSIZE);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
