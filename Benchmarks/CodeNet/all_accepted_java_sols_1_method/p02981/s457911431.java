import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.println(Math.min(n * a, b));
    }
}