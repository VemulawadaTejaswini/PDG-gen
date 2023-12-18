import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        
        if (a * a * b == x * 2) {
            double tmp = Math.sqrt(x * 2 / b);
            double tmp2 = Math.toDegrees(Math.atan(b/tmp));
            System.out.println(tmp2);
        } else if (a * a * b / 2 < x) {
            // x + a*a*tmp/2 = a*a*b;
            // 2x + a^2*tmp = 2a^2b;
            // 2x/a/a + tmp = 2b
            // tmp = b - 2x/a/a
            double tmp = 2*b - 2*x/a/a;
            double tmp3 = Math.sqrt(a*a+tmp*tmp);
            double tmp2 = 90-Math.toDegrees(Math.acos(tmp/tmp3));
            System.out.println(tmp2);
        } else {
            // x = tmp*a*b/2;
            // x/b*2
            double tmp = x/a/b*2;
            double tmp3 = Math.sqrt(b*b+tmp*tmp);
            double tmp2 = Math.toDegrees(Math.acos(tmp/tmp3));
            System.out.println(tmp2);
        }
    }
}
