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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC130C solver = new ABC130C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC130C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int W = in.Int();
            int H = in.Int();
            int x = in.Int();
            int y = in.Int();


            StringBuilder sb = new StringBuilder();
            sb.append((long) W * H / 2.0).append(' ');
            if (x == W / 2.0 && y == H / 2.0) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            out.println(sb.toString());
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

