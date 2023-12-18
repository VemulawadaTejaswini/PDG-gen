import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n--!=0)
		{
			BigInteger a = in.nextBigInteger();
			BigInteger b = in.nextBigInteger();
			BigInteger ans = a.add(b);
			int counter=0;
			a=ans;
			while(a.compareTo(BigInteger.ZERO)!=0)
			{
				a=a.divide(new BigInteger("10"));
				counter++;
			}
			if(counter>80)System.out.println("overflow");
			else System.out.println(ans);  
		}
	}
}