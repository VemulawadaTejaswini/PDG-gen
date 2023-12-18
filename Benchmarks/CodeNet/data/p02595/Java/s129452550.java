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
 *
 * @author HussienMoustafa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BDistanceEditorial solver = new BDistanceEditorial();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDistanceEditorial {
        public void solve(int testNumber, Scanner s, PrintWriter out) {
            int n = s.nextInt(), d = s.nextInt(), cnt = 0;
            while (n-- != 0) {
                int x = s.nextInt(), y = s.nextInt();

                if ((int) Math.sqrt((int) Math.pow(x, 2) + (int) Math.pow(y, 2)) <= d) {
                    cnt++;
                }

            }
            out.println(cnt);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
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

