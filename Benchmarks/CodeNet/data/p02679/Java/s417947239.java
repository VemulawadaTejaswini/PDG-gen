import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EBullet2 solver = new EBullet2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBullet2 {
        public static final int MOD = 1_000_000_007;

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            EBullet2.MyPair[] a = new EBullet2.MyPair[n];
            for (int i = 0; i < n; i++) {
                a[i] = new EBullet2.MyPair(in.nextLong(), in.nextLong());
            }
            long res = solveMe(n, a);
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMe(int n, EBullet2.MyPair[] a) {
            HashMap<EBullet2.MyPair, EBullet2.MyPair> groups = new HashMap<>();
            int nbZeros = 0;
            for (EBullet2.MyPair myPair : a) {
                if (myPair.first == 0 && myPair.second == 0) {
                    nbZeros++;
                    continue;
                }
                boolean isFirst = true;
                EBullet2.MyPair label;

                if (myPair.second == 0) {
                    label = new EBullet2.MyPair(0, 1);
                    isFirst = false;
                } else {
                    EBullet2.Fraction fraction = new EBullet2.Fraction(myPair.first, myPair.second);
                    label = new EBullet2.MyPair(fraction.p, fraction.q);
                    if (fraction.p < 0) {
                        isFirst = false;
                        label = new EBullet2.MyPair(fraction.q, -fraction.p);
                    }
                }
                EBullet2.MyPair init = groups.getOrDefault(label, new EBullet2.MyPair(0, 0));
                groups.put(label, new EBullet2.MyPair(init.first + (isFirst ? 1 : 0), init.second + (!isFirst ? 1 : 0)));
            }

            long ans = 0;
            for (EBullet2.MyPair group : groups.values()) {
                ans += (pow(2, group.first, MOD) - 1 + pow(2, group.second, MOD) - 1) * (ans + 1);
                ans %= MOD;
            }
            ans += nbZeros;
            ans %= MOD;
            return ans;
        }

        private static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        private static long pow(long a, long b, long mod) {
            if (b == 0)
                return 1;
            long tmp = pow(a * a % mod, b / 2, mod);
            if (b % 2 == 1) {
                tmp *= a;
            }
            return tmp % mod;
        }

        public static void assertTrue(boolean shouldBeTrue) {
            assertTrue(shouldBeTrue, "");
        }

        public static void assertTrue(boolean shouldBeTrue, String message) {
            if (!shouldBeTrue)
                throw new RuntimeException(message);
        }

        public static class MyPair implements Comparable<EBullet2.MyPair> {
            long first;
            long second;

            public MyPair(long first, long second) {
                this.first = first;
                this.second = second;
            }

            public String toString() {
                //return "[" + first + ", " + second + "]";
                return first + ";" + second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EBullet2.MyPair myPair = (EBullet2.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(EBullet2.MyPair p2) {
                int res = Long.compare(first, p2.first);
                return res != 0 ? res : Long.compare(second, p2.second);
            }

        }

        public static class Fraction {
            long p;
            long q;

            public Fraction(long p, long q) {
                assertTrue(q != 0);
                if (q < 0) {
                    p = -p;
                    q = -q;
                }
                long res = gcd(Math.abs(p), Math.abs(q));
                this.p = p / res;
                this.q = q / res;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EBullet2.Fraction fraction = (EBullet2.Fraction) o;
                return p == fraction.p &&
                        q == fraction.q;
            }

            public int hashCode() {
                return Objects.hash(p, q);
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

