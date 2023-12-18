
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tutuz on 2020/08/30
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskX solver = new TaskX();
        solver.solve(1, in, out);
        out.close();
    }

    static int INF = 1 << 30;
    static long LINF = 1L << 55;
    static int MOD = 1000000007;
    static int[] mh4 = {0, -1, 1, 0};
    static int[] mw4 = {-1, 0, 0, 1};
    static int[] mh8 = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] mw8 = {-1, 0, 1, -1, 1, -1, 0, 1};

    static class TaskX {

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[] as = in.nextIntArray(n);
            Arrays.sort(as);
            preprocess(MAX);

            boolean isPairwise = true;
            int[] count = new int[MAX];

            TOP:
            for (int a : as) {
                List<Pair> primes = primeFactor(a);
                for (Pair p : primes) {
                    if (count[p.first]++ >= 1) {
                        isPairwise = false;
                        break TOP;
                    }
                }
            }

            if (isPairwise) {
                out.println("pairwise coprime");
                return;
            }

            int g = 0;
            for (int a : as) {
                g = gcd(g, a);
            }
            if (g == 1) {
                out.println("setwise coprime");
                return;
            }

            out.println("not coprime");
        }
    }

    static int MAX = 1000010;
    static boolean[] IsPrime = new boolean[MAX];
    static int[] MinFactor = new int[MAX];

    static List<Integer> preprocess(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            IsPrime[i] = true;
            MinFactor[i] = -1;
        }
        IsPrime[0] = false;
        IsPrime[1] = false;
        MinFactor[0] = 0;
        MinFactor[1] = 1;
        for (int i = 2; i < n; ++i) {
            if (IsPrime[i]) {
                MinFactor[i] = i;
                res.add(i);
                for (int j = i * 2; j < n; j += i) {
                    IsPrime[j] = false;
                    if (MinFactor[j] == -1) MinFactor[j] = i;
                }
            }
        }
        return res;
    }

    static List<Pair> primeFactor(int n) {
        List<Pair> res = new ArrayList<>();
        while (n != 1) {
            int prime = MinFactor[n];
            int exp = 0;
            while (MinFactor[n] == prime) {
                ++exp;
                n /= prime;
            }
            res.add(new Pair(prime, exp));
        }
        return res;
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            super();
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "P [first=" + first + ", second=" + second + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + first;
            result = prime * result + second;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;
            if (first != other.first)
                return false;
            if (second != other.second)
                return false;
            return true;
        }

    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++)
                ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++)
                ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        public String nextString() {
            return new String(nextChars());
        }

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        public char[][] next2DChars(int h, int w) {
            char[][] s = new char[h][w];
            for (int i = 0; i < h; i++) {
                s[i] = nextChars();
            }
            return s;
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArray1Index(final int n) {
            final int[] res = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public long[] nextLongArray(final int n) {
            final long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArray1Index(final int n) {
            final long[] res = new long[n + 1];
            for (int i = 1; i < n + 1; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(final int n) {
            final long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public double nextDouble() {
            return Double.parseDouble(nextString());
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}
