import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A_TakahashikunTheStrider solver = new A_TakahashikunTheStrider();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_TakahashikunTheStrider {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            double alpha = in.nextInt() * Math.PI / 180.0;
            double c = Math.cos(alpha);
            double s = Math.sin(alpha);
            double x = 0;
            double y = 0;
            double vx = 0;
            double vy = 1;
            int ans = 0;
            final double eps = 1e-10;
            do {
                x += vx;
                y += vy;
                double nvx = vx * c - vy * s;
                double nvy = vx * s + vy * c;
                vx = nvx;
                vy = nvy;
                ++ans;
            } while (Math.abs(x) > eps || Math.abs(y) > eps);
            out.println(ans);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

