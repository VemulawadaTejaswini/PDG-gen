
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in, Charset.defaultCharset().name())) {
            int diff = Integer.parseInt(sc.next());
            String text = sc.next();

            StringBuilder sb = new StringBuilder();
            for (char c : text.toCharArray()) {
                int codePoint = (c - 'A' + diff) % ('Z' - 'A' + 1) + 'A';
                sb.append((char) codePoint);
            }
            System.out.println(sb.toString());
        }
    }

}