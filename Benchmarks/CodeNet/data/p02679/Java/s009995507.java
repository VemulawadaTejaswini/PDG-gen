import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.io.BufferedOutputStream;
import java.util.HashSet;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
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
        EBullet solver = new EBullet();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBullet {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long ans = 1;
            int origin = 0;
            ModMath mod = new ModMath(MOD);
            Map<EBullet.Direction, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = in.longs(), y = in.longs();
                if (x == 0 && y == 0) origin++;
                else map.merge(new EBullet.Direction(x, y), 1, Integer::sum);
            }
            //System.out.println(map);
            Set<EBullet.Direction> counted = new HashSet<>();
            for (EBullet.Direction dir : map.keySet()) {
                EBullet.Direction opp = dir.rot90();
                if (counted.contains(dir) || counted.contains(opp)) continue;
                int a = map.get(dir), b = map.getOrDefault(opp, 0);
                long d = (mod.pow(2, a) + mod.pow(2, b) + MOD - 1) % MOD;
                //System.out.println(dir + "*" + a + ", " + opp + "*" + b + " => " + d);
                ans *= d;
                ans %= MOD;
                counted.add(dir);
                counted.add(opp);
            }
            ans = (ans + origin + MOD - 1) % MOD;
            out.ans(ans).ln();
        }

        private static class Direction {
            final long x;
            final long y;

            Direction(long x, long y) {
                if (x == 0) y = 1;
                else if (y == 0) x = 1;
                else {
                    if (x < 0) {
                        x = -x;
                        y = -y;
                    }
                    long g = IntMath.gcd(x, Math.abs(y));
                    x /= g;
                    y /= g;
                }
                this.x = x;
                this.y = y;
            }

            EBullet.Direction rot90() {
                return new EBullet.Direction(-y, x);
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                EBullet.Direction d = (EBullet.Direction) o;
                return x == d.x && y == d.y;
            }

            public int hashCode() {
                int result = (int) (x ^ (x >>> 32));
                result = 31 * result + (int) (y ^ (y >>> 32));
                return result;
            }

            public String toString() {
                return "(" + x + ", " + y + ")";
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

    static final class IntMath {
        private IntMath() {
        }

        public static long gcd(long a, long b) {
            long t;
            if (a == 0) return b;
            if (b == 0) return a;
            while (a % b > 0) {
                t = b;
                b = a % b;
                a = t;
            }
            return b;
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

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod, boolean unsafe) {
        /*if (!unsafe && !IntMath.isPrime(mod)) {
            throw new RuntimeException("This class is designed for primes!");
        }*/
            this.mod = mod;
        }

        public ModMath(long mod) {
            this(mod, false);
        }

        public ModMath() {
            this(DEFAULT_MOD, true);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            //return pow(x, mod - 2);
            return mod(LongEuclidSolver.solve(x, mod).x);
        }

        public long pow(long x, long y) {
            y %= (mod - 1);
            if (y < 0) {
                return pow(inv(x), -y);
            } else if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % mod;
            } else {
                return (x % mod) * pow(x, y - 1) % mod;
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

        public long longs() {
            return Long.parseLong(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
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

    static interface Verified {
    }
}

