import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();

            double thetaH = Math.toRadians(360.0 * (H * 60 + M) / (12.0 * 60.0));
            double thetaM = Math.toRadians(360.0 * M / 60.0);

            double xH = A * Math.cos(thetaH);
            double yH = A * Math.sin(thetaH);
            double xM = B * Math.cos(thetaM);
            double yM = B * Math.sin(thetaM);

            double dx = xH - xM;
            double dy = yH - yM;

            double distance = Math.sqrt(dx * dx + dy * dy);

            System.out.println(distance);
        }
    }
}
