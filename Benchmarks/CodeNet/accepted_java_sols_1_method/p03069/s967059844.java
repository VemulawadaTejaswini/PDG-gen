import java.util.Scanner;

public class Main {
    private static final char BLACK = '#';
    private static final char WHITE = '.';

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int length = scanner.nextInt();
        scanner.nextLine();
        final char[] chars = scanner.nextLine().toCharArray();

        int white = 0;
        int black = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == WHITE) {
                white++;
            } else {
                black++;
            }
        }

        int result = Integer.MAX_VALUE;
        int kuroRuiseki = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == BLACK) {
                kuroRuiseki++;
            }

            int kaeru = kuroRuiseki + length - i - 1 - (black - kuroRuiseki);

            if (kaeru >= 0 && result > kaeru) {
                result = kaeru;
            }
        }

        System.out.println(Math.min(Math.min(black, white), result));

    }
}
