import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) {
        int n = readInt(), m = readInt();
        HashMap<Integer, Integer> map = new HashMap<>(n);
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
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

            int ag = map.get(a);
            int bg = map.get(b);
            if (ag == -1 && bg == -1) {
                map.put(a, number);
                map.put(b, number);
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(b);
                groups.add(number, list);
                number++;
            } else if (ag == -1) {
                map.put(a, bg);
                groups.get(bg).add(a);
            } else if (bg == -1) {
                map.put(b, ag);
                groups.get(ag).add(b);
            } else {
                if (ag != bg) {
                    ArrayList<Integer> agMember = groups.get(ag);
                    ArrayList<Integer> bgMember = groups.get(bg);
                    for (int bm : bgMember) {
                        map.put(bm, ag);
                        agMember.add(bm);
                    }

                    bgMember.clear();
                }
            }
        }


        System.out.print(groups.stream().mapToInt(ArrayList::size).max().orElse(n));
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
