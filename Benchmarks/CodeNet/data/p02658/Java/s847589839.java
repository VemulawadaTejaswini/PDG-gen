

import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        BigInteger min=BigInteger.valueOf(1L);
        final BigInteger max=BigInteger.valueOf(1000000000000000000L);
        for(int i=0;i<n;i++)
        {  a[i]=sc.nextLong();
        if(a[i]==0)
        {
            System.out.println("0");
            return;

        }
           min=min.multiply(BigInteger.valueOf(a[i]));

        if(min.compareTo(max)>0)
             { System.out.println("-1");
                return;}
        }


            System.out.println(min.toString());



    }
}