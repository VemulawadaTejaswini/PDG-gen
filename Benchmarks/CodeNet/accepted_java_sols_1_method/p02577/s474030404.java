import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();

        System.out.println(N.chars().map(n -> n - '0').sum() % 9 == 0 ? "Yes" : "No");
    }
}
