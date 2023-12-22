import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double angle = Math.abs(360.0*H/12.0 - 360.0*M/60.0 + 30.0*M/60.0);
        double length = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2*A*B*Math.cos(Math.toRadians(angle)));
        System.out.println(length);
    }
}