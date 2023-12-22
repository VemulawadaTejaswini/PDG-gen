import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABlackjack solver = new ABlackjack();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABlackjack {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] ints = in.nextIntArray(3);
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum >= 22) {
                out.println("bust");
            } else {
                out.println("win");
            }
        }

    }

    static class InputReader {
        private StringTokenizer st;
        private BufferedReader reader;

        public InputReader(InputStream is) {
            st = null;
            reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is, 1 << 18)));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; ++i) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }
}

