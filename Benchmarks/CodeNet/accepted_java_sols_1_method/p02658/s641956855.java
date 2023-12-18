/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long []a = new long[n];
		long ans = 1;
		int i,k=0;
		for(i=0; i<n; i++)
		{
		    a[i] = sc.nextLong();
		    if(a[i] == 0)
		        k = 1;
		}
		if(k == 1)
		{
		    System.out.println(0);
		}
		else
		{
		    
		BigInteger b = new BigInteger("10");
		int ex = 18;
		b = b.pow(ex);
		int p = 0;
		BigInteger f = new BigInteger("1");
		for(i=0; i<n; i++)
		{
		    long x = a[i];
		    f = f.multiply(BigInteger.valueOf(x));
		    int com = f.compareTo(b);
		    if(com == 1)
		    {
		        p = 1;
		        break;
		    }
		    
		}
	    if(p == 1)
	        System.out.println("-1");
	    else
	        System.out.println(f);
		}
	}
}
