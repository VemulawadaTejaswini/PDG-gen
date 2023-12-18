import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Dhanin Gupta
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDivGame solver = new DDivGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDivGame {
        public void solve(int testNumber, InputReader in, PrintWriter w) {
            long[] pr = new long[1000001];
            ArrayList<Long> al = new ArrayList<>();
            for (int i = 2; i * i <= 1000000; i++) {
                if (pr[i] == 0) {
                    for (int j = i * i; j <= 1000000; j += i) {
                        pr[j] = 1;
                    }
                }
            }

            for (int i = 2; i <= 1000000; i++) {
                if (pr[i] == 0)
                    al.add((long) i);
            }

            ArrayList<Long> al2 = new ArrayList<>();
            for (int i = 0; i < al.size(); i++) {
                for (long j = al.get(i); j <= 1000000000000l; j *= al.get(i)) {
                    al2.add(j);
                }
            }

            Collections.sort(al2);
            long n = in.nextLong();

            int ans = 0;
            //w.println(al2);
            for (int i = 0; i < al2.size(); i++) {
                long x = al2.get(i);
                if (n % x == 0) {
                    n /= x;
                    ans++;
                }

                if (n == 1)
                    break;
            }

            if (ans == 0) {
                if (n == 1)
                    w.println(0);
                else
                    w.println(1);
            } else {
                if (n > 1)
                    w.println(ans + 1);
                else
                    w.println(ans);

            }


        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

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

