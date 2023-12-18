import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        BigInteger mod = new BigInteger("1000000000000000000");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        BigInteger f = new BigInteger("1");
        for(int i = 0; i < n; i++)
        {
            String s = sc.next();
            BigInteger now = new BigInteger(s);
            f = f.multiply(now);
        }
        if(f.compareTo(mod) == 1)
                flag = true;
        if(flag)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(f.longValue());
        }
    } 
}