import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    String S;
    int N,Q;
    int[] l,r;
    private void solve() {
        N = nextInt();
        Q = nextInt();
        S = next();

        l = new int[Q];
        r = new int[Q];
        for(int i = 0;i < Q;i++) {
            l[i] = nextInt();
            r[i] = nextInt();
        }

        int[] sum = new int[N + 1];
        for(int i = 0;i < N;i++) {
            int add = 0;
            if (i + 1 < N) {
                add = S.charAt(i) == 'A' && S.charAt(i + 1) == 'C' ? 1 : 0;
            }
            sum[i + 1] += sum[i] + add;
        }

        for(int i = 0;i < Q;i++) {
            out.println(sum[r[i] - 1] - sum[l[i] - 1]);
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
