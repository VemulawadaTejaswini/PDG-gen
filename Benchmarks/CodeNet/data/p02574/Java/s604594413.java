import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
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
            ECoprime solver = new ECoprime();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class ECoprime {
        final int MX = (int) 1e6 + 10;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            ArrayList<Integer>[] pr = new ArrayList[MX];
            boolean[] done = new boolean[MX];
            for (int i = 0; i < MX; i++) pr[i] = new ArrayList<>();
            for (int i = 2; i < MX; i++) {
                if (!done[i])
                    for (int j = i; j < MX; j += i) {
                        done[j] = true;
                        pr[j].add(i);
                    }
            }
            done = new boolean[MX];
            int n = s.nextInt();
            boolean pair = true;
            int gcd = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                for (int j : pr[x]) {
                    if (done[j]) pair = false;
                    done[j] = true;
                }
                gcd = func.gcd(x, gcd);
            }
            if (pair) w.println("pairwise coprime");
            else if (gcd == 1) w.println("setwise coprime");
            else w.println("not coprime");
        }

    }

    static class func {
        public static int gcd(int a, int b) {
            int t;
            while (b != 0) {
                t = b;
                b = a % b;
                a = t;
            }
            return a;
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

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

