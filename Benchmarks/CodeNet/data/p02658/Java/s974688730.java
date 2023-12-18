//package acm.biginter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n;
        n = cin.nextInt();
        BigInteger x,ans;
        ans = new BigInteger("1");
        int flag = 0;
        for(int i = 1;i <= n;i ++)
        {
            x = cin.nextBigInteger();
            if(x.compareTo(BigInteger.valueOf(0)) == 0)
            {
                ans = BigInteger.valueOf(0);
                flag = 1;
            }
            if(flag == 0) ans = ans.multiply(x);
            if(ans.compareTo(new BigInteger("1000000000000000000")) > 0) flag = 1;
        }
        if(ans.compareTo(new BigInteger("1000000000000000000")) > 0)
        {
            System.out.println("-1");
        }
        else System.out.println(ans);
    }
}
