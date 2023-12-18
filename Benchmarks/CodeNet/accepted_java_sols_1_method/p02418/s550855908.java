/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		
		String ring = s + s;
		
		if (ring.contains(p)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");			
		}
	}
}