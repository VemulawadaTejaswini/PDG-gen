import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > B && B != 1) {
            System.out.println("Alice");
        } else if (A > B && B == 1) {
            System.out.println("Bob");
        } else if (B > A && A != 1) {
            System.out.println("Bob");
        } else if (B > A && A == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Draw");
        }

    }
}
