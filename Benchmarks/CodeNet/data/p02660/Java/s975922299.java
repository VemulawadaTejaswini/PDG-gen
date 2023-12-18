import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main {
    long N;
    TreeMap<Long, Integer> primes;

    private void prime(long n) {
        primes = new TreeMap<>();
        for(long i = 2;i <= 1000000;i++) {
            int f = 0;
            while(n % i == 0) {
                f++;
                n /= i;
            }
            if (f > 0) {
                primes.put(i, f);
            }
        }
    }

    private void solve() {
        N = nextLong();
        prime(N);
//        for(int i = 0;i < 50;i++) {
//            out.println(i + " : " + primes[i]);
//        }
        if (N == 1) {
            out.println(0);
            return;
        }
        if (primes.size() == 0) {
            out.println(1);
            return;
        }
        Queue<long[]> q = new ArrayDeque<>(), nq;
        for(long i = 0;i < 1000000 + 1;i++) {
            if (primes.containsKey(i)) {
                q.add(new long[]{i, primes.get(i)});
            }
        }

        int ans = 0;
        for(int i = 1;i < 10;i++) {
            nq = new ArrayDeque<>();
            while(!q.isEmpty()) {
                long[] p = q.poll();
                if (p[1] >= i) {
                    ans += 1;
                    p[1] -= i;
                }

                if (p[1] > i) {
                    nq.add(new long[]{p[0], p[1]});
                }
            }
            q = nq;
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
}