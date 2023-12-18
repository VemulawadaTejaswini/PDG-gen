import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    private static final Mod mod = new Mod(1_000_000_007);

    void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = in.nextLongArray(n);
        if (n == k) {
            long ans = LongStream.of(a).reduce(1, mod::multiply);
            out.println(ans);
            return;
        }
        if (LongStream.of(a).allMatch(v -> v < 0) && k % 2 == 1) {
            sortByDesc(a);
            long ans = IntStream.range(0, k)
                                .mapToLong(i -> a[i])
                                .reduce(1, mod::multiply);
            out.println(ans);
            return;
        }
        long[] plus = LongStream.of(a).filter(v -> v >= 0).toArray();
        sortByDesc(plus);
        long[] minus = LongStream.of(a).filter(v -> v < 0).sorted().toArray();
        Mod.ModLong ans = mod.longOf(1);
        if (k % 2 == 1) {
            ans.multiply(plus[0]);
            plus = Arrays.copyOfRange(plus, 1, plus.length);
            k--;
        }
        var abs = new ArrayList<Long>();
        for (int i = 0; i < plus.length / 2; i++) {
            abs.add(plus[2 * i] * plus[2 * i + 1]);
        }
        for (int i = 0; i < minus.length / 2; i++) {
            abs.add(minus[2 * i] * minus[2 * i + 1]);
        }
        abs.sort(Comparator.reverseOrder());
        for (int i = 0; i < k / 2; i++) {
            ans.multiply(abs.get(i));
        }
        out.println(ans);
    }
    private static long[] sortByDesc(long[] a) {
        Arrays.sort(a);
        reverse(a);
        return a;
    }
    private static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }
    private static void reverse(long[] a, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = fromIndex, j = toIndex - 1; i < j; i++, j--) {
            long tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
    static final class Mod {
        final int divisor;

        Mod(int divisor) {
            if (divisor <= 0)
                throw new IllegalArgumentException();
            this.divisor = divisor;
        }
        long mod(long dividend) {
            return Math.floorMod(dividend, divisor);
        }
        long add(long a, long b) {
            return mod(mod(a) + mod(b));
        }
        long subtract(long a, long b) {
            return mod(mod(a) - mod(b));
        }
        long multiply(long a, long b) {
            return mod(mod(a) * mod(b));
        }
        long pow(long base, long exponent) {
            if (exponent < 0)
                throw new IllegalArgumentException();
            long result = 1;
            for (long e = exponent, b = base; e > 0; e >>= 1) {
                if ((e & 1) == 1)
                    result = multiply(result, b);
                b = multiply(b, b);
            }
            return result;
        }
        long[] preprocessPow(long base, int maxExponent) {
            long[] result = new long[maxExponent + 1];
            result[0] = 1;
            for (int i = 0; i < maxExponent; i++)
                result[i + 1] = multiply(result[i], base);
            return result;
        }
        long inverse(long a) {
            // assert isCoprime(a, divisor);
            if (a == 0)
                throw new IllegalArgumentException();
            return pow(a, divisor - 2);
        }
        long div(long dividend, long divisor) {
            return multiply(dividend, inverse(divisor));
        }
        long[] factorial(int maxN) {
            long[] a = new long[maxN + 1];
            a[0] = 1;
            for (int i = 1; i < a.length; i++)
                a[i] = multiply(a[i - 1], i);
            return a;
        }
        long[] inverseFactorial(long[] factorial) {
            int len = factorial.length;
            long[] a = new long[len];
            a[len - 1] = inverse(factorial[len - 1]);
            for (int i = len - 1; i > 0; i--)
                a[i - 1] = multiply(a[i], i);
            return a;
        }
        ModLong longOf(long initialValue) {
            return new ModLong(this, initialValue);
        }
        Combination combination(int maxN) {
            long[] fact = factorial(maxN);
            long[] invFact = inverseFactorial(fact);
            return new Combination(this, fact, invFact);
        }
        static final class ModLong {
            final Mod mod;
            long value;

            ModLong(Mod mod, long initialValue) {
                this.mod = mod;
                value = mod.mod(initialValue);
            }
            ModLong add(long a) {
                value = mod.add(value, a);
                return this;
            }
            ModLong add(ModLong a) {
                return add(a.value);
            }
            ModLong subtract(long a) {
                value = mod.subtract(value, a);
                return this;
            }
            ModLong subtract(ModLong a) {
                return subtract(a.value);
            }
            ModLong multiply(long a) {
                value = mod.multiply(value, a);
                return this;
            }
            ModLong multiply(ModLong a) {
                return multiply(a.value);
            }
            ModLong pow(long a) {
                value = mod.pow(value, a);
                return this;
            }
            ModLong inverse() {
                value = mod.inverse(value);
                return this;
            }
            ModLong div(long a) {
                value = mod.div(value, a);
                return this;
            }
            ModLong div(ModLong a) {
                return div(a.value);
            }
            @Override
            public String toString() {
                return Long.toString(value);
            }
        }
        static final class Combination {
            final Mod mod;
            final long[] factorial;
            final long[] inverseFactorial;

            Combination(Mod mod, long[] factorial, long[] inverseFactorial) {
                this.mod = mod;
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            long of(int n, int k) {
                if (k > n)
                    return 0;
                return mod.multiply(mod.multiply(factorial[n],
                                                 inverseFactorial[k]),
                                    inverseFactorial[n - k]);
            }
            Permutation permutation() {
                return new Permutation(mod, factorial, inverseFactorial);
            }
        }
        static final class Permutation {
            final Mod mod;
            final long[] factorial;
            final long[] inverseFactorial;

            Permutation(Mod mod, long[] factorial, long[] inverseFactorial) {
                this.mod = mod;
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            long of(int n, int k) {
                if (k > n)
                    return 0;
                return mod.multiply(factorial[n], inverseFactorial[n - k]);
            }
        }
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        new Main().solve(new MyScanner(System.in), w);
        w.flush();
    }
    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;

        MyScanner(InputStream in) {
            this.in = in;
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
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
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
