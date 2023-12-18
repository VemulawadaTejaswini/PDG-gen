import java.util.Scanner;

/**
 * @author penguin_410
 *         Date: 2014/03/06
 */
public class Main {
    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int x = scanner.nextInt();
            final int y = scanner.nextInt();
            if (x == 0 && y == 0) break;
            sb.append(x < y ? x + " " + y : y + " " + x).append("\n");
        }
        System.out.print(sb);
    }
}