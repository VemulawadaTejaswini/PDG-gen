import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    private static ArrayList<Integer> list;
    private static Boolean[] arr;
    public static void main(String[] args) {
        int n = readInt();
        list = new ArrayList<>(n);
        arr = new Boolean[n];
        for (int i = 0; i < n; i++) {
            int j = readInt();
            list.add(j);
            arr[i] = true;
        }

        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) arr[i + 1] = false;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]) {
                if (i < n - 1 && list.get(i).equals(list.get(i + 1))) {
                    arr[i] = false;
                }

                check(i);
            }
        }

        System.out.print(Arrays.stream(arr).filter(Boolean::booleanValue).count());
    }

    private static void check(int i) {
        for (int j = i + 1; j < list.size(); j++) {
            if (arr[j] && list.get(j) % list.get(i) == 0) {
                arr[j] = false;
            }
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
