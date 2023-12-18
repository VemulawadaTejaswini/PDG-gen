import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        while (true) {
            int n = ni(), m = ni();

            if (n == 0 && m == 0) return;

            int[] h = nia(n);
            int[] w = nia(m);

            HashMap<Integer, Integer> hmap = new HashMap<>();
            HashMap<Integer, Integer> wmap = new HashMap<>();

            int[] hsum = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                hsum[i] = hsum[i - 1] + h[i - 1];
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int t = hsum[j] - hsum[i];
                    if (hmap.containsKey(t)) {
                        hmap.put(t, hmap.get(t) + 1);
                    } else {
                        hmap.put(t, 1);
                    }
                }
            }

            int[] wsum = new int[m + 1];
            for (int i = 1; i <= m; i++) {
                wsum[i] = wsum[i - 1] + w[i - 1];
            }
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j <= m; j++) {
                    int t = wsum[j] - wsum[i];
                    if (wmap.containsKey(t)) {
                        wmap.put(t, wmap.get(t) + 1);
                    } else {
                        wmap.put(t, 1);
                    }
                }
            }

            long ans = 0;
            Set<Integer> set = hmap.keySet();
            for (int x : set) {
                if (wmap.containsKey(x)) {
                    ans += hmap.get(x) * wmap.get(x);
                }
            }

            out.println(ans);
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