import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBrickBreak solver = new DBrickBreak();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBrickBreak {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int[] arr = s.nextIntArray(n);
            HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                TreeSet<Integer> list = map.getOrDefault(arr[i], new TreeSet<>());
                list.add(i);
                map.put(arr[i], list);
            }


            int ans = 0;
            boolean ok = true;
            int prev = -1;
            for (int i = 1; i <= n; i++) {
                if (!map.containsKey(i)) {
                    ans = i;
                    ok = false;
                    break;
                } else {
                    TreeSet<Integer> set = map.get(i);
                    if (prev == -1) {
                        prev = set.first();
                    } else {
                        if (set.higher(prev) == null) {
                            ans = i;
                            ok = false;
                            break;
                        } else {
                            prev = set.higher(prev);
                        }
                    }
                }
            }

            if (!ok) {
                if (ans == 1) {
                    out.println(-1);
                } else {
                    out.println(n + 1 - ans);
                }
            } else {
                out.println(0);
            }
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
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

