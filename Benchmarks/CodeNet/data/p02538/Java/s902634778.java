import java.io.InputStream;
import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static final long mod = Const.MOD998244353;
    static final ModArithmetic ma = ModArithmetic.of(mod);

    public static void main(String[] args) throws Exception {
        ExtendedScanner sc = new ExtendedScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    static long[] pow;

    public static void solve(ExtendedScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int k = 1;
        while (k < n) k <<= 1;
        pow = ma.rangePower(10, n << 1);
        Sum[] init = new Sum[n];
        for (int i = 0; i < n; i++) {
            init[i] = new Sum(1, 1);
        }
        long inv9 = ma.inv(9);
        LazySegmentTree<Sum, Long> t = new LazySegmentTree<>(
            init, Sum::add, Sum.E, (v, s) -> {
                return new Sum(s.l, ma.mul(v, ma.mul(pow[s.l] - 1, inv9)));
            }, (u, v) -> u, -1l);
        long invpow = ma.inv(pow[k - n]);
        while (q --> 0) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            long d = sc.nextInt();
            t.apply(l, r, d);
            pw.println(ma.mul(t.allProd().sum, invpow));
        }
    }

    static class Sum {
        static final Sum E = new Sum(1, 0);
        public int l;
        public long sum;
        public Sum(int l, long sum) {
            this.l = l; this.sum = sum;
        }
        public Sum add(Sum s) {
            return new Sum(l + s.l, ma.add(ma.mul(pow[l], sum), s.sum));
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[1 << 13];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends FastScanner {
    public ExtendedScanner() {super();}
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}

class LazySegmentTree<S, F> {

    @FunctionalInterface
    public static interface FunMergerLR<Func> {
        public Func apply(Func func, int left, int right);
    }

    @FunctionalInterface
    public static interface FunMergerWidth<Func> {
        public Func apply(Func func, int w);
    }

    final int MAX;

    final int N;
    final int Log;
    final java.util.function.BinaryOperator<S> Op;
    final S E;
    final java.util.function.BiFunction<F, S, S> Mapping;
    final java.util.function.BinaryOperator<F> Composition;
    final FunMergerLR<F> ProdComposition;
    final F Id;

    final S[] Dat;
    final F[] Laz;

    @SuppressWarnings("unchecked")
    public LazySegmentTree(int n, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, FunMergerLR<F> prodComposition, F id) {
        this.MAX = n;
        int k = 1;
        while (k < n) k <<= 1;
        this.N = k;
        this.Log = Integer.numberOfTrailingZeros(N);
        this.Op = op;
        this.E = e;
        this.Mapping = mapping;
        this.Composition = composition;
        this.ProdComposition = prodComposition;
        this.Id = id;
        this.Dat = (S[]) new Object[N << 1];
        this.Laz = (F[]) new Object[N];
        java.util.Arrays.fill(Dat, E);
        java.util.Arrays.fill(Laz, Id);
    }

    public LazySegmentTree(int n, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, FunMergerWidth<F> prodComposition, F id) {
        this(n, op, e, mapping, composition, (f, l, r) -> prodComposition.apply(f, r - l), id);
    }

    public LazySegmentTree(int n, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, F id) {
        this(n, op, e, mapping, composition, (f, l, r) -> f, id);
    }

    public LazySegmentTree(S[] dat, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, FunMergerLR<F> prodComposition, F id) {
        this(dat.length, op, e, mapping, composition, prodComposition, id);
        build(dat);
    }

    public LazySegmentTree(S[] dat, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, FunMergerWidth<F> prodComposition, F id) {
        this(dat.length, op, e, mapping, composition, prodComposition, id);
        build(dat);
    }

    public LazySegmentTree(S[] dat, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, F id) {
        this(dat.length, op, e, mapping, composition, id);
        build(dat);
    }

    private void build(S[] dat) {
        int l = dat.length;
        System.arraycopy(dat, 0, Dat, N, l);
        for (int i = N - 1; i > 0; i--) {
            Dat[i] = Op.apply(Dat[i << 1 | 0], Dat[i << 1 | 1]);
        }
    }

    private void push(int k, int h) {
        if (Laz[k] == Id) return;
        int w = 1 << h - 1;
        int l = (k << h) ^ N;
        int lk = k << 1 | 0, rk = k << 1 | 1;
        Dat[lk] = Mapping.apply(ProdComposition.apply(Laz[k], l, l += w), Dat[lk]);
        Dat[rk] = Mapping.apply(ProdComposition.apply(Laz[k], l, l += w), Dat[rk]);
        if (lk < N) Laz[lk] = Composition.apply(Laz[k], Laz[lk]);
        if (rk < N) Laz[rk] = Composition.apply(Laz[k], Laz[rk]);
        Laz[k] = Id;
    }

    private void pushTo(int k) {
        for (int i = Log; i > 0; i--) push(k >> i, i);
    }

    private void pushTo(int lk, int rk) {
        for (int i = Log; i > 0; i--) {
            if (((lk >> i) << i) != lk) push(lk >> i, i);
            if (((rk >> i) << i) != rk) push(rk >> i, i);
        }
    }

    private void updateFrom(int k) {
        k >>= 1;
        while (k > 0) {
            Dat[k] = Op.apply(Dat[k << 1 | 0], Dat[k << 1 | 1]);
            k >>= 1;
        }
    }

    private void updateFrom(int lk, int rk) {
        for (int i = 1; i <= Log; i++) {
            if (((lk >> i) << i) != lk) {
                int lki = lk >> i;
                Dat[lki] = Op.apply(Dat[lki << 1 | 0], Dat[lki << 1 | 1]);
            }
            if (((rk >> i) << i) != rk) {
                int rki = (rk - 1) >> i;
                Dat[rki] = Op.apply(Dat[rki << 1 | 0], Dat[rki << 1 | 1]);
            }
        }
    }

    public void set(int p, S x) {
        exclusiveRangeCheck(p);
        p += N;
        pushTo(p);
        Dat[p] = x;
        updateFrom(p);
    }

    public S get(int p) {
        exclusiveRangeCheck(p);
        p += N;
        pushTo(p);
        return Dat[p];
    }

    public S prod(int l, int r) {
        if (l > r) {
            throw new IllegalArgumentException(
                String.format("Invalid range: [%d, %d)", l, r)
            );
        }
        inclusiveRangeCheck(l);
        inclusiveRangeCheck(r);
        if (l == r) return E;
        l += N; r += N;
        pushTo(l, r);
        S sumLeft = E, sumRight = E;
        while (l < r) {
            if ((l & 1) == 1) sumLeft = Op.apply(sumLeft, Dat[l++]);
            if ((r & 1) == 1) sumRight = Op.apply(Dat[--r], sumRight);
            l >>= 1; r >>= 1;
        }
        return Op.apply(sumLeft, sumRight);
    }

    public S allProd() {
        return Dat[1];
    }

    public void apply(int p, F f) {
        exclusiveRangeCheck(p);
        int pk = p + N;
        pushTo(pk);
        Dat[pk] = Mapping.apply(ProdComposition.apply(f, p, p + 1), Dat[pk]);
        updateFrom(pk);
    }

    public void apply(int l, int r, F f) {
        if (l > r) {
            throw new IllegalArgumentException(
                String.format("Invalid range: [%d, %d)", l, r)
            );
        }
        inclusiveRangeCheck(l);
        inclusiveRangeCheck(r);
        if (l == r) return;
        l += N; r += N;
        pushTo(l, r);
        for (int l2 = l, r2 = r, h = 0; l2 < r2; h++) {
            if ((l2 & 1) == 1) {
                int l2l = (l2 << h) ^ N;
                Dat[l2] = Mapping.apply(ProdComposition.apply(f, l2l, l2l + (1 << h)), Dat[l2]);
                if (l2 < N) Laz[l2] = Composition.apply(f, Laz[l2]);
                l2++;
            }
            if ((r2 & 1) == 1) {
                r2--;
                int r2l = (r2 << h) ^ N;
                Dat[r2] = Mapping.apply(ProdComposition.apply(f, r2l, r2l + (1 << h)), Dat[r2]);
                if (r2 < N) Laz[r2] = Composition.apply(f, Laz[r2]);
            }
            l2 >>= 1; r2 >>= 1;
        }
        updateFrom(l, r);
    }

    public int maxRight(int l, java.util.function.Predicate<S> g) {
        inclusiveRangeCheck(l);
        if (!g.test(E)) {
            throw new IllegalArgumentException("Identity element must satisfy the condition.");
        }
        if (l == MAX) return MAX;
        l += N;
        pushTo(l);
        S sum = E;
        do {
            l >>= Integer.numberOfTrailingZeros(l);
            if (!g.test(Op.apply(sum, Dat[l]))) {
                while (l < N) {
                    push(l, 31 - Integer.numberOfLeadingZeros(l));
                    l = l << 1;
                    if (g.test(Op.apply(sum, Dat[l]))) {
                        sum = Op.apply(sum, Dat[l]);
                        l++;
                    }
                }
                return l - N;
            }
            sum = Op.apply(sum, Dat[l]);
            l++;
        } while ((l & -l) != l);
        return MAX;
    }

    public int minLeft(int r, java.util.function.Predicate<S> g) {
        inclusiveRangeCheck(r);
        if (!g.test(E)) {
            throw new IllegalArgumentException("Identity element must satisfy the condition.");
        }
        if (r == 0) return 0;
        r += N;
        pushTo(r - 1);
        S sum = E;
        do {
            r--;
            while (r > 1 && (r & 1) == 1) r >>= 1;
            if (!g.test(Op.apply(Dat[r], sum))) {
                while (r < N) {
                    push(r, 31 - Integer.numberOfLeadingZeros(r));
                    r = r << 1 | 1;
                    if (g.test(Op.apply(Dat[r], sum))) {
                        sum = Op.apply(Dat[r], sum);
                        r--;
                    }
                }
                return r + 1 - N;
            }
            sum = Op.apply(Dat[r], sum);
        } while ((r & -r) != r);
        return 0;
    }

    private void exclusiveRangeCheck(int p) {
        if (p < 0 || p >= MAX) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is not in [%d, %d).", p, 0, MAX)
            );
        }
    }

    private void inclusiveRangeCheck(int p) {
        if (p < 0 || p > MAX) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is not in [%d, %d].", p, 0, MAX)
            );
        }
    }

    // **************** DEBUG **************** //

    private int indent = 6;

    public void setIndent(int newIndent) {
        this.indent = newIndent;
    }

    @Override
    public String toString() {
        return toSimpleString();
    }

    private S[] simulatePushAll() {
        S[] simDat = java.util.Arrays.copyOf(Dat, 2 * N);
        F[] simLaz = java.util.Arrays.copyOf(Laz, 2 * N);
        for (int k = 1; k < N; k++) {
            if (simLaz[k] == Id) continue;
            int lk = k << 1 | 0, rk = k << 1 | 1;
            simDat[lk] = Mapping.apply(simLaz[k], simDat[lk]);
            simDat[rk] = Mapping.apply(simLaz[k], simDat[rk]);
            if (lk < N) simLaz[lk] = Composition.apply(simLaz[k], simLaz[lk]);
            if (rk < N) simLaz[rk] = Composition.apply(simLaz[k], simLaz[rk]);
            simLaz[k] = Id;
        }
        return simDat;
    }

    public String toDetailedString() {
        return toDetailedString(1, 0, simulatePushAll());
    }

    private String toDetailedString(int k, int sp, S[] dat) {
        if (k >= N) return indent(sp) + dat[k];
        String s = "";
        s += toDetailedString(k << 1 | 1, sp + indent, dat);
        s += "\n";
        s += indent(sp) + dat[k];
        s += "\n";
        s += toDetailedString(k << 1 | 0, sp + indent, dat);
        return s;
    }

    private static String indent(int n) {
        StringBuilder sb = new StringBuilder();
        while (n --> 0) sb.append(' ');
        return sb.toString();
    }

    public String toSimpleString() {
        S[] dat = simulatePushAll();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < N; i++) {
            sb.append(dat[i + N]);
            if (i < N - 1) sb.append(',').append(' ');
        }
        sb.append(']');
        return sb.toString();
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 13;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                Object value = strField.get(s);
                if (value instanceof byte[]) {
                    return print((byte[]) value);
                } else {
                    return print((char[]) value);
                }
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -precision) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}

