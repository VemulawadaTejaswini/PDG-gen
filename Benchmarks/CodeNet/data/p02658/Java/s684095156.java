import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    BigInteger result = new BigInteger("1");
	    BigInteger b = new BigInteger("1000000000000000000");
	    for(int i=0;i<n;i++)
	    {
	        long x = sc.nextLong(); 
	        result = result.multiply(BigInteger.valueOf(x));
	    }
	    int i = result.compareTo(b);
	    if(i==1)
	        System.out.println("-1");
	    else
	        System.out.println(result);
	}
}
