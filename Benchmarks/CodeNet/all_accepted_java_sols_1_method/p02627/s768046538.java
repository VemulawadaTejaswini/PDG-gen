import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();

        if (Character.isUpperCase(S.charAt(0))) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
        return;
    }
}