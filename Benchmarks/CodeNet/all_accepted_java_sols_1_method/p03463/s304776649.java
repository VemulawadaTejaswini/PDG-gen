import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int d = (B - A) % 2;
        if (d == 1) {
            System.out.println("Borys");
        }else {
            System.out.println("Alice");
        }
    }
}
