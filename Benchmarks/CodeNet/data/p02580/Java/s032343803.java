import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import java.util.ArrayDeque;
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
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int h = in.ints(), w = in.ints();
            int sy = in.ints() - 1, sx = in.ints() - 1;
            int gy = in.ints() - 1, gx = in.ints() - 1;
            char[][] s = in.chars(h);
            int[][] d = new int[h][w];
            ArrayUtil.fill(d, h * w);
            d[sy][sx] = 0;
            ArrayDeque<DWizardInMaze.P> q = new ArrayDeque<>();
            q.offer(new DWizardInMaze.P(sx, sy));
            while (!q.isEmpty()) {
                DWizardInMaze.P p = q.poll();
                if (p.x == gx && p.y == gy) {
                    out.ans(d[gy][gx]).ln();
                    return;
                }
                for (int dx = -2; dx <= 2; dx++) {
                    int nx = p.x + dx;
                    if (nx < 0 || w <= nx) continue;
                    for (int dy = -2; dy <= 2; dy++) {
                        if (dx == 0 && dy == 0) continue;
                        int ny = p.y + dy;
                        if (ny < 0 || h <= ny || s[ny][nx] == '#') continue;
                        int c = Math.abs(dx) + Math.abs(dy) == 1 ? 0 : 1;
                        if (d[ny][nx] <= d[p.y][p.x] + c) continue;
                        d[ny][nx] = d[p.y][p.x] + c;
                        if (c == 0) q.offerFirst(new DWizardInMaze.P(nx, ny));
                        else q.offerLast(new DWizardInMaze.P(nx, ny));
                    }
                }
            }
            out.ans(-1).ln();
        }

        private static class P {
            int x;
            int y;

            P(int x, int y) {
                this.x = x;
                this.y = y;
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

        public char[] chars() {
            return string().toCharArray();
        }

        public char[][] chars(int h) {
            char[][] res = new char[h][];
            for (int i = 0; i < h; i++) res[i] = chars();
            return res;
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(int[] a, int v) {
            Arrays.fill(a, v);
        }

        public static void fill(int[][] a, int v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }
}

