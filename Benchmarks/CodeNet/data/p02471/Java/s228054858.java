import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
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
        NTL_1_E solver = new NTL_1_E();
        solver.solve(1, in, out);
        out.close();
    }

    static class NTL_1_E {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int a = in.ints(), b = in.ints();
            Vec3l ans = LongEuclidSolver.solveLegacy(a, b);
            out.ans(ans.x).ans(ans.y).ln();
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
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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

    static class Vec3i implements Comparable<Vec3i> {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3i o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Integer.compare(z, o.z);
                }
                return Integer.compare(y, o.z);
            }
            return Integer.compare(x, o.x);
        }

    }

    static class Vec3l implements Comparable<Vec3l> {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3l o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Long.compare(z, o.z);
                }
                return Long.compare(y, o.z);
            }
            return Long.compare(x, o.x);
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long a, long b) {
            LongEuclidSolver.ReferenceLong p = new LongEuclidSolver.ReferenceLong(), q = new LongEuclidSolver.ReferenceLong();
            long d = solve(a, b, p, q);
            return new Vec3l(p.val, q.val, d);
        }

        public static Vec3l solveLegacy(long p, long q) {
            if (q == 0) {
                return new Vec3l(p, 1, p);
            }
            Vec3l vals = solve(q, p % q);
            long a = vals.y;
            long b = vals.x - (p / q) * a;
            return new Vec3l(a, b, vals.z);
        }

        private static long solve(long a, long b, LongEuclidSolver.ReferenceLong p, LongEuclidSolver.ReferenceLong q) {
            if (b == 0) {
                p.val = 1;
                q.val = 0;
                return a;
            } else {
                long d = solve(b, a % b, q, p);
                q.val -= (a / b) * p.val;
                return d;
            }
        }

        private static class ReferenceLong {
            private long val;

        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

    }
}


