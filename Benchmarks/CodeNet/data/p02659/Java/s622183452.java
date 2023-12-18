import java.math.BigDecimal;
import java.util.*;

public class Main 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigDecimal a = new BigDecimal(s1);
        BigDecimal b = new BigDecimal(s2);
        b = b.multiply(a);
        System.out.println(b.longValue());
    } 
}