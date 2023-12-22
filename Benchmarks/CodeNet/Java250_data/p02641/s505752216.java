import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CForbiddenList solver = new CForbiddenList();
        solver.solve(1, in, out);
        out.close();
    }

    static class CForbiddenList {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.readInt();
            int n = in.readInt();
            boolean[] a = new boolean[201];

            for (int i = 0; i < n; i++)
                a[in.readInt()] = true;

            int min = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = -100; i <= 200; i++) {
                if (i >= 0 && a[i])
                    continue;

                if (min > Math.abs(x - i)) {
                    min = Math.abs(x - i);
                    ans = i;
                }

            }

            System.out.println(ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

