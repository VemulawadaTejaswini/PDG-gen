import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double c2 = A * A + B * B - 2.0 * A * B * Math.cos((3.141592653589793238 * (300.0 * H - 55.0 * M))/1800.0);
        double c = Math.sqrt(c2);
        System.out.printf("%.20f", c);
    }
}
