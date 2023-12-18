import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        HashSet<String> pairs = new HashSet<>();

        int n = readInt(), m = readInt();
        HashMap<Integer, Integer> map = new HashMap<>(n);
        for (int i = 1; i <= n; i++) {
            map.put(i, -1);
        }

        int number = 0;
        for (int i = 0; i < m; i++) {
            int a = readInt(), b = readInt();
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            String p = a + "-" + b;
            if (pairs.contains(p)) {
                continue;
            } else {
                pairs.add(p);
            }

            int ag = map.get(a);
            int bg = map.get(b);
            if (ag >= 0) {
                map.put(b, ag);
            } else if (bg >= 0) {
                map.put(a, bg);
            } else {
                map.put(a, number);
                map.put(b, number);
                number++;
            }
        }

        HashMap<Integer, Integer> countMap = new HashMap<>(number);
        map.forEach((i, g) -> {
            if (g == -1) {
                return;
            }
            
            int count = countMap.getOrDefault(g, 0);
            countMap.put(g, count + 1);
        });

        System.out.print(countMap.values().stream().mapToInt(v -> v).max().orElse(n));
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
