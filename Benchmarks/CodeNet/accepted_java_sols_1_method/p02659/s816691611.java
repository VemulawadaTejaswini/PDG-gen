import java.util.*;
import java.math.*;
public class Main{

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        double b = sc.nextDouble();
        BigDecimal c = new BigDecimal(a);
        BigDecimal d = BigDecimal.valueOf(b);
        System.out.println(c.multiply(d).toBigInteger());
    }
}