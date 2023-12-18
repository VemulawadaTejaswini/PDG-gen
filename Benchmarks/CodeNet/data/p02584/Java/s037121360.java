import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        long x = readLong(), k = readLong(), d = readLong();
        if (Math.log10(k) + Math.log10(d) < 15) {
            if (Math.abs(x) > k * d) {
                System.out.print(Math.abs(x) - (k * d));
                return;
            }
        }
        while (k > 0) {
            long next = x;
            if (x > 0) {
                next -= d;
            } else {
                next += d;
            }

            if (next == 0) {
                if (k % 2 == 0) System.out.print(d);
                else System.out.print(0);
                return;
            }

            if ((x > 0 && next < 0) || (x < 0 && next > 0)) {
                if (k % 2 == 0) System.out.print(Math.abs(x));
                else System.out.print(Math.abs(next));
                return;
            }

            x = next;
            k--;
        }

        System.out.print(x);
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

    private static double readDouble() {
        read();
        return Double.parseDouble(builder.toString());
    }

    private static BigDecimal readBigDecimal() {
        read();
        return new BigDecimal(builder.toString());
    }

    private static float readFloat() {
        read();
        return Float.parseFloat(builder.toString());
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
