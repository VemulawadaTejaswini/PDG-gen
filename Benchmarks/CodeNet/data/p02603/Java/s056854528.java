import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int n = readInt();
        int prev = readInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(prev);
        int i = 1, a;
        while ((a = readInt()) == prev) {
            i++;
        }
        int trend = prev - a;
        list.add(a);
        prev = a;
        try {
            for (; i < n; i++) {
                a = readInt();
                if (trend < 0 && prev - a > 0 || trend > 0 && prev - a < 0) {
                    list.add(a);
                }

                if (prev != a) {
                    trend = prev - a;
                }

                prev = a;
            }
        } catch (Exception e) {
            // ignored
        }

        if (list.size() == 2) {
            if (list.get(0) >= list.get(1)) {
                System.out.print(1000);
            } else {
                int cache = 1000 % list.get(0);
                int num = 1000 / list.get(0);
                cache = cache + num * list.get(1);
                System.out.print(cache);
            }

            return;
        }

        int j = 0;
        while (j < list.size() && list.get(j) > list.get(j + 1)) {
            j++;
        }

        int cache = 1000 % list.get(j), max = 1000, num = 1000 / list.get(j);
        for (j++; j < list.size(); j++) {
            if (list.get(j - 1) > list.get(j)) {
                num += cache / list.get(j);
                cache = cache % list.get(j);
            } else {
                cache += num * list.get(j);
                num = 0;
                max = cache;
            }
        }

        System.out.print(max);

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
