import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        double hdeg = h / 12 * 360 + (m / 60) * 30;
        double mdeg = m / 60 * 360;
        double deg = Math.min(Math.abs(hdeg - mdeg), Math.abs(360 - (hdeg - mdeg)));
        double ans = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(deg));
        System.out.println(Math.sqrt(ans));
    }

}
