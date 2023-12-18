import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scanner = new Scanner(System.in);
        final int rows = scanner.nextInt();
        final int columns = scanner.nextInt();
        final int targetBlack = scanner.nextInt();
        for (int rowPushes = 0; rowPushes <= rows; rowPushes++) {
            for (int columnPushes = 0; columnPushes <= columns; columnPushes++) {
                int black = rowPushes * columns + columnPushes * rows - 2 * rowPushes * columnPushes;
                if (black == targetBlack) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}