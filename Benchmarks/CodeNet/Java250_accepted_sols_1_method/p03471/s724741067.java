import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int i = 0; i <= X; i++) {
            for (int j = 0; j <= X - i; j++) {
                // 1000えん
                int k = X - i - j;

                if (10000 * i + 5000 * j + 1000 * k == Y) {
                    System.out.printf("%d %d %d", i, j, k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}
