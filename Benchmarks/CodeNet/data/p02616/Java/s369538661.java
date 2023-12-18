import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.function.ToLongFunction;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EMultiplication4 solver = new EMultiplication4();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMultiplication4 {
        NumberTheory.Mod107 mod = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            long[] a = in.readLongArray(n);
            List<Long> pos = new ArrayList<>();
            List<Long> neg = new ArrayList<>();

            for (long x : a) {
                if (x > 0)
                    pos.add(x);
                if (x < 0)
                    neg.add(x);
            }

            if (pos.size() + neg.size() < k) {
                out.println(0);
                return;
            }

            if (pos.size() == 0 && k % 2 == 1) {
                Collections.sort(neg, Comparator.reverseOrder());
                long answer = 1;
                for (int i = 0; i < k; i++) {
                    answer = mod.mult(answer, Math.abs(neg.get(i)));
                }
                out.println(mod.negative(answer));
                return;
            }

            List<Long> nz = new ArrayList<>();
            nz.addAll(pos);
            nz.addAll(neg);
            nz.sort(Comparator.comparingLong((ToLongFunction<Long>) Math::abs).reversed());

            long answer = 1;
            int sign = 1;
            for (int i = 0; i < k; i++) {
                answer = mod.mult(answer, Math.abs(nz.get(i)));
                sign *= Util.sign(nz.get(i));
            }

            if (sign > 0) {
                out.println(answer);
                return;
            }

            long largestUnpickedNegative = 0;
            long largestUnpickedPositive = 0;
            long smallestPickedNegative = Long.MAX_VALUE;
            long smallestPickedPositive = Long.MAX_VALUE;

            for (int i = 0; i < k; i++) {
                long x = nz.get(i);
                if (x > 0)
                    smallestPickedPositive = Math.min(smallestPickedPositive, x);
                if (x < 0)
                    smallestPickedNegative = Math.min(smallestPickedNegative, Math.abs(x));
            }
            for (int i = k; i < nz.size(); i++) {
                long x = nz.get(i);
                if (x > 0)
                    largestUnpickedPositive = Math.max(largestUnpickedPositive, x);
                if (x < 0)
                    largestUnpickedNegative = Math.max(largestUnpickedNegative, Math.abs(x));
            }

            // System.out.println("smallestPickedPositive = " + smallestPickedPositive);
            // System.out.println("smallestPickedNegative = " + smallestPickedNegative);
            // System.out.println("largestUnpickedPositive = " + largestUnpickedPositive);
            // System.out.println("largestUnpickedNegative = " + largestUnpickedNegative);

            long unpickedNegativeAndPickedPositive = 0;
            long unpickedPositiveAndPickedNegative = 0;
            if (largestUnpickedNegative != 0 && smallestPickedPositive != Long.MAX_VALUE) {
                unpickedNegativeAndPickedPositive = largestUnpickedNegative / smallestPickedPositive;
                unpickedNegativeAndPickedPositive = largestUnpickedNegative * smallestPickedNegative;
            }
            if (largestUnpickedPositive != 0 && smallestPickedNegative != Long.MAX_VALUE) {
                unpickedPositiveAndPickedNegative = largestUnpickedPositive / smallestPickedNegative;
                unpickedPositiveAndPickedNegative = largestUnpickedPositive * smallestPickedPositive;
            }

            if (unpickedNegativeAndPickedPositive != 0 && (unpickedPositiveAndPickedNegative == 0 || unpickedNegativeAndPickedPositive > unpickedPositiveAndPickedNegative)) {
                answer = mod.mult(answer, largestUnpickedNegative, mod.inv(smallestPickedPositive));
            } else {
                answer = mod.mult(answer, largestUnpickedPositive, mod.inv(smallestPickedNegative));
            }

            out.println(answer);
        }

    }

    static class Util {
        private Util() {
        }

        public static int sign(long x) {
            return x > 0 ? 1 : x == 0 ? 0 : -1;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextLong();
            }
            return x;
        }

    }

    static class NumberTheory {
        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();
            ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
            }

            public long normalize(long x) {
                x %= modulus();
                if (x < 0)
                    x += modulus();
                return x;
            }

            public long mult(long... x) {
                long r = 1;
                for (long i : x)
                    r = mult(r, i);
                return r;
            }

            public long mult(long a, long b) {
                return (a * b) % modulus();
            }

            public long negative(long x) {
                return x == 0 ? 0 : modulus() - x;
            }

            public long inv(long value) {
                long g = modulus(), x = 0, y = 1;
                for (long r = value; r != 0; ) {
                    long q = g / r;
                    g %= r;

                    long temp = g;
                    g = r;
                    r = temp;

                    x -= q * y;

                    temp = x;
                    x = y;
                    y = temp;
                }

                ASSERT(g == 1);
                ASSERT(y == modulus() || y == -modulus());

                return normalize(x);
            }

        }

        public static class Mod107 extends NumberTheory.Modulus<NumberTheory.Mod107> {
            public long modulus() {
                return 1_000_000_007L;
            }

        }

    }
}

