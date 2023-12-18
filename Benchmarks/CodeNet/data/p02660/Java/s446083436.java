import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    long N;

    private List<Integer> generatePrimeList(int max) {
        boolean[] isPrime = new boolean[max + 1];
        List<Integer> list = new ArrayList<>();

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2;i * i <= max;i++) {
            for(int j = 2;j * i <= max;j++) {
                isPrime[j * i] = false;
            }
        }
        for(int i = 0;i <= max;i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }
        return list;
    }
    private void solve() {
        N = nextLong();
        List<Integer> primeList = generatePrimeList((int)1e6);
        List<Integer> factorCntList = new ArrayList<>();
        for(int p : primeList) {
            int cnt = 0;
            while(N % p == 0) {
                N /= p;
                cnt++;
            }
            if (cnt > 0) {
                factorCntList.add(cnt);
            }
        }

        if (factorCntList.size() == 0) {
            out.println(1);
            return;
        }

        int ans = 0;
        for(int factorCnt : factorCntList) {
            int cnt = factorCnt;
            for(int i = 1;i <= 10 && i <= cnt;i++) {
                ans++;
                cnt -= i;
            }
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