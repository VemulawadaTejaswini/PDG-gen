import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        long n = readLong();
        double sqrt = Math.sqrt(n);
        if (n == 1) {
            System.out.print(0);
            return;
        }

        if (n < 6) {
            System.out.print(1);
            return;
        }

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                n /= i;
                list.add(i);
            }
        }

        while (n != 1 && list.contains(n)) {
            if (list.contains(n)) {
                count--;
                sqrt = n;
                list.remove(n);
                n *= n;
                for (int i = 2; i <= sqrt; i++) {
                    if (n % i == 0 && !list.contains(n)) {
                        count++;
                        n /= i;
                        list.add(i);
                    }
                }
            }
        }

        if (count == 0) {
            System.out.print(1);
            return;
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
