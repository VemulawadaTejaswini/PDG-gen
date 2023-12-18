
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		BigInteger bg=new BigInteger(""+1);
		BigInteger maximum=new BigInteger(""+10).pow(18);
		for(int i=0;i<t;i++){
		    BigInteger b=sc.nextBigInteger();
		    bg=bg.multiply(b);
		}
		if(bg.compareTo(maximum)==0 || bg.compareTo(maximum)==-1)
		    System.out.print(bg);
		else
		    System.out.print(-1);
		
	}
}
