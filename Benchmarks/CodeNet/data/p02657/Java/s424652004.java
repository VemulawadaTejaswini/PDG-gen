import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        BigInteger  ans=new BigInteger("1");
        for(int i=0;i<n;i++)
        {  a[i]=sc.nextInt();
            ans =ans.multiply(BigInteger.valueOf(a[i]));}

        if(ans.subtract(BigInteger.valueOf((long)Math.pow(10,18))).longValue()>0)
            System.out.println("-1");
        else
            System.out.println(ans);



    }
}