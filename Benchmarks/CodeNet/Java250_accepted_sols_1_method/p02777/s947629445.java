/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int a_n = scan.nextInt();
		int b_n = scan.nextInt();
		String u = scan.next();
		if(a.equals(u)){
			a_n-=1;
		}else {
			b_n-=1;
		}
		System.out.println(a_n +" "+b_n);
		// your code goes here
	}
}