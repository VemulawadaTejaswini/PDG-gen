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
        CMultiplication3 solver = new CMultiplication3();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMultiplication3 {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            long a = in.nextLong();
            String bRaw = in.next();
            String[] parts = bRaw.split("\\.");
            long part2 = parts.length == 1 ? 0 : Integer.parseInt(parts[1]);
            long b = Integer.parseInt(parts[0]) * 100 + part2;
            out.println(((a * b) / 100));
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

