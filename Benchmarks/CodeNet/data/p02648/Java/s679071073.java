import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "atcoder_hh_2017_1/src/D2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        long[] v = new long[n];
        long[] w = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }

        int half = 512;
        TreeMap<Long, Long>[][] maps = new TreeMap[n][];
        maps[0] = build(n, Math.min(half, n), 0, w, v);
        for (int i = half; i < n && i < half * 2 + 1; i++) {
            maps[i] = build(n, n, i, w, v);
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int vv = in.nextInt() - 1;
            int l = in.nextInt();
            if (vv < half) {
                long res = 0;
                for (Map.Entry<Long, Long> e : maps[0][vv].entrySet()) {
                    if (e.getKey() <= l) {
                        res = Math.max(res, e.getValue());
                    }
                }
                System.out.println(res);
            } else {
                int p = vv;
                while (maps[p] == null) p = (p - 1) / 2;
                if (p == 0) {
                    throw new RuntimeException();
                }

                int pp = (p - 1) / 2;
                long res = 0;
                for (Map.Entry<Long, Long> e1 : maps[0][pp].entrySet()) {
                    if (l < e1.getKey()) continue;

                    Map.Entry<Long, Long> e2 = maps[p][vv].floorEntry(l - e1.getKey());
                    if (e2 != null && e1.getKey() + e2.getKey() <= l) {
                        res = Math.max(res, e1.getValue() + e2.getValue());
                    }
                }
                System.out.println(res);
            }
        }
    }

    private TreeMap<Long, Long>[] build(final int n, final int size, final int root, final long[] w, final long[] v) {
        TreeMap<Long, Long>[] maps = new TreeMap[n];
        for (int i = 0; i < n; i++) {
            maps[i] = new TreeMap<>();
        }
        maps[root].put(0L, 0L);
        maps[root].put(w[root], v[root]);
        Queue<Integer> q = new ArrayDeque<>();
        q.add(root*2+1);
        q.add(root*2+2);
        while (!q.isEmpty()) {
            int i = q.poll();
            if (i >= size) continue;

            for (Map.Entry<Long, Long> e : maps[(i-1)/2].entrySet()) {
                maps[i].put(e.getKey(), Math.max(e.getValue(), maps[i].getOrDefault(e.getKey(), 0L)));
                maps[i].put(e.getKey() + w[i], Math.max(e.getValue() + v[i], maps[i].getOrDefault(e.getKey() + w[i], 0L)));
            }
            q.add(i*2+1);
            q.add(i*2+2);
        }
        TreeMap<Long, Long>[] nmaps = new TreeMap[n];
        for (int i = 0; i < n; i++) {
            nmaps[i] = new TreeMap<>();
        }
        for (int i = 0; i < n; i++) {
            if (maps[i] == null) continue;
            for (Map.Entry<Long, Long> e : maps[i].entrySet()) {
                Map.Entry<Long, Long> le = nmaps[i].lowerEntry(e.getKey());
                if (le == null) {
                    nmaps[i].put(e.getKey(), e.getValue());
                } else {
                    nmaps[i].put(e.getKey(), Math.max(le.getValue(), e.getValue()));
                }
            }
        }
        return nmaps;
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
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

class StringLibs {

    public static int[] kmp(String pattern) {
        int n = pattern.length();
        int[] table = new int[n + 1];
        table[0] = -1;
        int j = -1;
        for (int i = 0; i < pattern.length(); i++) {
            while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) j = table[j];
            j++;
            table[i + 1] = j;
        }
        return table;
    }

    public static int find(String target, String pattern) {
        int[] table = kmp(pattern);

        int n = target.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && target.charAt(i) != pattern.charAt(j)) {
                j = table[j];
            }
            j++;
            if (j == pattern.length()) {
                return i + 1 - pattern.length();
            }
        }
        return -1;
    }


    public static int[] zAlgo(String s) {
        int n = s.length();
        int[] res = new int[n];
        res[0] = n;
        int i = 1, j = 0;
        while (i < n) {
            while (i + j < n && s.charAt(j) == s.charAt(i + j)) j++;
            res[i] = j;
            if (j == 0) {
                i++;
                continue;
            }

            int k = 1;
            while (i + k < n && k + res[k] < j) {
                res[i + k] = res[k];
                k++;
            }
            i += k;
            j -= k;
        }
        return res;
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
