import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main implements Runnable {
    static StringBuilder out = new StringBuilder();
    static final String OK = "OK";
    static final String NG = "NG";
    static final String Possible = "Possible";
    static final String Impossible = "Impossible";
    FastReader in = new FastReader();

    //	 static final int INF = Integer.MAX_VALUE - 300000000;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
    }

    int[][] separate;
    char[][] land;
    int h;
    int w;

    public void run() {
        while (solve())
            ;
    }


    boolean solve() {
        h = in.nextInt();
        w = in.nextInt();
        if (h == 0 && w == 0)
            return false;
        land = in.nextCharArray2D(h, w);

        separate = new int[h][w];
        int owner = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (separate[i][j] > 0)
                    continue;
                dfs(i, j, land[i][j], ++owner);
            }
        }
        System.out.println(owner);
        return true;
    }

    void dfs(int i, int j, char type, int owner) {
        if (land[i][j] != type || separate[i][j] > 0)
            return;
        separate[i][j] = owner;
        if (j > 0)
            dfs(i, j - 1, type, owner);
        if (i > 0)
            dfs(i - 1, j, type, owner);
        if (j < w - 1)
            dfs(i, j + 1, type, owner);
        if (i < h - 1)
            dfs(i + 1, j, type, owner);
    }

    void printExit(Object msg) {
        System.out.println(msg.toString());
        System.exit(0);
    }
}

class FastReader {
    private InputStream in = System.in;
    private byte[] buf = new byte[1024];
    private int charNum;
    private int charLen;
    private StringBuilder sb = new StringBuilder();

    public int read() {
        if (charLen == -1)
            throw new InputMismatchException();
        if (charNum >= charLen) {
            charNum = 0;
            try {
                charLen = in.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (charLen <= 0)
                return -1;
        }
        return buf[charNum++];
    }

    public String next() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        sb.setLength(0);
        do {
            sb.appendCodePoint(c);
            c = read();
        } while (!isWhitespace(c));
        return sb.toString();
    }

    public char[] nextCharArray() {
        return next().toCharArray();
    }

    public char[][] nextCharArray2D(int h, int w) {
        char[][] array = new char[h][w];
        for(int i = 0; i < h; i++){
            array[i] = nextCharArray();
        }
        return array;
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();
        return array;
    }

    public List<Integer> nextIntList(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();
        return Arrays.asList(array);
    }

    public int[][] nextIntArray2D(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            array[i] = nextIntArray(m);
        return array;
    }

    public List<int[]> nextIntsList(int n, int m) {
        List<int[]> list = new ArrayList<int[]>(n);
        for (int i = 0; i < n; i++)
            list.add(nextIntArray(m));
        return list;
    }

    public long nextLong() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isWhitespace(c));
        return res * sgn;
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

    public boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}