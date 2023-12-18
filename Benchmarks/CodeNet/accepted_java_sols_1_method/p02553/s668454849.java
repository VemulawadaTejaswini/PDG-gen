import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();

        System.out.println(Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d)));
    }
}