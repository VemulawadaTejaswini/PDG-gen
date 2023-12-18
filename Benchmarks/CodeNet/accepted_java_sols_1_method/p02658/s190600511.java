import java.math.*;
import java.util.*;
public class Main
{
        public static void main(String[] args)
        {
            Scanner cin = new Scanner(System.in);
            int a;
            a = cin.nextInt();
            BigInteger t = new BigInteger("1000000000000000000");
            BigInteger ans = BigInteger.valueOf(1);
            for(int i=1;i<=a;i++)
            {
                int f;
                BigInteger n = cin.nextBigInteger();
                int vis = n.compareTo(BigInteger.valueOf(0));
                if (vis == 0)
                {
                    ans = BigInteger.valueOf(0);
                }
                f = ans.compareTo(t);
                if(vis != 0 && f <= 0)
                ans = ans.multiply(n);
            }
            int k = ans.compareTo(t);
            if(k <= 0)
                System.out.println(ans);
            else System.out.println("-1\n");
        }
}