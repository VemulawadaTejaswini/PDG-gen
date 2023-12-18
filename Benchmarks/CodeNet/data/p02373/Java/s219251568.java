import java.io.*;
import java.util.*;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.print(out);
        pw.flush();
        pw.close();
    }
    public static void solve(StringBuilder out) {
        int n = In.ni();
        Tree t = new Tree(n);
        for (int u = 0; u < n; u++) {
            int k = In.ni();
            for (int j = 0; j < k; j++) {
                int v = In.ni();
                t.addEdge(u, v);
            }
        }
        DoublingLCA lca = new DoublingLCA(t);
        int q = In.ni();
        for (int i = 0; i < q; i++) {
            int u = In.ni();
            int v = In.ni();
            out.append(lca.query(u, v)).append('\n');
        }
    }
}

final class Ints {
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private Ints(){}

    public static int max(final int... a) {
        int ret = Integer.MIN_VALUE;
        for (final int e : a) {
            ret = Math.max(ret, e);
        }
        return ret;
    }

    public static int min(final int... a) {
        int ret = Integer.MAX_VALUE;
        for (final int e : a) {
            ret = Math.min(ret, e);
        }
        return ret;
    }

    public static int reduce(final IntBinaryOperator func, final int... a) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = func.applyAsInt(ret, a[i]);
        }
        return ret;
    }

    public static boolean isPowerOfTwo(final int n) {
        return n != 0 && (-n & n) == n;
    }

    public static int ceilExponent(final int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int floorExponent(final int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
    }

    public static String join(final String sep, final int... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}



final class MathUtil{
    private static final long UNDER32_MASK = 0xffff_ffffl;

    private MathUtil(){}

    /**
     * caluculate a ^ b NOT considering overflow. so if you want to calculate a ^ b
     * (mod p), use ModUtil.pow(a, b).
     * 
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(final int a, long b) {
        long ret = 1l;
        for (long c = 1, ac = a; b > 0; ac *= ac, c <<= 1) {
            if ((-b & b) == c) {
                ret *= ac;
                b &= ~(-b & b);
            }
        }
        return ret;
    }

    /**
     * Caluculate the combination nCr NOT considering overflow.
     * 
     * @param n left
     * @param r right
     * @return nCr
     */
    public static long comb(long n, long r) {
        if (n < r)
            return 0;
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) {
            res *= n--;
            res /= d;
        }
        return res;
    }

    public static long ceilSqrt(final long n) {
        long l = -1;
        long r = n;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m >= n) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    public static long floorSqrt(final long n) {
        long l = 0;
        long r = n + 1;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m > n) {
                r = m;
            } else {
                l = m;
            }
        }
        return l;
    }

    public static long int2ToLong(final int upper, final int lower) {
        return ((long) upper << Integer.SIZE) | lower;
    }

    public static int upper32(final long l) {
        return (int) (l >>> Integer.SIZE);
    }

    public static int lower32(final long l) {
        return (int) (l & UNDER32_MASK);
    }
}



final class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(final IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }
}


