import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int H = in.i();
        int W = in.i();
        int M = in.i();
        int[] row = new int[H];
        int[] col = new int[W];
        int rowMax = 0;
        int colMax = 0;
        int[][] hw = new int[M][2];
        for (int i = 0; i < M; i++) {
            int h = in.i() - 1;
            int w = in.i() - 1;
            hw[i][0] = h;
            hw[i][1] = w;
            if (rowMax < ++row[h]) {
                rowMax = row[h];
            }
            if (colMax < ++col[w]){                 
                colMax = col[w];
            }

        }
        int rowCount = 0;
        int colCount = 0;
        boolean[] h = new boolean[H];
        boolean[] w = new boolean[W];
        for (int i = 0; i < H; i++) {
            if (row[i] == rowMax) {
                h[i] = true;
                rowCount++;
            }
        }
        for (int j = 0; j < W; j++) {
            if (col[j] == colMax) {
                w[j] = true;
                colCount++;
            }
        }
        int ans = rowMax + colMax - 1;

        if ((long)rowCount * colCount <= M) {
            int rest =rowCount * colCount;
            for (int i = 0; i < M; i++) {
                int h2 = hw[i][0];
                int w2 = hw[i][1];
                if (h[h2] && w[w2]) { 
                    rest--;
                }
            }
            if (rest > 0) {
                ans++;
            }
        } else {
            ans++;
        }

        out.println(ans);
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
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
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
            if (c != ' ' && c != '\n' && c != '\r') {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                back();
                break;
            }
        }
    }

    char[] s(final int N) {
        skip();
        char[] s = new char[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        return s;
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
