import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        long n = readLong();
        double k = 0;
        int b = 0;
        ArrayList<Double> list = new ArrayList<>(11);
        for (int i = 0; i < 11; i++) {
            k += Math.pow(26, i + 1);
            list.add(k);
            if (n <= k) {
                b = i;
                break;
            }
        }

        if (b == 0) {
            char c = (char) ('a' + (n - 1));
            System.out.print(c);
        } else {
            long diff = (long) (n - list.get(b - 1));
            ArrayList<Integer> mod = new ArrayList<>();
            while (diff >= 26) {
                mod.add((int) (diff % 26));
                diff /= 26;
            }
            Collections.reverse(mod);
            StringBuilder builder = new StringBuilder();
            builder.appendCodePoint((int) ('a' + diff));
            for (int i = 0; i < mod.size() - 1; i++) {
                builder.appendCodePoint('a' + mod.get(i));
            }
            
            builder.appendCodePoint('a' - 1 + mod.get(mod.size() - 1));

            for (int i = 0; i < b - mod.size(); i++) {
                builder.insert(0, "a");
            }

            System.out.print(builder.toString());
        }
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
