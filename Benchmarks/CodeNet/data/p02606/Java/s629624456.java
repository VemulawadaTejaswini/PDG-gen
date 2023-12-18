import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int l = readInt(builder), r = readInt(builder), d = readInt(builder), count = 0;
        for (int i = l; i <= r; i++) {
            if (i % d == 0) count++;
        }
        System.out.print(count);
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
}
