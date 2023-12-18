import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
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
            FRangeSetQuery.Query[] ans = queries.clone();
            Arrays.sort(queries);
            //System.out.println(Arrays.toString(queries));

            int l = queries[0].l, r = queries[0].l;
            IntMultiSet set = new IntMultiSet(n + 1);
            for (FRangeSetQuery.Query query : queries) {
                while (query.l < l) set.add(c[--l]);
                while (r < query.r) set.add(c[r++]);
                while (l < query.l) set.remove(c[l++]);
                while (query.r < r) set.remove(c[--r]);
                query.ans = set.size();
            }

            for (FRangeSetQuery.Query query : ans) out.ans(query.ans).ln();
        }

        private static class Query implements Comparable<FRangeSetQuery.Query> {
            private static final int BLOCK_SIZE = 768;
            final int index;
            final int l;
            final int r;
            final int lb;
            final int rb;
            int ans;

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
                if (this.lb != o.lb) return lb - o.lb;
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

    static class IntMultiSet {
        private final int max;
        private final int[] count;
        private int size = 0;

        public IntMultiSet(int max) {
            this.max = max;
            this.count = new int[max];
        }

        public void add(int v) {
            if (count[v] == 0) size++;
            count[v]++;
        }

        public void remove(int v) {
            count[v]--;
            if (count[v] == 0) size--;
        }

        public int size() {
            return size;
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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

