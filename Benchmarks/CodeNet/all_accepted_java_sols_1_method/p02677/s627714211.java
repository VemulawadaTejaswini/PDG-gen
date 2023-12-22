import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double hm = h + (m / 60.0);
        double degH = h * 30.0 + m / 60.0 * 30.0;
        double degM = m / 60.0 * 360.0;
        double deg = Math.abs(degH - degM);
        double res = Math.pow((a*a) + (b*b) - 2 * a * b * Math.cos(Math.toRadians(deg)),0.5);
        System.out.println(res);
    }
}