class Const {
    public static final long   LINF   = 1l << 59;
    public static final int    IINF   = (1  << 30) - 1;
    public static final double DINF   = 1e150;
    
    public static final double SMALL  = 1e-12;
    public static final double MEDIUM = 1e-9;
    public static final double LARGE  = 1e-6;

    public static final long MOD1000000007 = 1000000007;
    public static final long MOD998244353  = 998244353 ;
    public static final long MOD754974721  = 754974721 ;
    public static final long MOD167772161  = 167772161 ;
    public static final long MOD469762049  = 469762049 ;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};
}


/**
 * @author https://atcoder.jp/users/suisen
 */
interface ModArithmetic {
    public static ModArithmetic of(long mod) {
        if (mod <= 0) {
            throw new IllegalArgumentException("Negative mod");
        } else if (mod == 1) {
            return new ModArithmetic1();
        } else if (mod == 2) {
            return new ModArithmetic2();
        } else if (mod == 1000000007) {
            return new ModArithmetic1000000007();
        } else if (mod == 998244353) {
            return new ModArithmetic998244353();
        } else {
            return new ModArithmeticDynamic(mod);
            // return new ModArithmeticBarrett(mod);
        }
    }
    public long getMod();
    public long mod(long a);
    public long add(long a, long b);
    public long sub(long a, long b);
    public long mul(long a, long b);
    public long inv(long a);
    public long pow(long a, long b);
    public default long add(long a, long b, long c) {
        return add(a, add(b, c));
    }
    public default long add(long a, long b, long c, long d) {
        return add(a, add(b, add(c, d)));
    }
    public default long add(long a, long b, long c, long d, long e) {
        return add(a, add(b, add(c, add(d, e))));
    }
    public default long add(long a, long b, long c, long d, long e, long f) {
        return add(a, add(b, add(c, add(d, add(e, f)))));
    }
    public default long add(long a, long b, long c, long d, long e, long f, long g) {
        return add(a, add(b, add(c, add(d, add(e, add(f, g))))));
    }
    public default long add(long a, long b, long c, long d, long e, long f, long g, long h) {
        return add(a, add(b, add(c, add(d, add(e, add(f, add(g, h)))))));
    }
    public default long add(long... xs) {
        long s = 0;
        for (long x : xs) s += x;
        return mod(s);
    }
    public default long mul(long a, long b, long c) {
        return mul(a, mul(b, c));
    }
    public default long mul(long a, long b, long c, long d) {
        return mul(a, mul(b, mul(c, d)));
    }
    public default long mul(long a, long b, long c, long d, long e) {
        return mul(a, mul(b, mul(c, mul(d, e))));
    }
    public default long mul(long a, long b, long c, long d, long e, long f) {
        return mul(a, mul(b, mul(c, mul(d, mul(e, f)))));
    }
    public default long mul(long a, long b, long c, long d, long e, long f, long g) {
        return mul(a, mul(b, mul(c, mul(d, mul(e, mul(f, g))))));
    }
    public default long mul(long a, long b, long c, long d, long e, long f, long g, long h) {
        return mul(a, mul(b, mul(c, mul(d, mul(e, mul(f, mul(g, h)))))));
    }
    public default long mul(long... xs) {
        long s = 1;
        for (long x : xs) s = mul(s, x);
        return s;
    }
    public default long div(long a, long b) {
        return mul(a, inv(b));
    }
    public default java.util.OptionalLong sqrt(long a) {
        a = mod(a);
        if (a == 0) return java.util.OptionalLong.of(0);
        if (a == 1) return java.util.OptionalLong.of(1);
        long p = getMod();
        if (pow(a, (p - 1) >> 1) != 1) return java.util.OptionalLong.empty();
        if ((p & 3) == 3) {
            return java.util.OptionalLong.of(pow(a, (p + 1) >> 2));
        }
        if ((p & 7) == 5) {
            if (pow(a, (p - 1) >> 2) == 1) {
                return java.util.OptionalLong.of(pow(a, (p + 3) >> 3));
            } else {
                return java.util.OptionalLong.of(mul(pow(2, (p - 1) >> 2), pow(a, (p + 3) >> 3)));
            }
        }
        long S = 0;
        long Q = p - 1;
        while ((Q & 1) == 0) {
            ++S;
            Q >>= 1;
        }
        long z = 1;
        while (pow(z, (p - 1) >> 1) != p - 1) ++z;
        long c = pow(z, Q);
        long R = pow(a, (Q + 1) / 2);
        long t = pow(a, Q);
        long M = S;
        while (t != 1) {
            long cur = t;
            int i;
            for (i = 1; i < M; i++) {
                cur = mul(cur, cur);
                if (cur == 1) break;
            }
            long b = pow(c, 1l << (M - i - 1));
            R = mul(R, b);
            t = mul(t, b, b);
            c = mul(b, b);
            M = i;
        }
        return java.util.OptionalLong.of(R);
    }

