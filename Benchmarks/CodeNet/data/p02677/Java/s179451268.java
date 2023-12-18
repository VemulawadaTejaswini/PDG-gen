import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        double degree = calculateAngle(H, M);
        double valueRadians = Math.toRadians(degree);
        double side = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(valueRadians));
        System.out.println(side);
    }

    static int calculateAngle(double h, double m) {
        int hour_angle = (int) (0.5 * (h * 60 + m));
        int minute_angle = (int) (6 * m);
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360 - angle, angle);
        return angle;
    }
}
