
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.next();
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i + 2 < str.length(); ++i) {
            int current = (str.charAt(i) - '0') * 100 +
                    (str.charAt(i + 1) - '0') * 10 +
                    (str.charAt(i + 2) - '0');
            int diff = Math.abs(current - 753);
            if (diff < minNumber) {
                minNumber = diff;
            }
        }
        System.out.println(minNumber);
    }
}
