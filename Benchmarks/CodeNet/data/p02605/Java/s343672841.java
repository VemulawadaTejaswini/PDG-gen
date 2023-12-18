import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
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
        FAirSafety solver = new FAirSafety();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAirSafety {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            Map<Integer, List<FAirSafety.P>> upd = new HashMap<>(), lr = new HashMap<>();
            List<FAirSafety.P> right = new ArrayList<>(), left = new ArrayList<>();
            Map<Integer, TreeSet<Integer>> upR = new HashMap<>();
            Map<Integer, TreeSet<Integer>> upL = new HashMap<>();
            Map<Integer, TreeSet<Integer>> downR = new HashMap<>();
            Map<Integer, TreeSet<Integer>> downL = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = in.ints(), y = in.ints();
                char c = in.chr();
                FAirSafety.P p = new FAirSafety.P(x, y, c);
                if (c == 'R') {
                    right.add(p);
                    lr.computeIfAbsent(p.y, k -> new ArrayList<>()).add(p);
                }
                if (c == 'L') {
                    left.add(p);
                    lr.computeIfAbsent(p.y, k -> new ArrayList<>()).add(p);
                }
                if (c == 'U') {
                    TreeSet<Integer> r = upR.get(x + y);
                    if (r == null) r = new TreeSet<>();
                    r.add(x);
                    upR.put(x + y, r);

                    TreeSet<Integer> l = upL.get(x - y);
                    if (l == null) l = new TreeSet<>();
                    l.add(x);
                    upL.put(x - y, r);

                    upd.computeIfAbsent(p.x, k -> new ArrayList<>()).add(p);
                }
                if (c == 'D') {
                    TreeSet<Integer> r = downR.get(x - y);
                    if (r == null) r = new TreeSet<>();
                    r.add(x);
                    downR.put(x - y, r);

                    TreeSet<Integer> l = downL.get(x + y);
                    if (l == null) l = new TreeSet<>();
                    l.add(x);
                    downL.put(x + y, r);

                    upd.computeIfAbsent(p.x, k -> new ArrayList<>()).add(p);
                }
            }

            int ans = Integer.MAX_VALUE;

            for (List<FAirSafety.P> li : upd.values()) {
                li.sort(Comparator.comparing(p -> p.y));
                for (int i = 1; i < li.size(); i++) {
                    if (li.get(i - 1).d == 'U' && li.get(i).d == 'D') {
                        ans = Math.min(ans, 5 * (li.get(i).y - li.get(i - 1).y));
                    }
                }
            }
            for (List<FAirSafety.P> li : lr.values()) {
                li.sort(Comparator.comparing(p -> p.x));
                for (int i = 1; i < li.size(); i++) {
                    if (li.get(i - 1).d == 'R' && li.get(i).d == 'L') {
                        ans = Math.min(ans, 5 * (li.get(i).x - li.get(i - 1).x));
                    }
                }
            }


            for (FAirSafety.P p : right) {
                TreeSet<Integer> up = upR.get(p.x + p.y);
                if (up != null) {
                    //System.out.println(p);
                    Integer t = up.ceiling(p.x);
                    if (t != null) ans = Math.min(ans, (t - p.x) * 10);
                }
                TreeSet<Integer> down = downR.get(p.x - p.y);
                if (down != null) {
                    //System.out.println(p);
                    Integer t = down.ceiling(p.x);
                    if (t != null) ans = Math.min(ans, (t - p.x) * 10);
                }
            }

            for (FAirSafety.P p : left) {
                TreeSet<Integer> up = upL.get(p.x - p.y);
                if (up != null) {
                    //System.out.println(p);
                    Integer t = up.floor(p.x);
                    if (t != null) ans = Math.min(ans, (p.x - t) * 10);
                }
                TreeSet<Integer> down = downL.get(p.x + p.y);
                if (down != null) {
                    //System.out.println(p);
                    Integer t = down.floor(p.x);
                    if (t != null) ans = Math.min(ans, (p.x - t) * 10);
                }
            }

            if (ans == Integer.MAX_VALUE) out.ans("SAFE").ln();
            else out.ans(ans).ln();
        }

        private static class P {
            int x;
            int y;
            char d;

            P(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public P(int x, int y, char d) {
                this.x = x;
                this.y = y;
                this.d = d;
            }

            public String toString() {
                return "P{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }

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

        public char chr() {
            return string().charAt(0);
        }

        public int ints() {
            return Integer.parseInt(string());
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

