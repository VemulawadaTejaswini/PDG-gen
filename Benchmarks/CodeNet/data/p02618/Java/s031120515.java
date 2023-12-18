import static java.lang.Math.exp;
import static java.lang.Math.max;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) {
        new Solver(false);
    }
}

class Solver {
    final In in;

    static final int D = 365;
    static final int A = 26;

    static final int SWAP_WIDTH = 10;
    final int[] c = new int[A];
    final int[][] s = new int[D][A];
    final double[][] w = new double[D][A];
    final int[] x = new int[D];
    final Random rnd = new Random();

    static final double START_TEMP = 1000;
    static final double END_TEMP = 15;
    static final double DEL_TEMP = END_TEMP - START_TEMP;

    static final long TIME_LIMIT = 1_900_000_000l;
    final long startTime = System.nanoTime();
    final long endTime = startTime + TIME_LIMIT;

    int score;
    int iteration = 0;

    public Solver (boolean debug) {
        if (debug) {
            try {
                System.setIn(new FileInputStream(new File("./marathon/tester/example/sample2.in")));
                System.setOut(new PrintStream(new File("./marathon/debug_output")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        in = new In();
        input();
        // setWeight(50);
        // annealing(debug);
        greedy0();
        output();
        if (debug) {
            long time = (System.nanoTime() - startTime) / 1_000_000;
            System.out.println(String.format("Time: %d ms", time));
            int expected = score();
            if (expected != score) {
                System.out.println(score);
                System.out.println(expected);
                String err = String.format("\nexpected = %d\nactual = %d", expected, score);
                throw new RuntimeException(err);
            }
            score = max(score + 1000000, 0);
            System.out.printf("Iteration: %d\nScore: %d\n", iteration, score);
        }
    }

    public void initialize() {
        greedy1();
    }

    public void annealing(boolean debug) {
        initialize();
        long nowTime = System.nanoTime();
        while (nowTime < endTime) {
            if ((++iteration & 3) == 0) {
                tryChange(nowTime);
                if ((iteration & 0x3ff) == 0) nowTime = System.nanoTime();
            } else {
                trySwap(nowTime);
            }
        }
    }

    public void tryChange(long nowTime) {
        int day = rnd.nextInt(D);
        int fr = x[day];
        // int to = weightedRandomContest(day);
        int to = rnd.nextInt(A);
        int newScore = ifChanged(day, fr, to, score);
        double temp = START_TEMP + DEL_TEMP * (nowTime - startTime) / TIME_LIMIT;
        double prob = exp((newScore - score) / temp);
        if (prob > rnd.nextDouble()) {
            x[day] = to;
            score = newScore;
        }
    }

    public void trySwap(long nowTime) {
        int day1 = rnd.nextInt(D);
        int day2;
        do {day2 = randomSwapDay(day1);} while (x[day1] == x[day2]);
        int newScore = ifSwapped(day1, day2, score);
        double temp = START_TEMP + DEL_TEMP * (nowTime - startTime) / TIME_LIMIT;
        double prob = exp((newScore - score) / temp);
        if (prob > rnd.nextDouble()) {
            int tmp = x[day1]; x[day1] = x[day2]; x[day2] = tmp;
            score = newScore;
        }
    }

    public int ifChanged(int day, int fr, int to, int oldScore) {
        int newScore = oldScore + s[day][to] - s[day][fr];
        newScore += (day - higher(day, fr)) * (day - lower(day, fr)) * c[fr];
        newScore -= (day - higher(day, to)) * (day - lower(day, to)) * c[to];
        return newScore;
    }

    public int ifSwapped(int day1, int day2, int oldScore) {
        int x1 = x[day1], x2 = x[day2];
        int newScore = ifChanged(day1, x1, x2, oldScore);
        x[day1] = x2;
        newScore = ifChanged(day2, x2, x1, newScore);
        x[day1] = x1;
        return newScore;
    }

    public void setWeight(int param) {
        for (int i = 0; i < D; i++) {
            double sum = 0;
            for (int j = 0; j < A; j++) sum += c[j] * param + s[i][j];
            for (int j = 0; j < A; j++) {
                w[i][j] = (c[j] * param + s[i][j]) / sum;
                if (j > 0) w[i][j] += w[i][j - 1];
            }
        }
    }

    public int weightedRandomContest(int day) {
        double v = rnd.nextDouble();
        for (int i = 0; i < A; i++) if (w[day][i] >= v) return i;
        return A - 1;
        // int l = -1, r = A;
        // while (r - l > 1) {
        //     int m = (l + r) >> 1;
        //     if (w[day][m] < v) l = m;
        //     else r = m;
        // }
        // return r == A ? 0 : r;
    }

    public int randomSwapDay(int day) {
        int l = Math.min(day, SWAP_WIDTH);
        int r = Math.min(D - 1 - day, SWAP_WIDTH);
        int v = rnd.nextInt(l + r);
        return v < l ? day - l + v : day - l + v + 1;
    }

    public void greedy0() {
        int[] last = new int[A];
        for (int i = 0; i < D; i++) {
            int max = -Const.IINF;
            int xi = -1;
            for (int j = 0; j < A; j++) {
                int delta = s[i][j];
                for (int k = 0; k < A; k++) {
                    if (j != k) delta -= (i + 1 - last[k]) * c[k];
                }
                if (delta > max) {
                    max = delta;
                    xi = j;
                }
            }
            score += max;
            x[i] = xi;
            last[xi] = i + 1;
        }
    }

    public void greedy1() {
        int[] last = new int[A];
        for (int i = 0; i + 2 < D; i += 3) {
            int max = -Const.IINF;
            int mx1 = -1, mx2 = -1, mx3 = -1;
            for (int x1 = 0; x1 < A; x1++) for (int x2 = 0; x2 < A; x2++) for (int x3 = 0; x3 < A; x3++) {
                int l1 = last[x1], l2 = last[x2], l3 = last[x3];
                int delta = 0;
                last[x1] = i + 1;
                delta += s[i][x1];
                for (int j = 0; j < A; j++) delta -= c[j] * (i + 1 - last[j]);
                last[x2] = i + 2;
                delta += s[i + 1][x2];
                for (int j = 0; j < A; j++) delta -= c[j] * (i + 2 - last[j]);
                last[x3] = i + 3;
                delta += s[i + 2][x3];
                for (int j = 0; j < A; j++) delta -= c[j] * (i + 3 - last[j]);
                if (delta > max) {
                    max = delta;
                    mx1 = x1; mx2 = x2; mx3 = x3;
                }
                last[x1] = l1; last[x2] = l2; last[x3] = l3;
            }
            x[i] = mx1; x[i + 1] = mx2; x[i + 2] = mx3;
            last[mx1] = i + 1; last[mx2] = i + 2; last[mx3] = i + 3;
            score += max;
        }
        int max = -Const.IINF;
        int mx1 = -1, mx2 = -1;
        for (int x1 = 0; x1 < A; x1++) for (int x2 = 0; x2 < A; x2++) {
            int l1 = last[x1], l2 = last[x2];
            int delta = 0;
            last[x1] = D - 1;
            delta += s[D - 2][x1];
            for (int j = 0; j < A; j++) delta -= c[j] * (D - 1 - last[j]);
            last[x2] = D;
            delta += s[D - 1][x2];
            for (int j = 0; j < A; j++) delta -= c[j] * (D - last[j]);
            if (delta > max) {
                max = delta;
                mx1 = x1; mx2 = x2;
            }
            last[x1] = l1; last[x2] = l2;
        }
        x[D - 2] = mx1; x[D - 1] = mx2;
        last[mx1] = D - 1; last[mx2] = D;
        score += max;
    }

    public void greedy2() {
        for (int i = 0; i < A; i++) score -= D * (D + 1) * c[i] / 2;
        int[] last = new int[A];
        Arrays.fill(last, -1);
        for (int i = 0; i < D; i++) {
            int max = 0, xi = -1;
            for (int j = 0; j < A; j++) {
                int delta = s[i][j] + (D - i) * (i - last[j]) * c[j];
                if (delta > max) {
                    max = delta;
                    xi = j;
                }
            }
            last[xi] = i;
            x[i] = xi;
            score += max;
        }
    }

    public void greedy3() {
        for (int i = 0; i < A; i++) score -= D * (D + 1) * c[i] / 2;
        int[] last = new int[A];
        Arrays.fill(last, -1);
        for (int i = 0; i + 3 < D; i += 4) {
            int max = 0;
            int mx1 = -1, mx2 = -1, mx3 = -1, mx4 = -1;
            for (int x1 = 0; x1 < A; x1++) for (int x2 = 0; x2 < A; x2++) 
            for (int x3 = 0; x3 < A; x3++) for (int x4 = 0; x4 < A; x4++) {
                int l1 = last[x1], l2 = last[x2], l3 = last[x3], l4 = last[x4];
                int delta = 0;
                delta += s[i][x1] + (D - i) * (i - last[x1]) * c[x1];
                last[x1] = i;
                delta += s[i + 1][x2] + (D - i - 1) * (i + 1 - last[x2]) * c[x2];
                last[x2] = i + 1;
                delta += s[i + 2][x3] + (D - i - 2) * (i + 2 - last[x3]) * c[x3];
                last[x3] = i + 2;
                delta += s[i + 3][x4] + (D - i - 3) * (i + 3 - last[x4]) * c[x4];
                last[x4] = i + 3;
                if (delta > max) {
                    max = delta;
                    mx1 = x1; mx2 = x2; mx3 = x3; mx4 = x4;
                }
                last[x1] = l1; last[x2] = l2; last[x3] = l3; last[x4] = l4;
            }
            x[i] = mx1; x[i + 1] = mx2; x[i + 2] = mx3; x[i + 3] = mx4;
            last[mx1] = i; last[mx2] = i + 1; last[mx3] = i + 2; last[mx4] = i + 3;
            score += max;
        }
        int max = 0;
        int mx1 = -1;
        for (int x1 = 0; x1 < A; x1++) {
            int l1 = last[x1];
            int delta = 0;
            delta += s[D - 1][x1] + (D - 1 - last[x1]) * c[x1];
            last[x1] = D - 1;
            if (delta > max) {
                max = delta;
                mx1 = x1;
            }
            last[x1] = l1;
        }
        x[D - 1] = mx1;
        last[mx1] = D - 1;
        score += max;
    }

    public void input() {
        in.ni();
        Arrays.setAll(c, $ -> in.ni());
        for (int i = 0; i < D; i++) Arrays.setAll(s[i], $ -> in.ni());
    }

    public void output() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < D; i++) sb.append(x[i] + 1).append('\n');
        System.out.print(sb);
    }

    public int score() {
        int[] last = new int[A];
        int score = 0;
        for (int i = 0; i < D; i++) {
            last[x[i]] = i + 1;
            score += s[i][x[i]];
            for (int j = 0; j < A; j++) score -= c[j] * (i + 1 - last[j]);
        }
        return score;
    }

    public int higher(int day, int v) {
        for (int i = day + 1; i < D; i++) if (x[i] == v) return i;
        return D;
    }

    public int lower(int day, int v) {
        for (int i = day - 1; i >= 0; i--) if (x[i] == v) return i;
        return -1;
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    final FastScanner fsc = new FastScanner();
    public int ni() {return fsc.nextInt();}
    public int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public long nl() {return fsc.nextLong();}
    public long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public char[] nc() {return fsc.next().toCharArray();}
    public char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public double nd() {return fsc.nextDouble();}
    public double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public String ns() {return fsc.next();}
    public String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};

    private Const(){}
}

final class Random {
    private static final double DOUBLE_UNIT = 0x1.0p-53;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;
    private int w = 88675123;
    public int nextInt() {
        int t = x ^ (x << 11);
        x = y; y = z; z = w;
        return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
    }
    public long nextLong() {
        return ((long) (nextInt()) << 32) + nextInt();
    }
    public int nextInt(int bound) {
        return nextInt() % bound;
    }
    public boolean nextBoolean() {
        return (nextInt() & 1) == 0;
    }
    public double nextDouble() {
        return (((long) (next(26)) << 27) + next(27)) * DOUBLE_UNIT;
    }
    private int next(int bits) {
        int mask = bits == 32 ? -1 : (1 << bits) - 1;
        return nextInt() & mask;
    }
}
