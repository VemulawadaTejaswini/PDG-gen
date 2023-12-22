import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();

        int x = Math.max(P, Q);
        if (R > x) {
            System.out.println(P + Q);
        } else {
            System.out.println(R + Math.min(P, Q));
        }
    }
}