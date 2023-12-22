/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		BigInteger b = new BigInteger(s);
		int shift = b.toString(2).length();
		BigInteger ans = new BigInteger("1");
		ans = ans.shiftLeft(shift);
		ans = ans.subtract(new BigInteger("1"));
		System.out.println(ans);
		// your code goes here
	}
}