
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  N = scanner.nextLine();
        char alpha = N.charAt(0);
        if (Character.isUpperCase(alpha)) {
            System.out.println("A");

        } else {

            System.out.println("a");
        }

    }
}
