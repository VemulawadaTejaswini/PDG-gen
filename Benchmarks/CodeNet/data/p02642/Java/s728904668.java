import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastScanner fs = new FastScanner();
        final int n = fs.nextInt();
        final int[] a = new int[n];
        final ArrayList<Integer> aa = new ArrayList<Integer>();
        final ArrayList<Integer> copy = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
            if (aa.contains(a[i])) copy.add(a[i]);
            aa.add(a[i]);
        }

            Collections.sort(aa);

            int ans = 0;
            boolean isz = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i] > aa.get(j) && a[i] % aa.get(j) ==0 || copy.contains(a[i])) {
                        isz = true;
                        break;
                    }
                    if (a[i] <= aa.get(j)) break;
                }
                if (!isz) ans++;
                isz = false;
            }

            System.out.println(ans);
        }
    }

class FastScanner{
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen)
            return true;
        else
            ptr = 0;
        try {
            buflen = in.read(buffer);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(final int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        final StringBuilder sb = new StringBuilder();
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
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b)
            throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b))
                return minus ? -n : n;
            else
                throw new NumberFormatException();
            b = readByte();
        }
    }
}