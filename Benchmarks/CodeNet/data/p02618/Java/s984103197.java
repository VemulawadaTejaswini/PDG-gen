import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;




public class Main {
    // static {
    //     try {
    //         System.setIn(new FileInputStream(new File("tester/example/sample2.in")));
    //         System.setOut(new PrintStream(new File("out")));
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
    static final int d = 365;
    static final int n = 26;
    static int[] c;
    static int[][] s;
    static int[] t = new int[d];
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        In.ni();
        c = In.ni(n);
        s = In.ni(d, n);
        IntArrayList wd = new IntArrayList();
        for (int i = 0; i < d; i++) {
            int w = i / 10 + 1;
            for (int j = 0; j < w; j++) {
                wd.add(i);
            }
        }
        int sd = wd.size();
        IntArrayList wc = new IntArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c[i]; j++) {
                wc.add(i);
            }
        }
        int sc = wc.size();
        Random r = new Random();
        for (int i = 0; i < d; i++) {
            t[i] = wc.get(r.nextInt() % sc);
        }
        long max = -Const.LINF;
        for (int k = 0; k < 270000; k++) {
            int d1 = wd.get(r.nextInt() % sd);
            // int d2 = wd.get(r.nextInt() % sd);
            // if (k % 100 == 0) {
            //     dy = r.nextInt() % d;
            // }
            int b1 = t[d1];
            // int b2 = t[d2];
            int c1 = wc.get(r.nextInt() % sc);
            // int c2 = wc.get(r.nextInt() % sc);
            // if (k % 100 == 50) {
            //     ch = r.nextInt() % n;
            // }
            t[d1] = c1;
            // t[d2] = c2;
            long score = score();
            if (max < score) {
                max = score;
            } else {
                t[d1] = b1;
                // t[d2] = b2;
            }
            // out.append(max).append('\n');
        }
        for (int i = 0; i < d; i++) {
            t[i]++;
        }
        out.append(IntArrays.join(t, "\n"));
    }

    public static long score() {
        long res = 0;
        int[] last = new int[n];
        for (int i = 0; i < d; i++) {
            last[t[i]] = i + 1;
            res += s[i][t[i]];
            for (int j = 0; j < n; j++) {
                res -= c[j] * (i + 1 - last[j]);
            }
        }
        return res;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
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

final class Random {
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;
    private int w = 88675123;
    public int nextInt() {
        int t = x ^ (x << 11);
        x = y; y = z; z = w;
        return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {
    private IntArrays(){}
    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) swap(a, i, begin + end - i - 1);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
    }
    public static void map(final int[] a, final IntUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsInt(a[i]));}
    public static int filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsInt(a[i - 1], a[i]);
    }
    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(int[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }
    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final int[] a, final int[] b) {return compare(a, b) == 0;}
    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
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



/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public IntArrayList(final int capacity) {this.a = new int[Math.max(1, capacity)];}
    public IntArrayList() {this(DEFAULT_SIZE);}
    public void add(final int v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public int removeLast() {return a[tail--];}
    public int get(final int i) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final int v) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final int[] b = new int[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void reverse(final int begin, final int end) {IntArrays.reverse(a, begin, end);}
    public void reverse() {IntArrays.reverse(a, 0, tail);}
    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public void clear() {tail = 0;}
    public PrimitiveIterator.OfInt iterator() {return new IntArrayListIterator();}
    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return a[i++];}
    }
}

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);
    public default boolean eq(final int i, final int j) {return compare(i, j) == 0;}
    public default boolean ne(final int i, final int j) {return compare(i, j) != 0;}
    public default boolean gt(final int i, final int j) {return compare(i, j) > 0;}
    public default boolean ge(final int i, final int j) {return compare(i, j) >= 0;}
    public default boolean lt(final int i, final int j) {return compare(i, j) < 0;}
    public default boolean le(final int i, final int j) {return compare(i, j) <= 0;}
}


final class IndexSort {
    public static int[] sort(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[i] - a[j]);
        return index;
    }
    public static int[] sortDescending(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[j] - a[i]);
        return index;
    }
    public static int[] sort(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[i], a[j]));
        return index;
    }
    public static int[] sortDescending(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[j], a[i]));
        return index;
    }
}

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);
    public default boolean eq(final long i, final long j) {return compare(i, j) == 0;}
    public default boolean ne(final long i, final long j) {return compare(i, j) != 0;}
    public default boolean gt(final long i, final long j) {return compare(i, j) > 0;}
    public default boolean ge(final long i, final long j) {return compare(i, j) >= 0;}
    public default boolean lt(final long i, final long j) {return compare(i, j) < 0;}
    public default boolean le(final long i, final long j) {return compare(i, j) <= 0;}
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;
    public static void sort(final int[] a, final IntComparator comparator) {sort(a, 0, a.length, comparator);}
    public static void sort(final int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) ComparativeInsertionSort.sort(a, i, j, comparator);
            else {ComparativeInsertionSort.sort(a, i, end, comparator); break;}
            i = j;
        }
        final int len = end - begin;
        final int[] work = new int[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block, to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {System.arraycopy(work, wi, a, i, block - wi); break;}
                    if (comparator.gt(work[wi], a[ti])) a[i] = a[ti++];
                    else {a[i] = work[wi++]; if (wi == block) break;}
                }
            }
        }
    }
    public static void sort(final long[] a, final LongComparator comparator) {sort(a, 0, a.length, comparator);}
    public static void sort(final long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) ComparativeInsertionSort.sort(a, i, j, comparator);
            else {ComparativeInsertionSort.sort(a, i, end, comparator); break;}
            i = j;
        }
        final int len = end - begin;
        final long[] work = new long[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block, to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {System.arraycopy(work, wi, a, i, block - wi); break;}
                    if (comparator.gt(work[wi], a[ti])) a[i] = a[ti++];
                    else {a[i] = work[wi++]; if (wi == block) break;}
                }
            }
        }
    }
}


final class ComparativeInsertionSort {
    static void sort(final int[] a, final int from, final int to, final IntComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
    static void sort(final long[] a, final int from, final int to, final LongComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {a[j] = a[j - 1]; j--;} while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
}
