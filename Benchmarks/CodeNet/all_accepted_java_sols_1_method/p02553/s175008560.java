/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		long m1 = a * c;
		long m2 = a * d;
		m1 = Math.max(m1, m2);
	    m2 = b * c;
		long m3 = b * d;
		m2 = Math.max(m2, m3);
		System.out.println(Math.max(m2, m1));
	}
}
