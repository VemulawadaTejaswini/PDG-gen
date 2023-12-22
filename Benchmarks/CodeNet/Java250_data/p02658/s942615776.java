import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMultiplication2 solver = new BMultiplication2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMultiplication2 {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextArrLong(n);
            long res = 1;
            for (int i = 0; i < n; i++)
                if (a[i] == 0) {
                    out.println("0");
                    return;
                }
            for (int i = 0; i < n; i++) {
                try {
                    res = Math.multiplyExact(res, a[i]);
                    if (res > 1_000_000_000_000_000_000L) {
                        out.println("-1");
                        return;
                    }
                } catch (Exception e) {
                    out.println("-1");
                    return;
                }
            }
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextArrLong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < a.length; i++)
                a[i] = nextLong();
            return a;
        }

    }
}

