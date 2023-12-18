import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    void solve() throws IOException {
        int n = ni();
        int m = ni();

        Kruskal kr = new Kruskal(n);
        for (int i = 0; i < m; i++) {
            int from = ni(), to = ni(), cost = ni();
            kr.addEdge(from, to, cost);
        }

        out.println(kr.computeCost());
    }

    class Kruskal {
        int n;
        ArrayList<Edge> graph = new ArrayList<>();

        Kruskal(int n) {
            this.n = n;
        }

        void addEdge(int from, int to, int cost) {
            graph.add(new Edge(from, to, cost));
        }

        long computeCost() {
            Collections.sort(graph);

            long cost = 0;
            UnionFind uf = new UnionFind(n);

            for (Edge e : graph) {
                int from = e.from;
                int to = e.to;

                if (!uf.isConnected(from, to)) {
                    cost += e.cost;
                    uf.union(from, to);
                }
            }

            return cost;
        }

        class Edge implements Comparable<Edge> {
            int from, to;
            int cost;

            Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }

            public int compareTo(Edge edge) {
                return cost - edge.cost;
            }
        }

        class UnionFind {
            private int[] parent;

            UnionFind(int size) {
                parent = new int[size];
                Arrays.fill(parent, -1);
            }

            public boolean union(int x, int y) {
                x = root(x);
                y = root(y);
                if (x != y) {
                    if (parent[y] < parent[x]) {
                        int tmp = y;
                        y = x;
                        x = tmp;
                    }
                    parent[x] += parent[y];
                    parent[y] = x;
                    return true;
                }
                return false;
            }

            public boolean isConnected(int x, int y) {
                return root(x) == root(y);
            }

            public int root(int x) {
                return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
            }
        }
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}