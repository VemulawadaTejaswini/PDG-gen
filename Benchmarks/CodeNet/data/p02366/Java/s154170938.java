import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    void solve() throws IOException {
        int n = ni(), m = ni();
        ArticulationPoints ap = new ArticulationPoints(n);

        for (int i = 0; i < m; i++) {
            int s = ni(), t = ni();
            ap.addEdge(s, t);
        }

        ArrayList<Integer> points = ap.findArticulationPoints();
        for (int i = 0; i < points.size(); i++) {
            out.println(points.get(i));
        }
    }

    // http://judge.u-aizu.ac.jp/onlinejudge/commentary.jsp?id=GRL_3_A
    class ArticulationPoints {
        int n;
        ArrayList<Integer>[] graph;
        int[] prenum;
        int[] lowest;
        boolean[] visited;
        int timer = 1;
        ArrayList<Integer> points;

        ArticulationPoints(int n) {
            this.n = n;
            graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<Integer>();
            }
            prenum = new int[n];
            lowest = new int[n];
            visited = new boolean[n];
        }

        void addEdge(int from, int to) {
            graph[from].add(to);
            graph[to].add(from);
        }

        ArrayList<Integer> findArticulationPoints() {
            Arrays.fill(visited, false);
            int root = 0;
            points = new ArrayList<>();

            dfs(root, -1);
            Collections.sort(points);

            return points;
        }

        void dfs(int u, int prev) {
            prenum[u] = timer;
            lowest[u] = timer;
            timer++;

            visited[u] = true;

            int cnt = 0;
            boolean isArticulation = false;
            for (int v : graph[u]) {
                if (!visited[v]) {
                    cnt++;
                    dfs(v, u);
                    if (prev != -1 && prenum[u] <= lowest[v]) isArticulation = true;
                    lowest[u] = Math.min(lowest[u], lowest[v]);
                } else if (v != prev) {
                    lowest[u] = Math.min(lowest[u], prenum[v]);
                }
            }

            if (prev == -1 && cnt >= 2) isArticulation = true;

            if (isArticulation) points.add(u);
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