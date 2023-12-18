import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.function.LongUnaryOperator;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), q = in.ints();
            int[] c = in.ints(n);
            FRangeSetQuery.Query[] queries = new FRangeSetQuery.Query[q];
            for (int i = 0; i < q; i++) queries[i] = new FRangeSetQuery.Query(i, in.ints() - 1, in.ints());
            FRangeSetQuery.Query[] answers = queries.clone();
            Arrays.sort(queries);
            //System.out.println(Arrays.toString(queries));

            int r = 0;
            int[] last = new int[n + 1];
            Arrays.fill(last, -1);
            AbelianIntFenwickTree bit = new AbelianIntFenwickTree(n, Long::sum, 0L, x -> -x);
            for (FRangeSetQuery.Query query : queries) {
                while (r < query.r) {
                    if (last[c[r]] != -1) bit.add(last[c[r]], -1);
                    last[c[r]] = r;
                    bit.add(r, 1);
                    r++;
                }
                query.ans = bit.query(query.l, query.r);
            }

            for (FRangeSetQuery.Query query : answers) out.ans(query.ans).ln();
        }

        private static class Query implements Comparable<FRangeSetQuery.Query> {
            private static final int BLOCK_SIZE = 768;
            final int index;
            final int l;
            final int r;
            final int lb;
            final int rb;
            long ans;

            Query(int index, int l, int r) {
                this.index = index;
                this.l = l;
                this.r = r;
                this.lb = l / BLOCK_SIZE;
                this.rb = r / BLOCK_SIZE;
            }

            public String toString() {
                return "[" + l + ", " + r + ")";
            }

            public int compareTo(FRangeSetQuery.Query o) {
                //if (this.lb != o.lb) return lb - o.lb;
                if (r != o.r) return r - o.r;
                return l - o.l;
            }

        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class AbelianIntFenwickTree extends IntFenwickTree {
        private final LongUnaryOperator rev;

        public AbelianIntFenwickTree(int n, LongBinaryOperator op, long zero, LongUnaryOperator rev) {
            super(n, op, zero);
            this.rev = rev;
        }

        public AbelianIntFenwickTree(long[] init, LongBinaryOperator op, long zero, LongUnaryOperator rev) {
            super(init, op, zero);
            this.rev = rev;
        }

        public long query(int first, int last) {
            if (first == 0) {
                return query(last);
            } else {
                return op.applyAsLong(query(last), rev.applyAsLong(query(first)));
            }
        }

    }

    static class IntFenwickTree {
        protected final int n;
        private final long[] tree;
        protected final LongBinaryOperator op;
        protected final long zero;

        public IntFenwickTree(int n, LongBinaryOperator op, long zero) {
            this.n = n;
            tree = new long[n + 1];
            Arrays.fill(tree, zero);
            this.op = op;
            this.zero = zero;
        }

        public IntFenwickTree(long[] init, LongBinaryOperator op, long zero) {
            this(init.length, op, zero);
            for (int i = 0; i < n; i++) add(i, init[i]);
        }

        public void add(int index, long value) {
            for (index++; index <= n; index += BitMath.extractLsb(index)) {
                tree[index] = op.applyAsLong(tree[index], value);
            }
        }

        public long query(int last) {
            long res = zero;
            for (; last > 0; last -= BitMath.extractLsb(last)) {
                res = op.applyAsLong(res, tree[last]);
            }
            return res;
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int extractLsb(int v) {
            return v & (-v);
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

