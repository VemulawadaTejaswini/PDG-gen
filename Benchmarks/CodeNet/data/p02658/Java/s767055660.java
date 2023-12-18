import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
    int N;
    long[] A;
    private void solve() {
        N = nextInt();
        BigInteger sum = BigInteger.ONE;
        A = new long[N];
        for(int i = 0;i < N;i++) {
            A[i] = nextLong();

            if (A[i] == 0) {
                out.println(0);
                return;
            }
        }


        for(int i = 0;i < N;i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(A[i])));
            if (sum.compareTo(new BigInteger("1000000000000000000")) == 1) {
                break;
            }
        }

        if (sum.compareTo(new BigInteger("1000000000000000000")) == 1) {
            out.println(-1);
        } else {
            out.println(sum.longValue());
        }
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}