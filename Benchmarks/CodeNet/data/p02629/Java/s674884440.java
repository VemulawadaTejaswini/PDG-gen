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

    /* 変数宣言 */
    final long N;

    AtCoder(FastScanner sc) {
        N = sc.nextLong();
    }

    void solve(PrintWriter out) {
        // Long prevObj = N;
        Long currObj = N - 1;
        int q;
        final int C = 26;
        char[] alphabet = new char[C];
        char a = 'a';

        alphabet[0] = a;
        for (int i = 1; i < alphabet.length; i++) {
            a++;
            alphabet[i] = a;
        }

        int amari = 0;
        if (currObj >= C) {
            amari = (int) (currObj % C);
        }
        // int maxDigit = (int) (Math.log(currObj - amari) / Math.log(C));

        long tmpObj = currObj - amari;
        int maxDigit = 0;
        while (1 <= tmpObj / C) {
            tmpObj /= C;
            maxDigit++;
        }

        tmpObj = currObj;
        for (int i = maxDigit; 0 <= i; i--) {
            q = 0;

            long currDigit = (long) Math.pow(C, i);
            while (0 <= (tmpObj - currDigit)) {
                tmpObj -= currDigit;
                q++;
            }

            if (i == maxDigit && maxDigit > 0) {
                out.print(alphabet[q - 1]);
            } else {
                out.print(alphabet[q]);
            }
            /* out.print(alphabet[q]); */
        }

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