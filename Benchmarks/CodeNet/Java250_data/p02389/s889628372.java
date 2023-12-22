import java.util.Scanner;

public class Main {

    private static final String format = "%d %d";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(String.format(format, (a * b), (2 * (a + b))));
    }
}