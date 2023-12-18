import java.io.FileNotFoundException;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/A2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        List<String> res = new ArrayList<>();
        for (int i = 4; i <= 13; i++) {
            res.add("< 3 0 " + i);
            res.add("+ 3 " + i + " 3");
        }
        for (int i = 15; i <= 24; i++) {
            res.add("< 14 1 " + i);
            res.add("+ 14 " + i + " 14");
        }
        for (int i = 25; i <= 34; i++) {
            res.add("< " + (i-10) + " 4 " + i);
        }
        int at = 0;
        for (int i = 4; i <= 13; i++) {
            for (int j = 25; j <= 34; j++) {
                res.add("< " + j + " " + i + " " + (100 + at));
                at++;
            }
        }
        for (int i = 100; i <= 199; i++) {
            res.add("+ 2 " + i + " " + "2");
        }
        // simulate(3, 4, res);
    }

    private void simulate(int a, int b, List<String> res) {
        int[] v = new int[200];
        v[0] = a;
        v[1] = b;
        for (String s : res) {
            String[] ws = s.split(" ");
            int i = Integer.valueOf(ws[1]);
            int j = Integer.valueOf(ws[2]);
            int k = Integer.valueOf(ws[3]);
            if (ws[0].charAt(0) == '<') {
                v[k] = v[i] < v[j] ? 1 : 0;
            } else {
                v[k] = v[i] + v[j];
            }
            System.out.println(s + " " + Arrays.toString(v));
        }
        if (v[2] == a * b) {
            System.out.println("ok");
        }
    }

    private long pow(int v, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= v;
        }
        return res;
    }

    private int d(long b, int i) {
        int res = 0;
        while (b % i == 0) {
            res++;
            b /= i;
        }
        return res;
    }

    private String f(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

    private long conv(String s) {
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = (res * 10) + (s.charAt(i) - '0');
        }
        return res;
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
