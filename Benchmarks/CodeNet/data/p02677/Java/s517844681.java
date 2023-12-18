import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();

        double mTHeta = 6 * m;
        double hTheta = 30 * h + 0.5 * m;
        double theta = Math.abs(hTheta - mTHeta);

        double ans = 0;
        double bDash = 0;
        if (theta == 0 || theta == 360) ans = Math.abs(b - a);
        else if (theta == 180) ans = b + a;
        else if (theta > 180) {
            theta = 360 - theta;
            bDash = b - (Math.cos(Math.toRadians(theta)) * a);
            ans = Math.sqrt(bDash * bDash + Math.sin(Math.toRadians(theta)) * a * Math.sin(Math.toRadians(theta)) * a);
        } else {
            bDash = b - (Math.cos(Math.toRadians(theta)) * a);
            ans = Math.sqrt(bDash * bDash + Math.sin(Math.toRadians(theta)) * a * Math.sin(Math.toRadians(theta)) * a);
        }
        System.out.println(ans);
    }
}