    /** array operations */

    public default long[] rangeInv(int n) {
        final long MOD = getMod();
        if (n >= MOD) throw new ArithmeticException("divide by zero");
        long[] invs = new long[n + 1];
        invs[1] = 1;
        for (int i = 2; i <= n; i++) {
            long q = MOD - MOD / i;
            long r = invs[(int) (MOD % i)];
            invs[i] = mul(q, r);
        }
        return invs;
    }
    public default long[] arrayInv(long[] a) {
        int n = a.length;
        long[] dp = new long[n + 1];
        long[] pd = new long[n + 1];
        dp[0] = pd[n] = 1;
        for (int i = 0; i < n; i++) dp[i + 1] = mul(dp[i], a[i    ]);
        for (int i = n; i > 0; i--) pd[i - 1] = mul(pd[i], a[i - 1]);
        long inv = inv(dp[n]);
        long[] invs = new long[n];
        for (int i = 0; i < n; i++) {
            long lr = mul(dp[i], pd[i + 1]);
            invs[i] = mul(lr, inv);
        }
        return invs;
    }
    public default long[] factorial(int n) {
        long[] ret = new long[n + 1];
        ret[0] = 1;
        for (int i = 1; i <= n; i++) ret[i] = mul(ret[i - 1], i);
        return ret;
    }
    public default long[] factorialInv(int n) {
        long facN = 1;
        for (int i = 2; i <= n; i++) facN = mul(facN, i);
        long[] invs = new long[n + 1];
        invs[n] = inv(facN);
        for (int i = n; i > 0; i--) invs[i - 1] = mul(invs[i], i);
        return invs;
    }
    public default long[] rangePower(long a, int n) {
        a = mod(a);
        long[] pows = new long[n + 1];
        pows[0] = 1;
        for (int i = 1; i <= n; i++) pows[i] = mul(pows[i - 1], a);
        return pows;
    }

