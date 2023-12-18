import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        double degree = calculateAngle(H, M);
        double side = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(degree)));
        System.out.println(side);
    }

    static double calculateAngle(double h, double m) {
        double hour_angle = (0.5 * (h * 60 + m));
        double minute_angle = (6 * m);
        double angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360 - angle, angle);
        return angle;
    }
}