import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();

        String regex = "(\\d){" + a + "}-(\\d){" + b + "}";

        System.out.println(s.matches(regex) ? "Yes" : "No");

    }
}