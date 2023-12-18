import java.util.Set;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.InputStream;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/A1";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        /*
        int[] prime = new int[1000100];
        for (int i = 2; i < prime.length; i++) {
            for (int j = i; j < prime.length; j += i) {
                prime[j]++;
            }
        }
        int cnt = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 1) {
                System.out.println(i);
                cnt++;
            }
        }
        System.out.println("total:" + cnt);
         */
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);

        if (pairwise(a)) {
            System.out.println("pairwise coprime");
        } else if (setwise(a)) {
            System.out.println("setwise coprime");
        } else {
            System.out.println("not coprime");
        }
    }

    private boolean setwise(int[] a) {
        int n = a.length;
        long g = a[0];
        for (int i = 1; i < n; i++) {
            g = MathUtil.gcd(g, a[i]);
        }
        return g == 1;
    }

    private boolean pairwise(int[] a) {
        if (a.length > 80000) {
            return false;
        }

        int n = a.length;
        long[] cnt = new long[1000100];
        for (int i = 0; i < n; i++) {
            Set<Long> set = new HashSet<>();
            long cur = a[i];
            for (long j = 2; j * j <= cur; j++) {
                if (cur % j == 0) {
                    set.add(j);
                    while (cur % j == 0) cur /= j;
                }
            }
            if (cur != 1) {
                set.add(cur);
            }
            for (long x : set) {
                cnt[(int)x]++;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= 2) return false;
        }
        return true;
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}

class MathUtil {
    private MathUtil() {
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
