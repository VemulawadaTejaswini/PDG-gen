import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int[] dp1 = new int[1000001];
        int[] dp2 = new int[1000001];
        for (int i = 1; i <= 1000000; i++) {
            dp1[i] = dp2[i] = i;
        }

        for (int i = 2; i < 200; i++) {
            int t = i * (i + 1) * (i + 2) / 6;

            if (t > 1000000) {
                break;
            }

            for (int j = t; j <= 1000000; j++) {
                dp1[j] = Math.min(dp1[j], dp1[j - t] + 1);
                if (t % 2 == 1) {
                    dp2[j] = Math.min(dp2[j], dp2[j - t] + 1);
                }
            }
        }

        while (true) {
            int n = ni();

            if (n == 0) return;

            out.println(dp1[n] + " " + dp2[n]);
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