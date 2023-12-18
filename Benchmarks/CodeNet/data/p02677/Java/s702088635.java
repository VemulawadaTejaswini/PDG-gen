import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

//        int mm = -1;
//        if (m%5 == 0)
//        {
//            mm = m/5;
//        }

        double ans = 0.0D;
        if (h==0 && m==0)//短針と長針が重なっているときは (大)a-(小)b 長針or短針の値を合わせる
        {
            ans = Math.max(a,b) - Math.min(a,b);
            System.out.println(ans);
        }
        else
        {
            double kakudo1 = 30.0 * h + 0.5 * m;
            double kakudo2 = 6.0 * m;
            if (kakudo1 == 0) kakudo1 = 360.0;
            if (kakudo2 == 0) kakudo2 = 360.0;
            double kakudo3 = Math.max(kakudo1,kakudo2) - Math.min(kakudo1,kakudo2);
            double aa = Math.sqrt((Math.pow(a,2.0)) + (Math.pow(b,2.0)) - (2 * a * b * Math.cos(Math.toRadians(kakudo3))));
            System.out.println(BigDecimal.valueOf(aa));
        }
        sc.close();
    }
}