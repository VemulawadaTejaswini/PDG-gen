import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "KharYusuf", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            DAlterAltar solver = new DAlterAltar();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DAlterAltar {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            char[] c = s.next().toCharArray();
            int ptr = n - 1;
            int ans = 0;
            bit b = new bit(n);
            for (int i = 0; i < n; i++) if (c[i] == 'R') b.modify(i, 1);
            for (int i = 0; i < n; i++) {
                if (c[i] == 'W' && b.query(i, n - 1) > 0) {
                    while (c[ptr] != 'R') ptr--;
                    c[ptr] = 'W';
                    c[i] = 'R';
                    ans++;
                    b.modify(ptr, -1);
                }
            }
            w.println(ans);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class bit {
        public int n;
        public int[] t;

        public bit(int n) {
            t = new int[n];
            this.n = n;
        }

        public bit(int[] a, int n) {
            t = new int[n];
            this.n = n;
            for (int i = 0; i < n; i++) {
                modify(i, a[i]);
            }
        }

        public void modify(int ind, int val) {
            for (; ind < n; ind |= ++ind) t[ind] += val;
        }

        public int query(int ind) {
            int sum = 0;
            for (; ind >= 0; ind &= ++ind, --ind) sum += t[ind];
            return sum;
        }

        public int query(int l, int r) {
            return query(r) - query(--l);
        }

    }
}

