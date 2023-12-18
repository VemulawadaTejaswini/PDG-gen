import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.TreeSet;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
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
        /*
        int[] ans = in.ints(d);
        for (int i = 0; i < d; i++) ans[i]--;
        //*/
            //*
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
            //*/

            AAtCoderContestScheduling.Solution solution = new AAtCoderContestScheduling.Solution(d, c, s, ans);
        /*
        int m = in.ints();
        for (int i = 0; i < m; i++) {
            int dst = in.ints() - 1, type = in.ints() - 1;
            solution.change(dst, type);
            //System.out.println(solution.table);
            out.ans(solution.getScore()).ln();
        }
        //*/
            //*
            double t = 1.0;
            do {
                for (int i = 0; i < 1000; i++) {
                    solution.improve(t);
                }
                t -= 0.0002;
                if (t < 0) t = 0.01;
            } while (System.currentTimeMillis() - start < 1900);
            for (int i = 0; i < d; i++) out.ans(ans[i] + 1).ln();
            //*/

        }

        private static class Solution {
            final int days;
            final long[] c;
            final long[][] s;
            final List<TreeSet<Integer>> table;
            final int[] ans;
            final Random random = new XorShift();
            long score;

            Solution(int d, long[] c, long[][] s, int[] ans) {
                this.days = d;
                this.c = c;
                this.s = s;
                this.table = new ArrayList<>(26);
                for (int i = 0; i < 26; i++) {
                    TreeSet<Integer> ts = new TreeSet<>();
                    ts.add(-1);
                    ts.add(d);
                    table.add(ts);
                    score -= c[i] * (days + 1L) * days / 2;
                }
                this.ans = ans;
                for (int i = 0; i < d; i++) {
                    table.get(this.ans[i]).add(i);
                    score += benefitAt(i, ans[i]);
                }
            }

            void improve(double t) {
                improve(random.nextInt(days), t);
            }

            void improve(int day, double t) {
                int index = -1;
                long score = -1_000_000_000_000L;
                long now = benefitAt(day, ans[day]);
                for (int i = 0; i < 26; i++) {
                    if (i == ans[day]) continue;
                    long v = benefitAt(day, i);
                    if (v > score) {
                        score = v;
                        index = i;
                    }
                }
                if (score <= now || Math.exp((score - now) / t) < random.nextDouble()) return;
                //System.out.println(now + " => " + score);
                this.score += score - now;
                table.get(ans[day]).remove(day);
                table.get(index).add(day);
                ans[day] = index;
            }

            long benefitAt(int day, int type) {
                return s[day][type] + (day - table.get(type).lower(day)) * c[type] * (table.get(type).higher(day) - day);
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

