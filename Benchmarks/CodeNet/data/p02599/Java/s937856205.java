import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pranay2516
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt(), q = in.nextInt(), a[] = in.readIntArray(n);
            Que[] queries = new Que[q];
            for (int i = 0; i < q; ++i) {
                queries[i] = new Que(in.nextInt() - 1, in.nextInt() - 1, i);
            }
            Arrays.sort(queries, new Comparator<Que>() {

                public int compare(Que o1, Que o2) {
                    if (o1.y < o2.y) return -1;
                    if (o1.y == o2.y) return 0;
                    return 1;
                }
            });
            build(a, n, queries, q);
        }

        void build(int[] arr, int n, Que[] queries, int q) {
            int[] bit = new int[n + 1];
            Arrays.fill(bit, 0);
            int[] last = new int[10000001];
            Arrays.fill(last, -1);
            int[] ans = new int[q];
            int query_counter = 0;
            for (int i = 0; i < n; i++) {
                if (last[arr[i]] != -1) update(last[arr[i]] + 1, -1, bit, n);
                last[arr[i]] = i;
                update(i + 1, 1, bit, n);
                while (query_counter < q && queries[query_counter].y == i) {
                    ans[queries[query_counter].idx] = query(queries[query_counter].y + 1, bit, n) - query(queries[query_counter].x, bit, n);
                    query_counter++;
                }
            }
            for (int i = 0; i < q; i++) System.out.println(ans[i]);
        }

        int query(int idx, int bit[], int n) {
            int sum = 0;
            for (; idx > 0; idx -= idx & -idx) sum += bit[idx];
            return sum;
        }

        void update(int idx, int val, int bit[], int n) {
            for (; idx <= n; idx += idx & -idx) bit[idx] += val;
        }

        class Que {
            int x;
            int y;
            int idx;

            public Que(int x, int y, int idx) {
                this.x = x;
                this.y = y;
                this.idx = idx;
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
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[(int) size];
            for (int i = 0; i < size; i++) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

