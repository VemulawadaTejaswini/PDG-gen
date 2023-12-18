import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        double a=fs.nextDouble();
        double b=fs.nextDouble();
        double h=fs.nextDouble();
        double m=fs.nextDouble();

        double cos=Math.cos(Math.toRadians( (h*30+m*0.5) -m*6));
        double ans= Math.pow(a, 2)+ Math.pow(b, 2)- 2 * a * b * cos;

        System.out.println(Math.sqrt(ans));
    }
}

class FastScanner {
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

    public double nextDouble() {
        return (double) nextLong();
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