    /** combinatric operations */

    public default long[][] combTable(int n) {
        long[][] comb = new long[n + 1][];
        for (int i = 0; i <= n; i++) {
            comb[i] = new long[i + 1];
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = add(comb[i - 1][j - 1], comb[i - 1][j]);
            }
        }
        return comb;
    }
    public default long comb(int n, int r, long[] factorial, long[] invFactorial) {
        if (r < 0 || r > n) return 0;
        long inv = mul(invFactorial[r], invFactorial[n - r]);
        return mul(factorial[n], inv);
    }
    public default long naiveComb(long n, long r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        if (r == 0) return 1;
        long res = 1;
        long[] invs = rangeInv(Math.toIntExact(r));
        for (int d = 1; d <= r; d++) {
            res = mul(res, n--, invs[d]);
        }
        return res;
    }
    public default long perm(int n, int r, long[] factorial, long[] invFactorial) {
        if (r < 0 || r > n) return 0;
        return mul(factorial[n], invFactorial[n - r]);
    }
    public default long naivePerm(long n, long r) {
        if (r < 0 || r > n) return 0;
        long res = 1;
        for (long i = n - r + 1; i <= n; i++) res = mul(res, i);
        return res;
    }
    static final class ModArithmetic1 implements ModArithmetic {
        @Override public long getMod() {return 1;}
        @Override public long mod(long a) {return 0;}
        @Override public long add(long a, long b) {return 0;}
        @Override public long sub(long a, long b) {return 0;}
        @Override public long mul(long a, long b) {return 0;}
        @Override public long inv(long a) {return 0;}
        @Override public long pow(long a, long b) {return 0;}
        @Override public long[] rangeInv(int n) {return new long[n + 1];}
        @Override public long[] arrayInv(long[] a) {return new long[a.length];}
        @Override public long[] factorial(int n) {return new long[n + 1];}
        @Override public long[] factorialInv(int n) {return new long[n + 1];}
        @Override public long[] rangePower(long a, int n) {return new long[n + 1];}
        @Override public long[][] combTable(int n) {return new long[n + 1][n + 1];}
        @Override public long comb(int n, int r, long[] factorial, long[] invFactorial) {return 0;}
        @Override public long naiveComb(long n, long r) {return 0;}
        @Override public long perm(int n, int r, long[] factorial, long[] invFactorial) {return 0;}
        @Override public long naivePerm(long n, long r) {return 0;}
    }
    static final class ModArithmetic2 implements ModArithmetic {
        @Override public long getMod() {return 2;}
        @Override public long mod(long a) {return a & 1;}
        @Override public long add(long a, long b) {return (a ^ b) & 1;}
        @Override public long sub(long a, long b) {return (a ^ b) & 1;}
        @Override public long mul(long a, long b) {return (a & b) & 1;}
        @Override public long inv(long a) {
            if ((a & 1) == 1) return 1;
            throw new ArithmeticException("divide by zero");
        }
        @Override public long pow(long a, long b) {
            if (b == 0 || (a & 1) == 1) return 1;
            return 0;
        }
    }
    static final class ModArithmetic1000000007 implements ModArithmetic {
        private static final long MOD = Const.MOD1000000007;
        @Override public long getMod() {return MOD;}
        @Override public long mod(long a) {return (a %= MOD) < 0 ? a + MOD : a;}
        @Override public long add(long a, long b) {
            long s = a + b;
            return s >= MOD ? s - MOD : s;
        }
        @Override public long sub(long a, long b) {
            long s = a - b;
            return s < 0 ? s + MOD : s;
        }
        @Override public long mul(long a, long b) {
            return (a * b) % MOD;
        }
        @Override public long inv(long a) {
            a = mod(a);
            long b = MOD;
            long u = 1, v = 0;
            while (b >= 1) {
                long t = a / b;
                a -= t * b;
                long tmp1 = a; a = b; b = tmp1;
                u -= t * v;
                long tmp2 = u; u = v; v = tmp2;
            }
            // if (a != 1) throw new ArithmeticException("divide by zero");
            return mod(u);
        }
        @Override public long pow(long a, long b) {
            a = mod(a);
            long pow = 1;
            for (long p = a, c = 1; b > 0;) {
                long lsb = b & -b;
                while (lsb != c) {
                    c <<= 1;
                    p = (p * p) % MOD;
                }
                pow = (pow * p) % MOD;
                b ^= lsb;
            }
            return pow;
        }
    }
    static final class ModArithmetic998244353 implements ModArithmetic {
        private static final long MOD = Const.MOD998244353;
        @Override public long getMod() {return MOD;}
        @Override public long mod(long a) {return (a %= MOD) < 0 ? a + MOD : a;}
        @Override public long add(long a, long b) {
            long s = a + b;
            return s >= MOD ? s - MOD : s;
        }
        @Override public long sub(long a, long b) {
            long s = a - b;
            return s < 0 ? s + MOD : s;
        }
        @Override public long mul(long a, long b) {
            return (a * b) % MOD;
        }
        @Override public long inv(long a) {
            a = mod(a);
            long b = MOD;
            long u = 1, v = 0;
            while (b >= 1) {
                long t = a / b;
                a -= t * b;
                long tmp1 = a; a = b; b = tmp1;
                u -= t * v;
                long tmp2 = u; u = v; v = tmp2;
            }
            // if (a != 1) throw new ArithmeticException("divide by zero");
            return mod(u);
        }
        @Override public long pow(long a, long b) {
            a = mod(a);
            long pow = 1;
            for (long p = a, c = 1; b > 0;) {
                long lsb = b & -b;
                while (lsb != c) {
                    c <<= 1;
                    p = (p * p) % MOD;
                }
                pow = (pow * p) % MOD;
                b ^= lsb;
            }
            return pow;
        }
    }
    static class ModArithmeticDynamic implements ModArithmetic {
        final long MOD;
        private ModArithmeticDynamic(long mod) {
            this.MOD = mod;
        }
        @Override public long getMod() {
            return MOD;
        }
        @Override public long mod(long a) {
            return (a %= MOD) < 0 ? a + MOD : a;
        }
        @Override public long add(long a, long b) {
            long s = a + b;
            return s >= MOD ? s - MOD : s;
        }
        @Override public long sub(long a, long b) {
            long s = a - b;
            return s < 0 ? s + MOD : s;
        }
        @Override public long mul(long a, long b) {
            return (a * b) % MOD;
        }
        @Override public long inv(long a) {
            a = mod(a);
            long b = MOD;
            long u = 1, v = 0;
            while (b >= 1) {
                long t = a / b;
                a -= t * b;
                long tmp1 = a; a = b; b = tmp1;
                u -= t * v;
                long tmp2 = u; u = v; v = tmp2;
            }
            // if (a != 1) throw new ArithmeticException("divide by zero");
            return mod(u);
        }
        @Override public long pow(long a, long b) {
            a = mod(a);
            long pow = 1;
            for (long p = a, c = 1; b > 0;) {
                long lsb = b & -b;
                while (lsb != c) {
                    c <<= 1;
                    p = mul(p, p);
                }
                pow = mul(pow, p);
                b ^= lsb;
            }
            return pow;
        }
    }
    static final class ModArithmeticBarrett extends ModArithmeticDynamic {
        private static final long mask = 0xffff_ffffl;
        private final long mh;
        private final long ml;
        private ModArithmeticBarrett(long mod) {
            super(mod);
            long a = (1l << 32) / mod, b = (1l << 32) % mod;
            long m = a * a * mod + 2 * a * b + (b * b) / mod;
            this.mh = m >>> 32;
            this.ml = m & mask;
        }
        private long reduce(long x) {
            long z = (x & mask) * ml;
            z = (x & mask) * mh + (x >>> 32) * ml + (z >>> 32);
            z = (x >>> 32) * mh + (z >>> 32);
            x -= z * MOD;
            return (int) (x < MOD ? x : x - MOD);
        }
        @Override public long mul(long a, long b) {
            return reduce(a * b);
        }
    }
}
