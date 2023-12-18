import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int num = readInt(builder);
        int count = readInt(builder);
        ArrayList<Integer> list = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            list.add(readInt(builder));
        }

        long max = max(new ArrayList<>(), list, count);
        long result = max % 1000000007;
        if (result < 0) result = 1000000007 + result;
        System.out.print(result);
    }

    private static long max(ArrayList<Integer> la, ArrayList<Integer> lb, int num) {
        if (num == 1) {
            return lb.stream().map(b -> {
                long result = b;
                for (int a : la) {
                    result *= a;
                }
                return result;
            }).max(Comparator.naturalOrder()).get();
        }

        return lb.stream().map(b -> {
            ArrayList<Integer> nla = new ArrayList<>(la);
            ArrayList<Integer> nlb = new ArrayList<>(lb);

            nla.add(b);
            nlb.remove(b);

            return max(nla, nlb, num - 1);
        }).max(Comparator.naturalOrder()).get();
    }

    private static StringBuilder read(StringBuilder builder) {
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

        return builder;
    }

    private static int readInt(StringBuilder builder) {
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

        return Integer.parseInt(builder.toString());
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
