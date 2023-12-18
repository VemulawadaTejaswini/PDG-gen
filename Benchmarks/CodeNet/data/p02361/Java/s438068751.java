import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int v = ni();
        int e = ni();
        int r = ni();

        int INF = Integer.MAX_VALUE / 3;

        ArrayList<ArrayList<Edge>> G = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            G.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int s = ni();
            int t = ni();
            int d = ni();

            G.get(s).add(new Edge(t, d));
        }

        Dijkstra dijk = new Dijkstra(G);
        int[] dist = dijk.getDist(r);

        for (int i = 0; i < v; i++) {
            out.println(dist[i] == INF ? "INF" : dist[i]);
        }
    }

    class Dijkstra {
        int n;
        ArrayList<ArrayList<Edge>> G;

        int INF = Integer.MAX_VALUE / 3;

        public Dijkstra(ArrayList<ArrayList<Edge>> G) {
            n = G.size();
            this.G = G;
        }

        int[] getDist(int s) {
            java.util.PriorityQueue<Pair> Q = new java.util.PriorityQueue<>();
            Q.add(new Pair(s, 0));
            int[] dist = new int[n];
            Arrays.fill(dist, INF);
            boolean[] used = new boolean[n];
            while (!Q.isEmpty()) {
                Pair p = Q.poll();
                if (used[p.x]) continue;
                used[p.x] = true;
                dist[p.x] = p.y;

                for (Edge e : G.get(p.x)) {
                    Q.add(new Pair(e.to, p.y + e.cost));
                }
            }
            return dist;
        }

        public class Pair implements Comparable<Pair> {
        	int x, y;

        	public Pair(int x, int y) {
        		this.x = x;
        		this.y = y;
        	}

        	public int compareTo(Pair p) {
        		return y - p.y;
        	}
        }
    }

    class Edge implements Comparable<Edge> {
        int to;
        int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        public int compareTo(Edge edge) {
            return cost - edge.cost;
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

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}