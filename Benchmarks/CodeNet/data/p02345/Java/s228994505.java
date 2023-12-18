
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.math.BigInteger;

public class Main{

    static PrintWriter out;
    static InputReader ir;

    void solve() {
        int nn = ir.nextInt();
        seg_init(nn);
        int q = ir.nextInt();
        while (q-- > 0) {
            int com = ir.nextInt();
            int x = ir.nextInt();
            int y = ir.nextInt();
            if (com == 0) {
                update(x, y);
            } else {
                out.println(query(x, y + 1, 0, 0, n));
            }
        }
    }

    int n, q;
    int seg[];

    void seg_init(int nn) {
        n = 1;
        while (n < nn) {
            n <<= 1;
        }
        seg = new int[n * 2 - 1];
        Arrays.fill(seg, Integer.MAX_VALUE);
    }

    int query(int a, int b, int k, int l, int r) {
        if (a <= l && r <= b) {
            return seg[k];
        }
        if (r <= a || b <= l) {
            return Integer.MAX_VALUE;
        }
        int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
        int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.min(vl, vr);
    }

    void update(int i, int x) {
        i += n - 1;
        seg[i] = x;
        while (i > 0) {
            i = (i - 1) / 2;
            seg[i] = Math.min(seg[i * 2 + 1], seg[i * 2 + 2]);
        }
    }

    public static void main(String[] args) throws Exception {
        ir = new InputReader(System.in);
        out = new PrintWriter(System.out);
        new Main_Other().solve();
        out.flush();
    }

    static class InputReader {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;

        public InputReader(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }

        public boolean hasNextByte() {
            if (curbuf >= lenbuf) {
                curbuf = 0;
                try {
                    lenbuf = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) {
                return buffer[curbuf++];
            } else {
                return -1;
            }
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private void skip() {
            while (hasNextByte() && isSpaceChar(buffer[curbuf])) {
                curbuf++;
            }
        }

        public boolean hasNext() {
            skip();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (!isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int c = readByte();
            while (isSpaceChar(c)) {
                c = readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }

        public long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int c = readByte();
            while (isSpaceChar(c)) {
                c = readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = readByte();
            } while (!isSpaceChar(c));
            return (minus) ? -res : res;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = next().toCharArray();
            }
            return map;
        }
    }
}