import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int x = scanner.nextInt();
        final int a = scanner.nextInt();

        System.out.println(x < a ? 0 : 10);
    }
}