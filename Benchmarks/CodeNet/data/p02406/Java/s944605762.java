import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            call(n);
        }
    }

    private static void call(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 3 || i % 3 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}