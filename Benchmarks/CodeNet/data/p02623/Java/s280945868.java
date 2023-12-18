import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int N, M, K;
    int[] A,B;

    private void solve() {
        N = nextInt();
        M = nextInt();
        K = nextInt();
        A = nextIntArray(N);
        B = nextIntArray(M);

        long[] suma = new long[N + 1];
        for(int i = 0;i < N;i++) {
            suma[i + 1] += suma[i] + A[i];
        }
        long[] sumb = new long[M + 1];
        for(int i = 0;i < M;i++) {
            sumb[i + 1] += sumb[i] + B[i];
        }

        int ans = 0;
        for(int i = 0;i < N+1;i++) {
            if (suma[i] > K) {
                continue;
            }
            long remain = K - suma[i];
            int low = 0;
            int high = M+1;
            while(high - low > 1) {
                int mid = high + low >> 1;
                if (sumb[mid] > remain) {
                    high = mid;
                } else {
                    low = mid;
                }
            }
            ans = Math.max(ans, i + low);
        }

        out.println(ans);
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

    public int[] nextIntArray(int n) {
        int[] x = new int[n];
        for(int i = 0;i < n;i++) {
            x[i] = nextInt();
        }
        return x;
    }

    public long[] nextLongArray(int n) {
        long[] x = new long[n];
        for(int i = 0;i < n;i++) {
            x[i] = nextLong();
        }
        return x;
    }

    public double[] nextDoubleArray(int n) {
        double[] x = new double[n];
        for(int i = 0;i < n;i++) {
            x[i] = nextDouble();
        }
        return x;
    }
}