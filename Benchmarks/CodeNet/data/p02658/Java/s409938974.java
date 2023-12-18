import java.math.*;
import java.util.*;
public class Main
{
        public static void main(String[] args)
        {
            Scanner cin = new Scanner(System.in);
            int tt;
            tt = cin.nextInt();
            BigInteger t = new BigInteger("1000000000000000000");
            BigInteger ans = BigInteger.valueOf(1);
            for(int i = 1;i <= tt;i ++)
            {
                int f;
                BigInteger m = cin.nextBigInteger();
                int s = m.compareTo(BigInteger.valueOf(0));
                if (s == 0)
                {
                    ans = BigInteger.valueOf(0);
                }
                f = ans.compareTo(t);
                if(s != 0 && f <= 0)
                ans = ans.multiply(m);
            }
            int kk = ans.compareTo(t);
            if(kk <= 0)
                System.out.println(ans);
            else System.out.println("-1\n");
        }
}