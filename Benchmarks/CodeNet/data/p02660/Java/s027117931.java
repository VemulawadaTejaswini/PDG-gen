
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    final long N;

    AtCoder(FastScanner sc) {
        N = sc.nextLong();
    }

    void solve(PrintWriter out) {
        if (N == 1) {
            out.println("0");
            return;
        }
        if (isPrime(N)) {
            out.println("1");
            return;
        }
        long tmp = N;
        int cnt = 0;
        List<Long> list = new ArrayList<>();
        for (long i = 2; i <= Math.sqrt(N); i++) {
            for (int j = 1; (long)Math.pow(i, j) <= Math.sqrt(N); j++) {
                if (isPrime(i)) {
                    long k = (long) Math.pow(i, j);
                    list.add(k);
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            long j = list.get(i);
            if (tmp % j != 0) continue;
            tmp /= j;
            cnt++;
            if (tmp == 1) break;
        }
        out.println(cnt);

    }

    boolean isPrime(long x) {
        if (x == 2) {
            return true;
        } else if (x < 2 || x % 2 == 0) {
            return false;
        }
        long i = 3;
        while (i <= Math.sqrt(x)) {
            if (x % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }
}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
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
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
