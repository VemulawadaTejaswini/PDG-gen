import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int n = readInt();
        TreeMap<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long a = readInt();
            map.merge(a, 1L, Long::sum);
        }

        int q = readInt();
        for (int i = 0; i < q; i++) {
            long b = readInt(), c = readInt();
            Long bc = map.get(b), cc = map.get(c);
            if (bc == null) {
            } else if (cc == null) {
                map.remove(b);
                map.put(c, bc);
            } else {
                map.remove(b);
                map.put(c, bc + cc);
            }
            List<Long> list = map.keySet().stream().map(j -> j * map.get(j)).collect(Collectors.toList());
            System.out.println(list.stream().mapToLong(l -> l).sum());
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
