import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int m = scan.nextInt();
        double c;

        double x = 30.0 * h + 30.0 * m / 60.0;
        double y = 6.0 * m;
        double z = Math.abs(x - y);

        BigDecimal r = BigDecimal.valueOf(2.0 * a * b * Math.cos(Math.toRadians(z)));
        BigDecimal a2 = BigDecimal.valueOf(a * a);
        BigDecimal b2 = BigDecimal.valueOf(b * b);
        BigDecimal c2 = a2.add(b2).subtract(r);
        MathContext mc = new MathContext(10);
        BigDecimal c1 = c2.sqrt(mc);

        System.out.println(c1.doubleValue());






    }


}