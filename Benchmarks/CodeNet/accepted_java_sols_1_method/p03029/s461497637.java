import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int p = scanner.nextInt();

        System.out.println((a * 3 + p) / 2);
    }
}