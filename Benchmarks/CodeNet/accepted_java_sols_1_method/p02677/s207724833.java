import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double angle = Math.abs(M*6.0 - 0.5*(60*H + M));
        double length = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2*A*B*Math.cos(Math.toRadians(angle)));
        System.out.println(length);
    }
}
