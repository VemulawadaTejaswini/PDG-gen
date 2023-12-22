
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();

        if (S.length() % 2 != 0) {
            System.out.println("No");
            return;
        }

        String first = S.substring(0, S.length() / 2);
        String second = S.substring(S.length() / 2);

        if (first.equals(second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
