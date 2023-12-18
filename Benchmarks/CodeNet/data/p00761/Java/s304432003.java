import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        while (true) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            if (n == 0 && l == 0) {
                break;
            }
            long[] ans = new long[21];
            ans[0] = n;
            for (int k = 1; k <= 20; k++) {
                int[] d = new int[l];
                for (int i = 0; i < l; i++) {
                    d[i] = n % 10;
                    n /= 10;
                }
                Arrays.sort(d);
                int min = 0;
                for (int i = 0; i < l; i++) {
                    min *= 10;
                    min += d[i];
                }
                int max = 0;
                for (int i = 0; i < l; i++) {
                    max *= 10;
                    max += d[l - i - 1];
                }
                // System.out.printf("max = %d%n", max);
                // System.out.printf("min = %d%n", min);
                ans[k] = max - min;
                n = max - min;
                boolean ok = false;
                for (int i = 0; i < k; i++) {
                    if (n == ans[i]) {
                        System.out.printf("%d %d %d%n", i, ans[i], k - i);
                        ok = true;
                        break;
                    }
                }
                if (ok) {
                    break;
                }
            }
        }
    }

}

class FastScanner {
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

