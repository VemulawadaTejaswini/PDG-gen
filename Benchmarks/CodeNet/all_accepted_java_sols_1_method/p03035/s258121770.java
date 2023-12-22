import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A <= 5) {
            System.out.println(0);
        } else if (A <= 12) {
            System.out.println(B/2);
        } else {
            System.out.println(B);
        }
    }
}
