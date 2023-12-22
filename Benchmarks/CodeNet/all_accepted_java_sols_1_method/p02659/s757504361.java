import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.*;
 
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        BigDecimal base = new BigDecimal("1");
//        long m = (long) Math.pow(10,18);
//        BigDecimal mm = new BigDecimal(m);
//
//        for (int i = 0;i<n;++i)
//        {
//            BigDecimal a = sc.nextBigDecimal();
//            //System.out.println(base+" * "+a);
//            base = a.multiply(a);
//            if (base.compareTo(mm) > 0)
//            {
//                base = new BigDecimal(-1);
//                break;
//            }
//        }
//
//        System.out.println(base);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        BigDecimal ans = a.multiply(b);
        System.out.println(ans.setScale(0,BigDecimal.ROUND_DOWN));
 
        sc.close();
    }
}