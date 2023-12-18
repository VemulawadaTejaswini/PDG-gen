import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.LongPredicate;

public class Main {

    static long S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.nextLong();

        System.out.println(solve());
    }

    static String solve() {
        long MAX = 100_000_000_000_000_000L; // この辺でsizeが1e18を超えるっぽい

        long n = maximizeL(1, MAX, x -> {
            long size = calcSize(x);
            return size < S;
        });

        long size = calcSize(n);
        int d = (int)(S - size - 1);

        long curr = n+1;
        StringBuilder b = new StringBuilder();
        while(true) {
            if( curr % 15 == 0 ) {
                b.append("FizzBuzz");
            } else if( curr % 3 == 0 ) {
                b.append("Fizz");
            } else if( curr % 5 == 0 ) {
                b.append("Buzz");
            } else {
                b.append(curr);
            }

            if( b.length() >= 20 + d ) {
                String s = b.toString();
                return s.substring(d, d+20);
            } else {
                curr++;
            }
        }
    }

    static long maximizeL(long lo, long hi, LongPredicate p) {
        while(lo < hi) {
            long x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
    }

    static long calcSize(long n) {
        long d = 10;
        int k = 1;
        long ret = 0;
        while( d <= n ) {
            ret += calcSize(k, d/10, d-1);
            k++;
            d*=10;
        }
        ret += calcSize(k, d/10, n);
        return ret;
    }

    // k桁 [from, to]
    static long calcSize(int k, long from, long to) {
        // debug(k, from, to);
        long fizzbuzz = count(to, 15) - count(from-1, 15);
        long fizz = count(to, 3) - count(from-1, 3) - fizzbuzz;
        long buzz = count(to, 5) - count(from-1, 5) - fizzbuzz;
        long others = to - (from-1) - (fizz + buzz + fizzbuzz);

        return others * k + fizz * 4 + buzz * 4 + fizzbuzz * 8;
    }

    static long count(long n, int d) {
        return n / d;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

