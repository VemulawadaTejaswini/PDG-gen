import java.io.IOException;
import java.io.InputStream;
import java.util.Deque;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
    static int[] a;
    // static int[] qu;
    static HashMap hp = new HashMap<Integer,Boolean>();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        FS fs = new FS();
        int n = fs.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
        int q = fs.nextInt();
        //    qu = new int[q];
        for (int i = 0; i < q; i++) {
            sb.append(solve(0, fs.nextInt()) ? "yes\n" : "no\n");
        }
        System.out.print(sb.toString());
    }

    private static boolean solve(int p, int t) {
        if (hp.containsKey(t))return (Boolean) hp.get(t);
        if (t == 0) {
            hp.put(t, true);
            return true;
        }
        if (t < 0 || p >= a.length) {
            hp.put(t,false);
            return false;
        }
        return solve(p + 1, t - a[p]) || solve(p + 1, t);
    }

    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            return hasNextByte() ? buffer[ptr++] : -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}

