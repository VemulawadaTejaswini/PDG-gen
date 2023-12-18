import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = readInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            int buf = System.in.read();
            arr[i] = buf != 'R';
        }

        int count = 0;
        int i = 0, j = arr.length - 1;
        while (!arr[i]) {
            i++;
            if (i >= arr.length) break;
        }
        while (arr[j]) {
            j--;
            if (j < 0) break;
        }

        while (i < j) {
            i++; j--;
            while (!arr[i]) {
                i++;
                if (i >= arr.length) break;
            }
            while (arr[j]) {
                j--;
                if (j < 0) break;
            }

            count++;
        }

        System.out.print(count);
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
