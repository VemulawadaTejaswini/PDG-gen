import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<Boolean> list = new ArrayList<>();
        ArrayList<Boolean> tmpList = new ArrayList<>();
        boolean r = true;
        for (int i = 0; i < n; i++) {
            int buf = System.in.read();
            if (r && buf == 'R') {
                continue;
            } else list.add(buf != 'R');

            r = false;
        }

        list = new ArrayList<>(list.subList(0, list.lastIndexOf(false) + 1));

        int count = 0;

        while (list.size() > 0 && list.contains(true) && list.contains(false)) {
            if (list.indexOf(true) == list.lastIndexOf(true)
                    || list.indexOf(false) == list.lastIndexOf(false)
                    || list.size() < 3
            ) {
                count++;
                break;
            }

            list = new ArrayList<>(list.subList(1, list.size() - 1));
            list = new ArrayList<>(list.subList(list.indexOf(true), list.lastIndexOf(false) + 1));
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
