import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.*;

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

public class Main {
    static int MOD = 1000000007;

    public static class Mas {
        int x;
        int y;
        int step;

        Mas(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    static long pow(long l, long i) {
        if (i == 0)
            return 1;
        else {
            if (i % 2 == 0) {
                long val = pow(l, i / 2);
                return val * val % 2019;
            } else {
                return pow(l, i - 1) * l % 2019;
            }
        }
    }

    private static final int[] vX = { 1, 0, 0, -1 };
    private static final int[] vY = { 0, 1, -1, 0 };

    static class Edge {
        int idx;
        int node;

        public Edge(int n, int i) {
            this.idx = i;
            this.node = n;
        }
    }

    static int stocks = 0;
    static long maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n <= 1)
            return 0;
            long maxPro = 1000;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    stocks += maxPro / prices[i - 1];
                    maxPro -= stocks * prices[i - 1];
                    // System.out.println("sotck"+stocks);
                    maxPro += stocks * (prices[i]);
                    stocks = 0;
                }
                // System.out.println("money　"+maxPro+"stock　"+stocks+"price"+prices[i]);
                // System.out.println(maxPro);
                    
            }
            return Math.max(maxPro,1000);
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] a = new int[n];
        // int[] a = { 110, 115, 100,150 };
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
    //    int[] c={2,4,1};
        System.out.println(maxProfit(a.length,a));
        // int min = a[0];
        // int max = a[0];
        // int beforeidx = 0;
        // String[] b = new String[n];
        // for (int i =0; i < n; i++) {
        //     if (i == 0) {
        //         b[0] = "min";
        //         continue;
        //     }
        //     if (a[i] > max) {
                
        //     }

        // }

       
    }
}
