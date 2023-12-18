import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        String alpha = scanner.next();

        if (Character.isUpperCase(alpha.charAt(0))) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
