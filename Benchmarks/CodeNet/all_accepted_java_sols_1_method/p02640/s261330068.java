import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        double b = 0.5 * Y - X;
        double a = X - b;

        if (b >= 0 && a >= 0) {
            if (b == (int)b && a == (int)a) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
