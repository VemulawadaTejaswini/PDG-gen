import java.io.IOException;
import java.math.BigInteger;

public class Main {
    private static StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int x = readInt();
        int y = readInt();

        int b2 = y - 2 * x;

        if (b2 < 0 || 200 < b2) {
            System.out.print("No");
            return;
        }

        if (b2 % 2 == 1) {
            System.out.print("No");
            return;
        }

        int b = (y - 2 * x) / 2;
        if (x - b < 0 || 100 < x - b) {
            System.out.print("No");
            return;
        }

        System.out.print("Yes");
    }

    private static void read() {
        builder.setLength(0);
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) {
                    break;
                } else {
                    builder.appendCodePoint(b);
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    private static int readInt() {
        read();
        return Integer.parseInt(builder.toString());
    }

    private static int readInt(int radix) {
        read();
        return Integer.parseInt(builder.toString(), radix);
    }

    private static long readLong() {
        read();
        return Long.parseLong(builder.toString());
    }

    private static long readLong(int radix) {
        read();
        return Long.parseLong(builder.toString(), radix);
    }

    private static BigInteger readBigInteger() {
        read();
        return new BigInteger(builder.toString());
    }

    private static BigInteger readBigInteger(int radix) {
        read();
        return new BigInteger(builder.toString(), radix);
    }

    private static void skipLine() {
        while (true) {
            try {
                int b = System.in.read();
                if (b == '\n' || b == -1) {
                    break;
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    private static void skip() {
        while (true) {
            try {
                int b = System.in.read();
                if (b == ' ' || b == '\n' || b == -1) break;
            } catch (IOException e) {
                break;
            }
        }
    }

}
