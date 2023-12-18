import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while(true) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int T = sc.nextInt();

            if( N == 0 ) break;
            int[] S = sc.nextIntArray(N);
            writeSingleLine(pw, solve(N, M, A, B, C, T, S));
        }
        pw.flush();
    }

    static void writeSingleLine(PrintWriter pw, int[] as) {
        StringJoiner j = new StringJoiner(" ");
        for (int a : as) {
            j.add(String.valueOf(a));
        }
        pw.println( j.toString() );
    }

    static int[] solve(int N, int MOD, int A, int B, int C, int T, int[] S) {
        IntMat m = new IntMat(N, N);
        for (int i = 0; i < N; i++) {
            if( i != 0 ) m.set(i-1, i, A);
            m.set(i, i, B);
            if( i != N-1) m.set(i+1, i, C);
        }

        IntMat p = IntMat.pow(m, T, MOD);

        IntMat in = new IntMat(1, N);
        for (int i = 0; i < N; i++) {
            in.set(0, i, S[i]);
        }
        IntMat out = IntMat.dot(in, p, MOD);

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = out.get(0, i);
        }
        return ans;
    }

    static class IntMat {

        final int[][] mat;

        IntMat(int r, int c) {
            mat = new int[r][c];
        }

        IntMat(int[][] mat) {
            this.mat = mat;
        }

        IntMat(int[] vec) {
            mat = new int[vec.length][1];
            for (int i = 0; i < vec.length; i++) {
                mat[i][0] = vec[i];
            }
        }

        static IntMat pow(IntMat m, long k, int mod) {
            if( m.row() != m.col() ) throw new IllegalArgumentException("row != col : " + m.row() + " " + m.col());

            int n = m.row();
            IntMat ret = new IntMat(n, n);
            for (int i = 0; i < n; i++) {
                ret.set(i, i, 1);
            }
            if( k == 0 ) return ret; // どうだろ...

            while( k > 0 ) {
                if( (k & 1) == 1 ) {
                    ret = IntMat.dot(ret, m, mod);
                }

                m = IntMat.dot(m, m, mod);
                k = k >> 1L;
            }
            return ret;
        }

        static IntMat pow(IntMat m, long k, IntBinaryOperator mul, IntBinaryOperator add) {
            if( m.row() != m.col() ) throw new IllegalArgumentException("row != col : " + m.row() + " " + m.col());

            int n = m.row();
            IntMat ret = new IntMat(n, n);
            for (int i = 0; i < n; i++) {
                ret.set(i, i, 1);
            }
            if( k == 0 ) return ret; // どうだろ...

            while( k > 0 ) {
                if( (k & 1) == 1 ) {
                    ret = IntMat.dot(ret, m, mul, add);
                }

                m = IntMat.dot(m, m, mul, add);
                k = k >> 1L;
            }
            return ret;
        }

        static IntMat dot(IntMat a, IntMat b) {
            return dot(a, b, (i, j) -> i*j, (i, j) -> i+j);
        }

        static IntMat dot(IntMat a, IntMat b, IntBinaryOperator mul, IntBinaryOperator add) {
            int[][] ret = new int[a.row()][b.col()];

            for (int r = 0; r < a.row(); r++) {
                for (int c = 0; c < b.col(); c++) {
                    int sum = 0;
                    for (int i = 0; i < b.row(); i++) {
                        sum = add.applyAsInt(sum, mul.applyAsInt(a.get(r, i), b.get(i, c)));
                    }
                    ret[r][c] = sum;
                }
            }
            return new IntMat(ret);
        }

        static IntMat dot(IntMat a, IntMat b, int mod) {
            long m2 = (long)mod * mod;

            int ar = a.row();
            int bc = b.col();
            int br = b.row();
            int[][] ret = new int[ar][bc];

            for (int r = 0; r < ar; r++) {
                for (int c = 0; c < bc; c++) {
                    long sum = 0;
                    for (int i = 0; i < br; i++) {
                        long ab = (long)a.mat[r][i] * b.mat[i][c];
                        sum += ab;
                        if( sum >= m2 ) {
                            sum -= m2;
                        }
                    }
                    ret[r][c] = (int)(sum % mod);
                }
            }
            return new IntMat(ret);
        }

        void set(int r, int c, int n) {
            mat[r][c] = n;
        }

        int get(int r, int c) {
            try {
                return mat[r][c];
            } catch( ArrayIndexOutOfBoundsException e ) {
                throw new RuntimeException("wrong index : r=" + r + " c=" + c + " row=" + row() + " col=" + col());
            }
        }

        int row() {
            return mat.length;
        }

        int col() {
            return mat[0].length;
        }
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
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}

