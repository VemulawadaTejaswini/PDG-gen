import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        char[] s = In.nc();
        Matching m = new Matching(s);
        int q = In.ni();
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            char[] t = In.nc();
            ans[i] = m.query(t) < 0 ? 0 : 1;
        }
        out.append(IntArrays.join(ans, "\n"));
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Ints {
    private Ints(){}

    public static boolean isPowerOfTwo(int n) {
        return n != 0 && (-n & n) == n;
    }

    public static int ceilExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int floorExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class MathUtil{
    private static final long UNDER32_MASK = 0xffff_ffffl;

    private MathUtil(){}

    public static long int2ToLong(int upper, int lower) {
        return ((long) upper << Integer.SIZE) | lower;
    }

    public static int upper32(long l) {
        return (int) (l >>> Integer.SIZE);
    }

    public static int lower32(long l) {
        return (int) (l & UNDER32_MASK);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
class IntArrays {

    private IntArrays(){}

    public static void map(int[] a, IntUnaryOperator op) {
        for (int i = 0; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i]);
        }
    }

    public static void filter(int[] src, int[] dst, IntPredicate p) {
        int idx = 0;
        for (int e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(int[] dst, int beginIndex, int endIndex, IntPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(int dst[], int endIndex, IntPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(int[] a, IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i - 1], a[i]);
        }
    }

    public static void accumulate(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static String join(int[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public IntArrayList(int capacity) {
        this.a = new int[Math.max(1, capacity)];
    }

    public IntArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(int v) {
        if (tail == a.length) {
            resize(2);
        }
        a[tail++] = v;
    }

    public int removeLast() {
        return a[tail--];
    }

    public int get(int i) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        return a[i];
    }

    public void set(int i, int v) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        a[i] = v;
    }

    private void resize(double grow) {
        int[] b = new int[(int) Math.ceil(a.length * grow)];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public int[] toArray() {
        int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(int v, IntPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntArrayListIterator();
    }

    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return a[i++];
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns int array.
 */
class IntArrayGenerator {

    private IntArrayGenerator(){}
    
    public static int[] filled(int n, int init) {
        int[] ret = new int[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static int[][] filled(int n, int m, int init) {
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static int[] indexToInt(int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static int[] count(int[] a, int max) {
        int[] ret = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            ret[a[i]]++;
        }
        return ret;
    }

    public static int[] map(int[] a, IntUnaryOperator f) {
        int[] b = new int[a.length];
        Arrays.setAll(b, i -> f.applyAsInt(a[i]));
        return b;
    }

    public static int[] filter(int[] a, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int beginIndex, int endIndex, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int i = beginIndex; i < endIndex; i++) {
            ret.addIf(i, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int endIndex, IntPredicate p) {
        return filterIndex(0, endIndex, p);
    }

    public static int[] accumulate(int[] a, IntBinaryOperator op) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = op.applyAsInt(ret[i - 1], a[i]);
        }
        return ret;
    }

    public static int[] accumulate(int[] a) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + a[i];
        }
        return ret;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Implements SA-IS (buildSuffixArray Suffix Array in O(n) time.)
 */
class SuffixArray {
    private final int n;
    private final int[] sa;
    private final int[] lcp;
    private final int[] rank;

    public SuffixArray(char[] s) {
        this.n = s.length;
        this.sa = new int[n + 1];
        this.lcp = new int[n + 1];
        this.rank = new int[n + 1];
        final int[] t = new int[n + 1];
        for (int i = 0; i < n; i++) {
            t[i] = s[i];
        }
        buildSuffixArray(t);
        buildRankArray();
        buildLongestCommonPrefixArray(t);
    }

    public SuffixArray(String s) {
        this(s.toCharArray());
    }

    private SuffixArray(int[] s) {
        this.n = s.length;
        this.sa = new int[n + 1];
        this.lcp = sa; // dummy
        this.rank = sa; //dummy
        final int[] t = new int[n + 1];
        System.arraycopy(s, 0, t, 0, n);
        buildSuffixArray(t);
    }

    public int[] getSA() {
        int[] ret = new int[n];
        System.arraycopy(sa, 1, ret, 0, n);
        return ret;
    }

    public int[] getRank() {
        int[] ret = new int[n];
        for (int i = 1; i <= n; i++) {
            ret[sa[i]] = i - 1;
        }
        return ret;
    }

    public int[] getLCP() {
        int[] ret = new int[n];
        System.arraycopy(lcp, 1, ret, 0, n);
        return ret;
    }

    private boolean isLms(int i, boolean[] isL) {
        return i > 0 && isL[i - 1] && !isL[i];
    }

    private void buildSuffixArray(int[] t) {
        /**
         * the number of lms-type.
         */
        int lmsNum = 0;
        final boolean[] isL = new boolean[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            isL[i] = t[i + 1] < t[i] || t[i + 1] == t[i] && isL[i + 1];
            if (isL[i] && !isL[i + 1]) {
                lmsNum++;
            }
        }
        /**
         * index of lms's.
         */
        int[] lmss = IntArrayGenerator.filterIndex(n + 1, i -> isLms(i, isL));
        inducedSort(t, isL, lmss);
        /**
         * get sorted 'lmss-substring's.
         */
        int[] pseudoSortedLmss = IntArrayGenerator.filter(sa, e -> isLms(e, isL));
        /**
         * recycle. labeling lms-substrings.
         */
        int[] lmsLabels = sa;
        Arrays.fill(lmsLabels, -1);
        int label = 1;
        lmsLabels[pseudoSortedLmss[0]] = label;
        for (int k = 1; k < lmsNum ; k++) {
            boolean dif = false;
            for (int d = 0, i = pseudoSortedLmss[k - 1], j = pseudoSortedLmss[k];; d++, i++, j++) {
                if (t[i] != t[j] || (isLms(i, isL) ^ isLms(j, isL))) {
                    dif = true;
                    break;
                } else if (d > 0 && isLms(i, isL) && isLms(j, isL)) {
                    break;
                }
            }
            lmsLabels[pseudoSortedLmss[k]] = dif ? ++label : label;
        }
        /**
         * recycle.
         */
        int[] compactLabels = pseudoSortedLmss;
        IntArrays.filter(lmsLabels, compactLabels, e -> e >= 0);
        lmsLabels = null;
        /**
         * get Suffix Array of lms-substrings.
         */
        int[] lmsSA;
        if (label < lmsNum) {
            lmsSA = new SuffixArray(compactLabels).getSA();
        } else {
            lmsSA = new int[lmsNum];
            for (int i = 0; i < lmsNum; i++) {
                lmsSA[compactLabels[i] - 1] = i;
            }
        }
        /**
         * recycle. an array of completely-sorted lms-substrings.
         */
        int[] sortedLmss = lmsSA;
        for (int i = 0; i < lmsNum; i++) {
            sortedLmss[i] = lmss[lmsSA[i]];
        }
        lmss = null;
        inducedSort(t, isL, sortedLmss);
    }

    private void inducedSort(int[] t, boolean[] isL, int[] lmss) {
        Arrays.fill(sa, -1);
        /**
         * the beginnig index of bucket.
         */
        final int[] end = IntArrayGenerator.count(t, Math.max(Chars.SIZE, t.length));
        IntArrays.accumulate(end);
        /**
         * put LMS-Type-index on SA. (front <- back)
         */
        final int[] inserted = new int[end.length];
        for (int i = lmss.length - 1; i >= 0; i--) {
            int c = t[lmss[i]];
            sa[end[c] - 1 - inserted[c]] = lmss[i];
            inserted[c]++;
        }
        /**
         * put L-type-index on SA. (front -> back)
         */
        Arrays.fill(inserted, 0);
        for (int i = 0; i <= n; i++) {
            int pre = sa[i] - 1;
            if (pre >= 0 && isL[pre]) {
                int prec = t[pre];
                sa[end[prec - 1] + inserted[prec]] = pre;
                inserted[prec]++;
            }
        }
        /**
         * put S-Type-index on SA. (back -> front)
         */
        Arrays.fill(inserted, 0);
        for (int i = n; i >= 0; i--) {
            int pre = sa[i] - 1;
            if (pre >= 0 && !isL[pre]) {
                int prec = t[pre];
                sa[end[prec] - 1 - inserted[prec]] = pre;
                inserted[prec]++;
            }
        }
    }

    private void buildRankArray() {
        for (int i = 0; i <= n; i++) {
            rank[sa[i]] = i;
        }
    }

    private void buildLongestCommonPrefixArray(int[] t) {
        for (int i = 0, k = 0; i <= n; i++, k = k > 0 ? k - 1 : k) {
            int idx = rank[i];
            if (idx == n) {
                k = 0;
                continue;
            }
            int j = sa[idx + 1];
            while (t[i + k] == t[j + k]) {
                k++;
            }
            lcp[idx] = k;
        }
    }
}

class Matching {
    private final int n; // the length of S.
    private final char[] s; // String S.
    private final int[] sa; // suffix array of S.
    private final int[] seg; // 1-indexed SegmentTree.
    private final int btm; // the size of the lowest level of the segTree.

    public Matching(char[] s) {
        SuffixArray a = new SuffixArray(s);
        this.n = s.length;
        this.s = s;
        this.sa = a.getSA();
        this.btm = 1 << Ints.ceilExponent(n);
        this.seg = new int[btm << 1];
        buildSegTree(a.getLCP());
    }

    public int query(char[] t) {
        int l = 0, r = btm;
        int ltlcp = MathUtil.upper32(lcpAndCmp(t, 0, 0));
        int k = 1;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            int lmlcp = seg[k << 1];
            if (lmlcp == Const.IINF || ltlcp > lmlcp) {
                r = m;
            } else if (ltlcp < lmlcp) {
                l = m;
            } else {
                long p = lcpAndCmp(t, m, ltlcp);
                int lcp = MathUtil.upper32(p);
                int cmp = MathUtil.lower32(p);
                if (cmp >= 0) {
                    l = m;
                    ltlcp = lcp;
                } else {
                    r = m;
                }
            }
            k = r == m ? k << 1 : (k << 1) | 1;
        }
        return ltlcp == t.length ? l : -1;
    }

    private long lcpAndCmp(char[] t, int index, int offset) {
        if (index >= n) {
            return MathUtil.int2ToLong(offset, -1);
        }
        int ti = offset;
        int si = sa[index] + offset;
        while (ti < t.length && si < n) {
            if (t[ti] == s[si]) {
                ti++;
                si++;
            } else {
                return MathUtil.int2ToLong(ti, t[ti] - s[si]);
            }
        }
        return MathUtil.int2ToLong(ti, 0);
    }

    private void buildSegTree(int[] lcp) {
        System.arraycopy(lcp, 0, seg, btm, n);
        for (int i = btm + n; i < seg.length; i++) {
            seg[i] = Const.IINF;
        }
        for (int i = btm - 1; i >= 1; i--) {
            seg[i] = Math.min(seg[i << 1], seg[(i << 1) | 1]);
        }
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

    private Const(){}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Chars {
    public static final int SIZE = 128;

    private Chars(){}

    public static int[] count(char[] s) {
        int[] cnt = new int[SIZE];
        int n = s.length;
        for (int i = 0; i < n; i++) {
            cnt[s[i]]++;
        }
        return cnt;
    }
}

