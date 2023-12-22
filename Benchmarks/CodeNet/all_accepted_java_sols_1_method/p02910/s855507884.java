import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                final char c = input.charAt(i);
                if (i % 2 == 0 && c == 'L') {
                    System.out.println("No");
                    return;
                }
                if (i % 2 == 1 && c == 'R') {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}