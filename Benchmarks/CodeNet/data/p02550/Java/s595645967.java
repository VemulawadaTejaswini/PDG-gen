import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    void solve(MyScanner in, MyWriter out) {
        long n = in.nextLong();
        int x = in.nextInt();
        int m = in.nextInt();
        if (x == 0) {
            out.println(0);
            return;
        }
        if (x == 1) {
            out.println(n);
            return;
        }
        List<Integer> l = new ArrayList<>();
        var b = new boolean[m];
        var mod = new Mod(m);
        int a = x;
        l.add(a);
        while (!b[a] && l.size() < n) {
            b[a] = true;
            a = mod.multiply(a, a);
            l.add(a);
        }
        if (l.size() == n) {
            out.println(l.stream().mapToLong(i -> i).sum());
            return;
        }
        int loopFirstA = l.get(l.size() - 1);
        int loopStart = l.indexOf(loopFirstA);
        long ans = 0;
        for (int i = 0; i < loopStart; i++) {
            ans += l.get(i);
        }
        long loopSum = 0;
        for (int i = loopStart; i < l.size() - 1; i++) {
            loopSum += l.get(i);
        }
        long loopLength = l.size() - 1 - loopStart;
        long loopCount = (n - loopStart) / loopLength;
        ans += loopSum * loopCount;
        for (long i = loopStart + loopCount * loopLength; i < n; i++)
            ans += l.get(loopStart + (int)((i - loopStart) % loopLength));
        out.println(ans);
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
            return new Int(this, initialValue);
        }
        Combination combination(int maxN) {
            int[] fact = factorial(maxN);
            int[] invFact = inverseFactorial(fact);
            return new Combination(this, fact, invFact);
        }
        static final class Int {
            final Mod mod;
            int value;

            private Int(Mod mod, long initialValue) {
                this.mod = mod;
                value = mod.mod(initialValue);
            }
            Int add(long a) {
                value = mod.add(value, a);
                return this;
            }
            Int add(Int a) {
                return add(a.value);
            }
            Int subtract(long a) {
                value = mod.subtract(value, a);
                return this;
            }
            Int subtract(Int a) {
                return subtract(a.value);
            }
            Int multiply(long a) {
                value = mod.multiply(value, a);
                return this;
            }
            Int multiply(Int a) {
                return multiply(a.value);
            }
            Int pow(long a) {
                value = mod.pow(value, a);
                return this;
            }
            Int inverse() {
                value = mod.inverse(value);
                return this;
            }
            Int div(long a) {
                value = mod.div(value, a);
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
        static final class Combination {
            final Mod mod;
            final int[] factorial;
            final int[] inverseFactorial;

            Combination(Mod mod, int[] factorial, int[] inverseFactorial) {
                this.mod = mod;
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            int of(int n, int k) {
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
            final int[] factorial;
            final int[] inverseFactorial;

            Permutation(Mod mod, int[] factorial, int[] inverseFactorial) {
                this.mod = mod;
                this.factorial = factorial;
                this.inverseFactorial = inverseFactorial;
            }
            int of(int n, int k) {
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
        char[][] next2dCharArray(int h, int w) {
            char[][] result = new char[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
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
        List<String> nextStringList(int n) {
            var result = new ArrayList<String>(n);
            for (int i = 0; i < n; i++) {
                result.add(next());
            }
            return result;
        }
        List<Integer> nextIntList(int n) {
            var result = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                result.add(nextInt());
            }
            return result;
        }
        List<Long> nextLongList(int n) {
            var result = new ArrayList<Long>(n);
            for (int i = 0; i < n; i++) {
                result.add(nextLong());
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
