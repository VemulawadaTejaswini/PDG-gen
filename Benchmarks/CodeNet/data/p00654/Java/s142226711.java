import java.io.*;
import java.math.*;
import java.lang.*;
import java.util.*;
import static java.math.BigInteger.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
public class Main
{
    void run()
    {
    	Scanner cin=new Scanner(System.in);
    	int i,j,k;
    	while (cin.hasNext())
    	{
    		int n=cin.nextInt();
    		if (n==0)break;
    		int t=n*(n+1)/2;
    		long []a=new long[t];
    		for (i=0;i<t;i++)a[i]=cin.nextLong();
    		BigInteger x=valueOf(a[0]);
    		BigInteger y=valueOf(a[1]);
    		BigInteger z=valueOf(a[n]);
    		long c=x.multiply(y).divide(z).longValue();
    		long f=(long)(sqrt(c*1.0)+0.5);
    		System.out.println(f);
    		for (i=0;i<n;i++)
    		{
    			if (i==n-1)System.out.print(a[i]/f);
    			else System.out.print(a[i]/f+" ");
    		}
    		System.out.println();   		
    	}
    }
    public static void main(String args[])
    {
    	new Main().run();
    }
}