final class FastScanner {
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
            } catch (final IOException e) {
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

    private static boolean isPrintableChar(final int c) {
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
        final StringBuilder sb = new StringBuilder();
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
        final long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}




final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public IntArrayList(final int capacity) {
        this.a = new int[Math.max(1, capacity)];
    }

    public IntArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(final int v) {
        if (tail == a.length) {
            resize(2);
        }
        a[tail++] = v;
    }

    public int removeLast() {
        return a[tail--];
    }

    public int get(final int i) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        return a[i];
    }

    public void set(final int i, final int v) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        a[i] = v;
    }

    private void resize(final double grow) {
        final int[] b = new int[(int) Math.ceil(a.length * grow)];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(final int begin, final int end) {
        IntArrays.reverse(a, begin, end);
    }

    public void reverse() {
        IntArrays.reverse(a, 0, tail);
    }

    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(final int v, final IntPredicate p) {
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
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {

    private IntArrays(){}

    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(final int[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(final int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsInt(ret, a[i]);
        }
        return ret;
    }

    public static void map(final int[] a, final IntUnaryOperator op) {
        Arrays.setAll(a, i -> op.applyAsInt(a[i]));
    }

    public static void filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i - 1], a[i]);
        }
    }

    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(int[] a) {
        final HashSet<Integer> set = new HashSet<>();
        for (final int e : a) {
            set.add(e);
        }
        final int m = set.size();
        final int[] b = new int[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        a = b;
        return m;
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

    public static void transpose(int[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(final int[] a, final int[] b) {
        return compare(a, b) == 0;
    }

    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre,
            final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}



final class DoublingLCA {
    private final int[] dep;
    private final Doubling ancestor;

    public DoublingLCA(final Tree t) {
        this.dep = t.dep();
        this.ancestor = new Doubling(t.parent(), Ints.max(this.dep));
    }

    public int query(final int u, int v) {
        if (dep[u] > dep[v]) {
            return query(v, u);
        }
        v = ancestor.query(v, dep[v] - dep[u]);
        return ancestor.biStepUntil(u, v, (x, y) -> x == y)[0];
    }
}




final class Tree {
    public final int n;
    public final int root;

    private final IntArrayList[] adj;
    private final int[] par;
    private final int[] dep;

    protected boolean bfs = false;

    public Tree(final int n, final int root) {
        this.n = n;
        this.root = root;
        this.adj = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new IntArrayList();
        }
        this.par = new int[n];
        this.dep = new int[n];
    }

    public Tree(final int n) {
        this(n, 0);
    }

    public void addEdge(final int from, final int to) {
        adj[from].add(to);
        adj[to].add(from);
    }

    public int getEdge(final int from, final int index) {
        return adj[from].get(index);
    }

    public IntArrayList getEdges(final int i) {
        return adj[i];
    }

    public int out(final int i) {
        return adj[i].size();
    }

    public int parent(final int i) {
        return parent()[i];
    }

    public int[] parent() {
        if (!bfs) {
            bfs();
            bfs = true;
        }
        return par;
    }

    public int dep(final int i) {
        return dep()[i];
    }

    public int[] dep() {
        if (!bfs) {
            bfs();
            bfs = true;
        }
        return dep;
    }

    private void bfs() {
        final IntQueue que = new IntQueue(n);
        que.add(root);
        par[root] = root;
        while (que.size() > 0) {
            final int v = que.poll();
            final PrimitiveIterator.OfInt iter = getEdges(v).iterator();
            while (iter.hasNext()) {
                final int u = iter.nextInt();
                if (u != par[v]) {
                    dep[u] = dep[v] + 1;
                    par[u] = v;
                    que.add(u);
                }
            }
        }
    }
}



@FunctionalInterface
interface IntBiPredicate {
    static final int INT_BIT = 32;
    static final long MASK = 0xffff_ffffl;

    public boolean test(int x, int y);

    default public IntPredicate curry(final int x) {
        return y -> test(x, y);
    }

    default public LongPredicate toLongPredicate() {
        return l -> test((int) (l >>> INT_BIT), (int) (l & MASK));
    }

    default public IntBiPredicate negate() {
        return (x, y) -> !test(x, y);
    }

    default public IntBiPredicate and(final IntBiPredicate other) {
        return (x, y) -> test(x, y) && other.test(x, y);
    }

    default public IntBiPredicate or(final IntBiPredicate other) {
        return (x, y) -> test(x, y) || other.test(x, y);
    }

    default public IntBiPredicate xor(final IntBiPredicate other) {
        return (x, y) -> test(x, y) ^ other.test(x, y);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Queue for int type.
 */
final class IntQueue implements Iterable<Integer> {
    private static final int DEFAULT_SIZE = 64;

    private int[] q;
    private int head = 0;
    private int tail = 0;

    public IntQueue(final int capacity) {
        this.q = new int[capacity];
    }

    public IntQueue() {
        this(DEFAULT_SIZE);
    }

    public int peek() {
        if (head == tail) {
            throw new NoSuchElementException("No Elements.");
        }
        return q[head];
    }

    public int getFromHead(int index) {
        if (head + index >= tail || index < 0) {
            throw new NoSuchElementException("Index out of bounds.");
        }
        return q[head + index];
    }

    public int getFromTail(int index) {
        if (head + index >= tail || index < 0) {
            throw new NoSuchElementException("Index out of bounds.");
        }
        return q[tail - 1 - index];
    }

    public void add(final int v) {
        if (tail == q.length) {
            grow();
        }
        q[tail++] = v;
    }

    public int poll() {
        if (head == tail) {
            throw new NoSuchElementException("No Elements.");
        }
        return q[head++];
    }

    public int size() {
        return tail - head;
    }

    private void grow() {
        final int[] grown = new int[q.length << 1];
        final int len = size();
        System.arraycopy(q, head, grown, 0, len);
        q = grown;
        tail = len;
        head = 0;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntQueueIterator();
    }

    private class IntQueueIterator implements PrimitiveIterator.OfInt {
        private int i = head;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return q[i++];
        }
    }
}



final class Longs {
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private Longs(){}

    public static long max(final long... a) {
        long ret = Long.MIN_VALUE;
        for (final long e : a) {
            ret = Math.max(ret, e);
        }
        return ret;
    }

    public static long min(final long... a) {
        long ret = Long.MAX_VALUE;
        for (final long e : a) {
            ret = Math.min(ret, e);
        }
        return ret;
    }

    public static long reduce(final LongBinaryOperator func, final long... a) {
        long ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = func.applyAsLong(ret, a[i]);
        }
        return ret;
    }

    public static boolean isPowerOfTwo(final long n) {
        return n != 0 && (-n & n) == n;
    }

    public static int ceilExponent(final long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int floorExponent(final long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
    }

    public static int ceilExponent(final long n, final int base) {
        if (base == 2) {
            return ceilExponent(n);
        }
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            final long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) {
                break;
            }
            m = r;
        }
        return i;
    }

    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static long cld(final long a, final long b) {
        if (a > 0 && b > 0)
            return (a + b - 1) / b;
        else if (a < 0 && b < 0)
            return (a + b + 1) / b;
        else
            return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static long fld(final long a, final long b) {
        if (a <= 0 && b > 0)
            return (a - b + 1) / b;
        else if (a > 0 && b <= 0)
            return (a - b - 1) / b;
        else
            return a / b;
    }

    public static String join(final String sep, final long... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String toBinaryString(long n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Long.SIZE; i++, n >>= 1) {
            sb.append(n & 1);
            if ((i & 3) == 3) {
                sb.append('_');
            }
        }
        return sb.reverse().toString();
    }

    public static String toHexString(long n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0, t = Long.SIZE >> 2; i < t; i++, n >>= 4) {
            sb.append(hex[(int) n & 0xf]);
            if ((i & 3) == 3) {
                sb.append('_');
            }
        }
        return sb.reverse().toString();
    }
}




final class Doubling {
    private final int[][] doubling;
    private final int height;
    private final int n;

    public Doubling(final int[] a, final long maxStep) {
        this.n = a.length;
        this.height = Longs.ceilExponent(maxStep) + 2;
        this.doubling = new int[height][n];
        build(a);
    }

    public int getHeight() {
        return height;
    }

    public int query(int i, long step) {
        int h = height - 1;
        while (step > 0) {
            if ((step & (1l << h)) != 0) {
                i = doubling[h][i];
                step ^= 1l << h;
            }
            h--;
        }
        return i;
    }

    public int step(final int i, final int exponent) {
        return doubling[exponent][i];
    }

    public int stepWhile(int i, final IntPredicate p) {
        int h = height - 1;
        while (h >= 0) {
            if (p.test(doubling[h][i])) {
                i = doubling[h][i];
            }
            h--;
        }
        return i;
    }

    public int stepUntil(final int i, final IntPredicate p) {
        return p.test(i) ? i : doubling[0][stepWhile(i, p.negate())];
    }

    public int[] biStep(final int u, final int v, final int exponent) {
        final int us = doubling[exponent][u];
        final int vs = doubling[exponent][v];
        return new int[]{us, vs};
    }

    private long biStep(final long uv, final int exponent) {
        final int u = MathUtil.upper32(uv);
        final int v = MathUtil.lower32(uv);
        return MathUtil.int2ToLong(doubling[exponent][u], doubling[exponent][v]);
    }

    public int[] biStepWhile(final int u, final int v, final IntBiPredicate p) {
        final long ret = biStepWhile(MathUtil.int2ToLong(u, v), p.toLongPredicate());
        return new int[]{MathUtil.upper32(ret), MathUtil.lower32(ret)};
    }

    private long biStepWhile(long uv, final LongPredicate p) {
        int h = height - 1;
        while (h >= 0) {
            final long step = biStep(uv, h);
            if (p.test(step)) {
                uv = step;
            }
            h--;
        }
        return uv;
    }

    public int[] biStepUntil(final int u, final int v, final IntBiPredicate p) {
        final long ret = biStepUntil(MathUtil.int2ToLong(u, v), p.toLongPredicate());
        return new int[]{MathUtil.upper32(ret), MathUtil.lower32(ret)};
    }

    private long biStepUntil(final long uv, final LongPredicate p) {
        return p.test(uv) ? uv : biStep(biStepWhile(uv, p.negate()), 0);
    }

    public int[] parallelStep(final int[] a, final int exponent) {
        final int[] ret = a.clone();
        for (int i = 0; i < a.length; i++) {
            ret[i] = doubling[exponent][a[i]];
        }
        return ret;
    }

    public int[] parallelStepWhile(final int[] a, final Predicate<int[]> p) {
        int[] ret = a.clone();
        int h = height - 1;
        while (h >= 0) {
            final int[] step = parallelStep(ret, h);
            if (p.test(step)) {
                ret = step;
            }
            h--;
        }
        return ret;
    }

    public int[] parallelStepUntil(final int[] a, final Predicate<int[]> p) {
        return p.test(a) ? a.clone() : parallelStep(parallelStepWhile(a, p.negate()), 0);
    }

    private void build(final int[] a) {
        doubling[0] = a.clone();
        for (int h = 1; h < height; h++) {
            for (int i = 0; i < n; i++) {
                doubling[h][i] = doubling[h - 1][doubling[h - 1][i]];
            }
        }
    }
}

