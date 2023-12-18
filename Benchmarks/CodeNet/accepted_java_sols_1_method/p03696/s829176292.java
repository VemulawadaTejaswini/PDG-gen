import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();

        int buf;
        while ((buf = System.in.read()) != '\n');

        while ((buf = System.in.read()) != '\n') {
            builder.appendCodePoint(buf);
        }

        StringBuilder ret = new StringBuilder(builder);

        int idx;
        while ((idx = builder.indexOf("()")) != -1) {
            builder.delete(idx, idx + 2);
        }

        for (char c : builder.toString().toCharArray()) {
            if (c == ')') ret.insert(0, '(');
            else ret.append(')');
        }
        System.out.print(ret.toString());
    }
}
