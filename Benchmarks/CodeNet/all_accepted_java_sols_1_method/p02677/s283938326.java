import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, h, m;
        a = in.nextDouble();
        b = in.nextDouble();
        h = in.nextDouble();
        m = in.nextDouble();
        in.close();
        double h_angle = 0.5 * (h * 60 + m);
        double m_angle = 6 * m;
        double angle = Math.abs(h_angle - m_angle);
        angle = Math.min(angle, 360 - angle);
        double res = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(angle*Math.PI/180));
        System.out.printf("%.20f\n", res);
    }
}
