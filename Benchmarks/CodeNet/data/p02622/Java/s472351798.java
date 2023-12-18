import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        final MyScanner sc = new MyScanner();
        final char[] sArray = sc.next().toCharArray();
        final char[] tArray = sc.next().toCharArray();

        int counter = 0;
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

class MyScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufLength = 0;

    private boolean hasNextByte() {
        if (pointer < bufLength) {
            return true;
        } else {
            pointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            if (bufLength <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[pointer++];
        } else {
            return -1;
        }
    }

    private static boolean isNumberChar(final int c) {
        return '0' <= c && c <= '9';
    }

    private static boolean isPrintableChar(final int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
            pointer++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        final StringBuilder sb = new StringBuilder();
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
        long num = 0;
        boolean isNegative = false;
        int b = readByte();
        if (b == '-') {
            isNegative = true;
            b = readByte();
        }
        if (!isNumberChar(b)) {
            throw new NumberFormatException();
        }
        while (true) {
            if (isNumberChar(b)) {
                num *= 10;
                num += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return isNegative ? -num : num;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        final long temp = nextLong();
        if (temp < Integer.MIN_VALUE || Integer.MAX_VALUE < temp) {
            throw new NumberFormatException();
        }
        return (int) temp;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
