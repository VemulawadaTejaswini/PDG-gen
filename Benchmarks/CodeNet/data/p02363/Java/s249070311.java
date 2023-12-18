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
        int v = ni(), e = ni();
        int[][] dist = new int[v][v];
        for (int i = 0; i < v; i++) {
            Arrays.fill(dist[i], INF);
        }
        for (int i = 0; i < v; i++) {
            dist[i][i] = 0;
        }

        for (int i = 0; i < e; i++) {
            int s = ni(), t = ni(), d = ni();
            dist[s][t] = d;
        }

        warshallFloyd(dist);

        for (int i = 0; i < v; i++) {
            if (dist[i][i] < 0) {
                out.println("NEGATIVE CYCLE");
                return;
            }
        }

        int BIG = (int) 1e8;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (j > 0) out.print(" ");
                out.print(dist[i][j] > BIG ? "INF" : dist[i][j]);
            }
            out.println();
        }
    }

    int INF = Integer.MAX_VALUE / 3;
    void warshallFloyd(int[][] d) {
        int n = d.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
                }
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

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}