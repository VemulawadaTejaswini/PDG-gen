import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();

        System.out.println(T.indexOf(S) == 0 ? "Yes" : "No");
    }
}
