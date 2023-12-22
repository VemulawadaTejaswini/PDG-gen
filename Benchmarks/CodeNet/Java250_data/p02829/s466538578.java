import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 1) {
            if (b == 2) {
                System.out.println("3");
            } else {
                System.out.println("2");
            }
        } else if (a == 2) {
            if (b == 1) {
                System.out.println("3");
            } else {
                System.out.println("1");
            }
        } else {
            if (b == 1) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
    }
}
