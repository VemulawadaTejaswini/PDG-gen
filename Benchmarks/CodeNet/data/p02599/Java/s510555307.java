import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int q = s.nextInt();
            int[] arr = s.nextIntArray(n);
            FRangeSetQuery.Query[] queries = new FRangeSetQuery.Query[q];
            for (int i = 0; i < q; i++) {
                queries[i] = new FRangeSetQuery.Query(s.nextInt() - 1, s.nextInt() - 1, i);
            }

            Arrays.sort(queries, new Comparator<FRangeSetQuery.Query>() {
                public int compare(FRangeSetQuery.Query x, FRangeSetQuery.Query y) {
                    if (x.r < y.r)
                        return -1;
                    else if (x.r == y.r)
                        return 0;
                    else
                        return 1;
                }
            });

            int[] ans = answeringQueries(arr, n, queries, q);
            for (int i = 0; i < ans.length; i++) {
                out.println(ans[i]);
            }
        }

        static void update(int idx, int val,
                           int bit[], int n) {
            for (; idx <= n; idx += idx & -idx)
                bit[idx] += val;
        }

        static int query(int idx, int bit[], int n) {
            int sum = 0;
            for (; idx > 0; idx -= idx & -idx)
                sum += bit[idx];
            return sum;
        }

        static int[] answeringQueries(int[] arr, int n,
                                      FRangeSetQuery.Query[] queries, int q) {

            // initialising bit array
            int[] bit = new int[n + 1];
            Arrays.fill(bit, 0);

            // holds the rightmost index of any number
            // as numbers of a[i] are less than or equal to 10^6
            int[] last_visit = new int[1000001];
            Arrays.fill(last_visit, -1);

            // answer for each query
            int[] ans = new int[q];
            int query_counter = 0;
            for (int i = 0; i < n; i++) {

                // If last visit is not -1 update -1 at the
                // idx equal to last_visit[arr[i]]
                if (last_visit[arr[i]] != -1)
                    update(last_visit[arr[i]] + 1, -1, bit, n);

                // Setting last_visit[arr[i]] as i and updating
                // the bit array accordingly
                last_visit[arr[i]] = i;
                update(i + 1, 1, bit, n);

                // If i is equal to r of any query store answer
                // for that query in ans[]
                while (query_counter < q && queries[query_counter].r == i) {
                    ans[queries[query_counter].idx] =
                            query(queries[query_counter].r + 1, bit, n)
                                    - query(queries[query_counter].l, bit, n);
                    query_counter++;
                }
            }

            // print answer for each query
            return ans;
        }

        private static class Query {
            int l;
            int r;
            int idx;

            public Query(int l, int r, int idx) {
                this.l = l;
                this.r = r;
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

