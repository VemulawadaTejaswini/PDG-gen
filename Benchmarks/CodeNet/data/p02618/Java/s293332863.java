import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.IOException;
import java.util.Random;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
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
        AAtCoderContestScheduling solver = new AAtCoderContestScheduling();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAtCoderContestScheduling {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            long start = System.currentTimeMillis();
            int d = in.ints();
            long[] c = in.longs(26);
            long[][] s = in.longs(d, 26);
            long[] last = new long[26];
            int[] ans = new int[d];
            for (int i = 0; i < d; i++) {
                int max = 0;
                for (int j = 1; j < 26; j++) {
                    if (s[i][max] + c[max] * (i - last[max] + 1) < s[i][j] + c[j] * (i - last[j] + 1)) {
                        max = j;
                    }
                }
                last[max] = i;
                ans[i] = max;
            }

            AAtCoderContestScheduling.Solution solution = new AAtCoderContestScheduling.Solution(d, c, s, ans);
            do {
                for (int i = 0; i < 1000; i++) {
                    solution.improve();
                }
            } while (System.currentTimeMillis() - start < 1900);
            for (int i = 0; i < d; i++) out.ans(ans[i] + 1).ln();
        }

        private static class Solution {
            final int d;
            final long[] c;
            final long[][] s;
            final List<TreeSet<Integer>> table;
            final int[] solution;
            final XorShift random = new XorShift();

            Solution(int d, long[] c, long[][] s, int[] ans) {
                this.d = d;
                this.c = c;
                this.s = s;
                this.table = new ArrayList<>(26);
                for (int i = 0; i < 26; i++) {
                    TreeSet<Integer> ts = new TreeSet<>();
                    ts.add(-1);
                    table.add(ts);
                }
                this.solution = ans;
                for (int i = 0; i < d; i++) table.get(solution[i]).add(i);
            }

            void improve() {
                improve(random.nextInt(d));
            }

            void improve(int day) {
                int index = -1;
                long score = Long.MIN_VALUE;
                for (int i = 0; i < 26; i++) {
                    int diff = day - table.get(i).floor(day);
                    long v = s[day][i] + diff * c[i] * (d - day);
                    if (v > score) {
                        score = v;
                        index = i;
                    }
                }
                if (solution[day] == index) return;
                table.get(solution[day]).remove(day);
                solution[day] = index;
                table.get(index).add(day);
            }

        }

    }

    static class XorShift extends Random {
        private int x;

        public XorShift() {
            this.x = (int) System.nanoTime();
        }

        protected int next(int bits) {
            x = x ^ (x << 13);
            x = x ^ (x >> 17);
            x = x ^ (x << 5);
            return x;
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

        public long longs() {
            return Long.parseLong(string());
        }

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

        public long[][] longs(int height, int width) {
            return IntStream.range(0, height).mapToObj(x -> longs(width)).toArray(long[][]::new);
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

