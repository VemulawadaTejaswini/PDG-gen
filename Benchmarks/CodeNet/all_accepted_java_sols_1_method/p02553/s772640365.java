/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		long d = scanner.nextLong();
		
		long max = Long.MIN_VALUE;
		
		if(a*c > max)
			max = a*c;
			
		if(a*d > max)
			max = a*d;
			
		if(b*c > max)
			max = b*c;
		
		if(b*d > max)
			max = b*d;
			
		System.out.println(max);

	}
}