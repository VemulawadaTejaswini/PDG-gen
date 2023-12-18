import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        String postfix = S.charAt(S.length() - 1) == 's' ? "es" : "s";
        System.out.println(S + postfix);
    }
}