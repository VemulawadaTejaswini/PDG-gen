/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.RoundingMode;
import java.math.BigDecimal;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		BigDecimal a=sc.nextBigDecimal();
		BigDecimal b=sc.nextBigDecimal();
		BigDecimal c=a.multiply(b);
		c=c.setScale(0, RoundingMode.HALF_UP);
		System.out.print(c);
	}
}
