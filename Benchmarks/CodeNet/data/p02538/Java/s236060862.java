import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public final class Main {
    private static final Mod mod = new Mod(998_244_353);
    private static final int[] pow10 = mod.preprocessPow(10, 200_000);
    private static final int[][] sameNums;
    static {
        sameNums = new int[200_001][10];
        for (int i = 1, v = 1; i < sameNums.length; i++) {
            sameNums[i][1] = v;
            for (int j = 2; j < 10; j++) {
                sameNums[i][j] = mod.multiply(v, j);
            }
            v = mod.add(mod.multiply(v, 10), 1);
        }
    }
    void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        var dat = new Elem[n];
        Arrays.fill(dat, new Elem(1, 1));
        var s = new LazySegTree<>(dat,
                                  Elem::add,
                                  Elem.id,
                                  Func::map,
                                  Func::compose,
                                  Func.id);
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt();
            int d = in.nextInt();
            s.apply(l, r, Func.of(d));
            out.println(s.allProd().value);
        }
    }
    static final class Elem {
        static final Elem id = new Elem(0, 0);
        final int value;
        final int digitCount;
        Elem(int value, int digitCount) {
            this.value = value;
            this.digitCount = digitCount;
        }
        Elem add(Elem e) {
            if (this == id)
                return e;
            int a = mod.multiply(value, pow10[e.digitCount]);
            int b = mod.add(a, e.value);
            return new Elem(b, digitCount + e.digitCount);
        }
    }
    static final class Func {
        static final Func id = new Func(0);
        final int digit;
        Func(int digit) {
            this.digit = digit;
        }
        Elem map(Elem e) {
            if (this == id)
                return e;
            return new Elem(sameNums[e.digitCount][digit], e.digitCount);
        }
        Func compose(Func g) {
            return this == id ? g : this;
        }
        static final Func[] objs;
        static {
            objs = new Func[10];
            for (int i = 1; i < 10; i++) {
                objs[i] = new Func(i);
            }
        }
        static Func of(int digit) {
            return objs[digit];
        }
    }
    static final class LazySegTree<S, F> {
        final int length;
        final BinaryOperator<S> op;
        final S identityElem;
        final BiFunction<F, S, S> map;
        final BinaryOperator<F> compose;
        final F identity;
        final int actualLength;
        final S[] a;
        final F[] lazy;

        @SuppressWarnings("unchecked")
        LazySegTree(int length,
                    S identityElem,
                    BinaryOperator<S> op,
                    BiFunction<F, S, S> map,
                    BinaryOperator<F> compose,
                    F identity) {
            if (length < 0 || length > (1 << (Integer.SIZE - 2)))
                throw new IllegalArgumentException();
            this.length = length;
            this.op = Objects.requireNonNull(op);
            this.identityElem = Objects.requireNonNull(identityElem);
            this.map = Objects.requireNonNull(map);
            this.compose = Objects.requireNonNull(compose);
            this.identity = Objects.requireNonNull(identity);

            int bit = 1;
            while (bit < length)
                bit <<= 1;
            actualLength = bit;

            a = (S[])new Object[(actualLength << 1) - 1];
            lazy = (F[])new Object[actualLength - 1];
            Arrays.fill(lazy, identity);
        }

        LazySegTree(int length,
                    BinaryOperator<S> op,
                    S identityElem,
                    BiFunction<F, S, S> map,
                    BinaryOperator<F> compose,
                    F identity) {
            this(length, identityElem, op, map, compose, identity);
            Arrays.fill(a, identityElem);
        }
        LazySegTree(S[] src,
                    BinaryOperator<S> op,
                    S identityElem,
                    BiFunction<F, S, S> map,
                    BinaryOperator<F> compose,
                    F identity) {
            this(src.length, identityElem, op, map, compose, identity);
            int p = a.length - actualLength;
            System.arraycopy(src, 0, a, p, src.length);
            for (int i = p + src.length; i < a.length; i++)
                a[i] = identityElem;
            for (int i = p - 1; i >= 0; i--)
                a[i] = op.apply(a[i * 2 + 1], a[i * 2 + 2]);
        }
        private S _prod(int from, int to, int i, int l, int r, F func) {
            boolean outOfRange = r <= from || to <= l;
            if (outOfRange || (from <= l && r <= to)) {
                a[i] = map.apply(func, a[i]);
                if (i < lazy.length)
                    lazy[i] = compose.apply(func, lazy[i]);
                return outOfRange ? identityElem : a[i];
            }
            F h = compose.apply(func, lazy[i]);
            lazy[i] = identity;
            int center = (l + r) >>> 1;
            S result = op.apply(_prod(from, to, i * 2 + 1, l, center, h),
                                _prod(from, to, i * 2 + 2, center, r, h));
            a[i] = op.apply(a[i * 2 + 1], a[i * 2 + 2]);
            return result;
        }
        S prod(int fromIndex, int toIndex) {
            Objects.checkFromToIndex(fromIndex, toIndex, length);
            if (fromIndex == toIndex)
                return identityElem;
            return _prod(fromIndex, toIndex, 0, 0, actualLength, identity);
        }
        S allProd() {
            return prod(0, length);
        }
        private void _apply(int from,
                            int to,
                            int i,
                            int l,
                            int r,
                            F func,
                            F p) {
            boolean outOfRange = r <= from || to <= l;
            if (outOfRange || (from <= l && r <= to)) {
                F h = (outOfRange ? p : compose.apply(func, p));
                a[i] = map.apply(h, a[i]);
                if (i < lazy.length)
                    lazy[i] = compose.apply(h, lazy[i]);
            } else {
                F h = compose.apply(p, lazy[i]);
                lazy[i] = identity;
                int center = (l + r) >>> 1;
                _apply(from, to, i * 2 + 1, l, center, func, h);
                _apply(from, to, i * 2 + 2, center, r, func, h);
                a[i] = op.apply(a[i * 2 + 1], a[i * 2 + 2]);
            }
        }
        void apply(int fromIndex, int toIndex, F func) {
            Objects.checkFromToIndex(fromIndex, toIndex, length);
            if (fromIndex == toIndex)
                return;
            _apply(fromIndex, toIndex, 0, 0, actualLength, func, identity);
        }
        void apply(int index, F func) {
            apply(index, index + 1, func);
        }
        S get(int index) {
            return prod(index, index + 1);
        }
        private void _set(int target, int i, int l, int r, F func, S e) {
            boolean targetEqualsRange = l == target && target + 1 == r;
            if (r <= target || target < l || targetEqualsRange) {
                a[i] = targetEqualsRange ? e : map.apply(func, a[i]);
                if (i < lazy.length)
                    lazy[i] = compose.apply(func, lazy[i]);
            } else {
                F h = compose.apply(func, lazy[i]);
                lazy[i] = identity;
                int center = (l + r) >>> 1;
                _set(target, i * 2 + 1, l, center, h, e);
                _set(target, i * 2 + 2, center, r, h, e);
                a[i] = op.apply(a[i * 2 + 1], a[i * 2 + 2]);
            }
        }
        void set(int index, S elem) {
            Objects.checkIndex(index, length);
            _set(index, 0, 0, actualLength, identity, elem);
        }
    }
    static final class Mod {
        final int divisor;

        Mod(int divisor) {
            if (divisor <= 0)
                throw new IllegalArgumentException();
            this.divisor = divisor;
        }
        int mod(long dividend) {
            return Math.floorMod(dividend, divisor);
        }
        int add(long a, long b) {
            return mod((long)mod(a) + mod(b));
        }
        int subtract(long a, long b) {
            return mod(mod(a) - mod(b));
        }
        int multiply(long a, long b) {
            return mod((long)mod(a) * mod(b));
        }
        int pow(long base, long exponent) {
            if (exponent < 0)
                throw new IllegalArgumentException();
            int result = 1;
            int b = mod(base);
            for (long e = exponent; e > 0; e >>= 1) {
                if ((e & 1) == 1)
                    result = multiply(result, b);
                b = multiply(b, b);
            }
            return result;
        }
        int[] preprocessPow(long base, int maxExponent) {
            var result = new int[maxExponent + 1];
            result[0] = 1;
            for (int i = 0; i < maxExponent; i++)
                result[i + 1] = multiply(result[i], base);
            return result;
        }
        int inverse(long a) {
            // assert isCoprime(a, divisor);
            if (a == 0)
                throw new IllegalArgumentException();
            return pow(a, divisor - 2);
        }
        int div(long dividend, long divisor) {
            return multiply(dividend, inverse(divisor));
        }
        int[] factorial(int maxN) {
            var a = new int[maxN + 1];
            a[0] = 1;
            for (int i = 1; i < a.length; i++)
                a[i] = multiply(a[i - 1], i);
            return a;
        }
        int[] inverseFactorial(int[] factorial) {
            int len = factorial.length;
            var a = new int[len];
            a[len - 1] = inverse(factorial[len - 1]);
            for (int i = len - 1; i > 0; i--)
                a[i - 1] = multiply(a[i], i);
            return a;
        }
        Int intOf(long initialValue) {
            return new Int(initialValue);
        }
        Combination combination(int maxN) {
            int[] fact = factorial(maxN);
            int[] invFact = inverseFactorial(fact);
            return new Combination(fact, invFact);
        }
        final class Int {
            int value;

            private Int(long initialValue) {
                value = mod(initialValue);
            }
            Int add(long a) {
                value = Mod.this.add(value, a);
                return this;
            }
            Int add(Int a) {
                return add(a.value);
            }
            Int subtract(long a) {
                value = Mod.this.subtract(value, a);
                return this;
            }
            Int subtract(Int a) {
                return subtract(a.value);
            }
            Int multiply(long a) {
                value = Mod.this.multiply(value, a);
                return this;
            }
            Int multiply(Int a) {
                return multiply(a.value);
            }
            Int pow(long a) {
                value = Mod.this.pow(value, a);
                return this;
            }
            Int inverse() {
                value = Mod.this.inverse(value);
                return this;
            }
            Int div(long a) {
                value = Mod.this.div(value, a);
                return this;
            }
            Int div(Int a) {
                return div(a.value);
            }
            @Override
            public String toString() {
                return Integer.toString(value);
            }
        }
        final class Combination {
            final int[] factorial;
            final int[] inverseFactorial;

            Combination(int[] factorial, int[] inverseFactorial) {
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            int of(int n, int k) {
                if (k > n)
                    return 0;
                return multiply(multiply(factorial[n], inverseFactorial[k]),
                                inverseFactorial[n - k]);
            }
            Permutation permutation() {
                return new Permutation(factorial, inverseFactorial);
            }
        }
        final class Permutation {
            final int[] factorial;
            final int[] inverseFactorial;

            Permutation(int[] factorial, int[] inverseFactorial) {
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            int of(int n, int k) {
                if (k > n)
                    return 0;
                return multiply(factorial[n], inverseFactorial[n - k]);
            }
        }
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        new Main().solve(new MyScanner(System.in), w);
        w.flush();
    }
    static final class MyScanner {
        private static final int DEFAULT_BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer;
        private int point;
        private int readLength;

        MyScanner(InputStream in) {
            this(in, DEFAULT_BUFFER_SIZE);
        }
        MyScanner(InputStream in, int bufferSize) {
            this.in = Objects.requireNonNull(in);
            buffer = new byte[bufferSize];
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1)
                return -1;
            point = 1;
            return buffer[0];
        }
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                if (n < limit / 10L)
                    throw new InputMismatchException();
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit)
                    throw new InputMismatchException();
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = nextInt();
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++)
                result[i] = nextLong();
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++)
                result[i] = nextChar();
            return result;
        }
        int[][] next2dIntArray(int h, int w) {
            var result = new int[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    result[i][j] = nextInt();
            return result;
        }
        long[][] next2dLongArray(int h, int w) {
            var result = new long[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    result[i][j] = nextLong();
            return result;
        }
        char[][] next2dCharArray(int h, int w) {
            char[][] result = new char[h][w];
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    result[i][j] = nextChar();
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++)
                for (int j = 0; j < arrayCount; j++)
                    result[j][i] = nextInt();
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++)
                for (int j = 0; j < arrayCount; j++)
                    result[j][i] = nextLong();
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++)
                for (int j = 0; j < arrayCount; j++)
                    result[j][i] = nextChar();
            return result;
        }
        List<String> nextStringList(int n) {
            var result = new ArrayList<String>(n);
            for (int i = 0; i < n; i++)
                result.add(next());
            return result;
        }
        List<Integer> nextIntList(int n) {
            var result = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++)
                result.add(nextInt());
            return result;
        }
        List<Long> nextLongList(int n) {
            var result = new ArrayList<Long>(n);
            for (int i = 0; i < n; i++)
                result.add(nextLong());
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            Objects.requireNonNull(delimiter);
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            Objects.requireNonNull(delimiter);
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Objects.requireNonNull(delimiter);
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
