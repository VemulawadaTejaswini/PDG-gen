import java.util.HashMap;
import java.util.HashSet;
import java.util.Comparator;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Arrays;
import javax.swing.*;
import java.util.PriorityQueue;
import java.io.FileNotFoundException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/F1";

    FastScanner in;
    PrintWriter out;

    class Event {
        final int t;
        final int pos;
        final int v;

        public Event(int t, int pos, int v) {
            this.t = t;
            this.pos = pos;
            this.v = v;
        }
    }

    public void solve() {
        int N = in.nextInt();
        int Q = in.nextInt();
        int[] c = in.nextIntArray(N);
        Event[] es = new Event[N+2*Q];
        for (int i = 0; i < N; i++) {
            es[i] = new Event(0, i + 1, c[i]);
        }
        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i = 0; i < Q; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();
            es[N+i] = new Event(1, l[i], i);
            es[N+Q+i] = new Event(2, r[i], i);
        }
        Arrays.sort(es, (e1, e2) -> {
            if (e1.pos != e2.pos) {
                return Integer.compare(e1.pos, e2.pos);
            } else {
                return Integer.compare(e1.t, e2.t);
            }
        });

        BinaryIndexedTree bit = BinaryIndexedTree.create(N);
        HashMap<Integer, Integer> valToPos = new HashMap<>();
        long[] res = new long[Q];
        for (Event e : es) {
            if (e.t == 0) {
                if (valToPos.containsKey(e.v)) {
                    bit.add(valToPos.get(e.v), -1);
                }
                bit.add(e.pos, 1);
                valToPos.put(e.v, e.pos);
            } else if (e.t == 1) {

            } else {
                int i = e.v;
                res[i] = bit.sum(r[i]) - bit.sum(l[i] - 1);
            }
        }
        for (int i = 0; i < Q; i++) {
            out.println(res[i]);
        }
        out.close();
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

class BinaryIndexedTree {
    final int n;
    final long[] a;

    private BinaryIndexedTree(int size, long[] a) {
        this.n = size;
        this.a = a;
    }

    public static BinaryIndexedTree create(int n) {
        int size = Integer.highestOneBit(n) << 1;
        return new BinaryIndexedTree(size, new long[size+1]);
    }

    public void add(int x, long w) {
        for (int i = x; i <= n; i += i & -i) {
            a[i] += w;
        }
    }

    public long sum(int x) {
        long res = 0;
        for (int i = x; i > 0; i -= i & -i) {
            res += a[i];
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
