import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int xl = Integer.MAX_VALUE;
        int xr = 1;
        int yb = xl;
        int yt = 1;
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = in.i();
            y[i] = in.i();
            if (x[i] < xl) {
                xl = x[i];
            }
            if (xr < x[i]) {
                xr = x[i];
            }
            if (y[i] < yb) {
                yb = y[i];
            }
            if (yt < y[i]) {
                yt = y[i];
            }
        }

        HashSet<Integer> hs = new HashSet<>();

        int x0 = xr;
        int x1 = xl;
        int p0 = 0;
        int p1 = 0;
        for (int i = 0; i < N; i++) {
            if (y[i] == yb) {
                if (x[i] < x0) {
                    x0 = x[i];
                    p0 = i;
                }
                if (x1 < x[i]) {
                    x1 = x[i];
                    p1 = i;
                }
            }
        }
        hs.add(p0);
        hs.add(p1);

        x0 = xr;
        x1 = xl;
        for (int i = 0; i < N; i++) {
            if (y[i] == yt) {
                if (x[i] < x0) {
                    x0 = x[i];
                    p0 = i;
                }
                if (x1 < x[i]) {
                    x1 = x[i];
                    p1 = i;
                }
            }
        }
        hs.add(p0);
        hs.add(p1);


        int y0 = yt;
        int y1 = yb;
        for (int i = 0; i < N; i++) {
            if (x[i] == xl) {
                if (y[i] < y0) {
                    y0 = y[i];
                    p0 = i;
                }
                if (y1 < y[i]) {
                    y1 = y[i];
                    p1 = i;
                }
            }
        }
        hs.add(p0);
        hs.add(p1);

        y0 = yt;
        y1 = yb;
        for (int i = 0; i < N; i++) {
            if (x[i] == xr) {
                if (y[i] < y0) {
                    y0 = y[i];
                    p0 = i;
                }
                if (y1 < y[i]) {
                    y1 = y[i];
                    p1 = i;
                }
            }
        }
        hs.add(p0);
        hs.add(p1);

        int max = 0;
        ArrayList<Integer> list = new ArrayList<>(hs);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int ii = list.get(i);
                int jj = list.get(j);
                int xi = x[ii];
                int yi = y[ii];
                int xj = x[jj];
                int yj = y[jj];
                int d = Math.abs(xi - xj) + Math.abs(yi - yj);
                if (max < d) {
                    max = d;
                }
            }
        }
        out.println(max);
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
