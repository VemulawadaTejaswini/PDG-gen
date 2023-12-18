import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{try {
	    
	
	    Scanner k=new Scanner(System.in);
		int n=k.nextInt();
		BigInteger f=new BigInteger("1");	BigInteger ff=new BigInteger("1000000000000000000");
		for(int i=0;i<n;i++)
		{
		    long p=k.nextLong();
		    BigInteger ii=BigInteger.valueOf(p);
		    f=f.multiply(BigInteger.valueOf(p));
		}
		if(f.compareTo(ff)==1)
		System.out.print("-1");
		else
			System.out.print(f);}
			catch(Exception e) {
	return;}
		
	}
}
