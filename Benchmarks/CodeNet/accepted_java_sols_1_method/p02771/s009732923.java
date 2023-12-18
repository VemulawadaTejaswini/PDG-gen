
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        if (a == b) {
            if (a == c) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else if (a == c) {
            System.out.println("Yes");
        } else if (b == c) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
