import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E3";

    FastScanner in;
    PrintWriter out;

    final int CONTEST_TYPES = 26;

    int D;
    int[] c;
    int[][] s;

    static class XorShift {
        private static final double toDouble = 1.0 / 2147483648.0;
        private int w = 88675123;
        private int x = 123456789;
        private int y = 362436069;
        private int z = 521288629;
        private int count = 0;

        public XorShift() {
            x = (int) System.nanoTime();
        }

        public XorShift(long l) {
            x = (int) l;
        }

        public int getCount() {
            return count;
        }

        public double nextDouble() {
            return (nextInt() & Integer.MAX_VALUE) * toDouble;
        }

        public int nextInt() {
            count++;
            final int t = x ^ (x << 11);
            x = y;
            y = z;
            z = w;
            w = w ^ (w >>> 19) ^ (t ^ (t >>> 8));
            return w;
        }

        public int nextInt(int n) {
            return (int) (n * nextDouble());
        }

        public long nextLong() {
            long a = nextInt();
            long b = nextInt();
            return (a << 32) ^ b;
        }
    }

    static class SATemperature {
        private static final XorShift rnd = new XorShift(123321);

        private final double startTemperature;
        private final double endTemperature;
        private final int maxTemperature;
        private final int timeLimitMs;

        public SATemperature(double startTemperature, double endTemperature, int maxTemperature, int timeLimitMs) {
            this.startTemperature = startTemperature;
            this.endTemperature = endTemperature;
            this.maxTemperature = maxTemperature;
            this.timeLimitMs = timeLimitMs;
        }

        public boolean forceNext(long currentTime, long currentCost, long nextCost) {
            double temp = startTemperature + ((endTemperature - startTemperature) * currentTime) / timeLimitMs;
            double limit = (double)(rnd.nextInt(maxTemperature) + 1) / maxTemperature;

            final double scoreDiff = nextCost - currentCost;
            // final double scoreDiff = currentCost != nextCost ? currentCost - nextCost : ((currentPath.getCost2() - bestPath.getCost2()) * 1e-6);
            double probability = Math.exp(scoreDiff / temp);
            // System.err.println(currentTime + " " + currentCost + " " + nextCost + " " + probability);
            return probability > limit;
        }
    }

    public void solve() {
        D = in.nextInt();
        c = in.nextIntArray(CONTEST_TYPES);
        s = in.nextIntMap(D, CONTEST_TYPES);

        long start = System.currentTimeMillis();
        int cnt = 0;

        int[] t = new int[D];
        int[] bestT = new int[D];
        int bestScore = calcScore(t);
        int curScore = bestScore;
        Random rnd = new Random(12);

        SATemperature saTemperature = new SATemperature(1000, 1, 10000, 1800);
        long currentTime = start;
        while (true) {
            if (cnt % 100 == 0) {
                currentTime = System.currentTimeMillis();
                if (currentTime - start >= 1800) {
                    System.err.println("loop:" + cnt);
                    break;
                }
            }
            int type = rnd.nextInt(20);
            int nextScore = curScore;
            if (type == 0) {
                int d = rnd.nextInt(D);
                int q = rnd.nextInt(CONTEST_TYPES);
                int qt = t[d];

                nextScore -= calcScoreUnit(t, q) + calcScoreUnit(t, qt);
                t[d] = q;
                nextScore += calcScoreUnit(t, q) + calcScoreUnit(t, qt);
                if (nextScore > bestScore) {
                    System.err.println("improve(" + d + ", " + qt + "->" + q + "): " + bestScore + "=>" + nextScore);
                    bestT = Arrays.copyOf(t, D);
                    bestScore = nextScore;
                    curScore = nextScore;
                } else if (saTemperature.forceNext(currentTime - start, curScore, nextScore)) {
                    curScore = nextScore;
                } else {
                    t[d] = qt;
                }
            } else if (type == -1) {
                int q1, q2;
                do {
                    q1 = rnd.nextInt(CONTEST_TYPES);
                    q2 = rnd.nextInt(CONTEST_TYPES);
                } while (q1 == q2);

                for (int i = 0; i < D; i++) {
                    if (t[i] == q1) {
                        t[i] = q2;
                    } else if (t[i] == q2) {
                        t[i] = q1;
                    }
                }
                nextScore = calcScore(t);
                if (nextScore > bestScore) {
                    // System.err.println("improve(" + d + ", " + qt + "->" + q + "): " + bestScore + "=>" + nextScore);
                    bestT = Arrays.copyOf(t, D);
                    bestScore = nextScore;
                    curScore = nextScore;
                } else if (saTemperature.forceNext(currentTime - start, curScore, nextScore)) {
                    curScore = nextScore;
                } else {
                    for (int i = 0; i < D; i++) {
                        if (t[i] == q1) {
                            t[i] = q2;
                        } else if (t[i] == q2) {
                            t[i] = q1;
                        }
                    }
                }
            } else {
                int d1, d2;
                do {
                    d1 = rnd.nextInt(D);
                    d2 = rnd.nextInt(D);
                } while (d1 == d2);

                int q = t[d1];
                int qt = t[d2];
                if (q == qt) {
                    continue;
                }
                nextScore -= calcScoreUnit(t, q) + calcScoreUnit(t, qt);
                t[d1] = qt;
                t[d2] = q;
                nextScore += calcScoreUnit(t, q) + calcScoreUnit(t, qt);
                if (nextScore > bestScore) {
                    System.err.println("improve2(" + d1 + ", " + qt + "," + q + "): " + bestScore + "=>" + nextScore);
                    bestT = Arrays.copyOf(t, D);
                    bestScore = nextScore;
                    curScore = nextScore;
                } else if (saTemperature.forceNext(currentTime - start, bestScore, nextScore)) {
                    curScore = nextScore;
                } else {
                    t[d1] = q;
                    t[d2] = qt;
                }
            }
            cnt++;
        }
        for (int i = 0; i < D; i++) {
            out.println(bestT[i] + 1);
        }
        out.close();
    }

    int calcScore(int[] result) {
        int res = 0;
        for (int j = 0; j < CONTEST_TYPES; j++) {
            res += calcScoreUnit(result, j);
        }
        return res;
    }

    private int calcScoreUnit(int[] result, int ct) {
        int lastD = 0;
        int cur = 0;
        for (int i = 0; i < D; i++) {
            if (result[i] == ct) {
                int t = result[i];
                lastD = i + 1;
                cur += s[i][t];
            }
            cur -= c[ct] * (i + 1 - lastD);
        }
        return cur;
    }

    /*
    private int[] solveInternal() {
        int[] res = new int[D];
        for (int i = 0; i < D; i++) {
            res[i] = i % CONTEST_TYPES;
        }
        int[] lastD = new int[CONTEST_TYPES];
        int score = 0;
        for (int i = 0; i < CONTEST_TYPES; i++) {
            score -= c[i] * (D * (D - 1)) / 2;
        }
        for (int i = 0; i < D; i++) {
            int bestT = 0;
            int bestScore = s[i][0] + c[0] * (i + 1 - lastD[0]) * (D - i);
            for (int t = 1; t < 26; t++) {
                int nextScore = s[i][t] + c[t] * (i + 1 - lastD[t]) * (D - i);
                if (nextScore > bestScore) {
                    bestT = t;
                }
            }
            res[i] = bestT;
            lastD[bestT] = i + 1;
            score += bestScore;
        }
        if (calcScore(res) != score) {
            throw new RuntimeException("score:" + score + ", real:" + calcScore(res));
        }
        return res;
    }
*/
    private int binSearch(long[] a, long v) {
        int lo = 0, hi = a.length;
        while (hi - lo > 1) {
            int mid = (lo + hi) / 2;
            if (a[mid] <= v) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}

class ModCombination {
    private final ModLib modLib;

    private final long[] fact;
    private final long[] invfact;

    private ModCombination(ModLib modLib, long[] fact, long[] invfact) {
        this.modLib = modLib;
        this.fact = fact;
        this.invfact = invfact;
    }

    public static ModCombination create(int size, ModLib modLib) {
        long[] fact = new long[size];
        fact[0] = 1;
        for (int i = 0; i < size - 1; i++) {
            fact[i+1] = modLib.mult(fact[i], i + 1);
        }
        long[] invfact = new long[size];
        invfact[size-1] = modLib.div(1, fact[size-1]);
        for (int i = size - 2; i >= 0; i--) {
            invfact[i] = modLib.mult(invfact[i+1], i + 1);
        }
        return new ModCombination(modLib, fact, invfact);
    }

    public long fact(int x) {
        return fact[x];
    }

    public long invfact(int x) {
        return invfact[x];
    }

    public long permutation(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], invfact[a-b]);
    }

    public long comb(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], modLib.mult(invfact[b], invfact[a-b]));
    }
}

class ModLib {
    final long mod;

    public ModLib(long mod) {
        this.mod = mod;
    }

    public long add(long a, long b) {
        return (a + b) % mod;
    }

    public long sub(long a, long b) {
        return (a - b + mod) % mod;
    }

    public long mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    public long pow(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = mult(res, a);
            a = mult(a, a);
        }

        return res;
    }

    public long div(long a, long b) {
        return mult(a, pow(b, mod - 2));
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
