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
		int n = scan.nextInt();
		int k = scan.nextInt();
		String s = scan.next();
		char[] a = s.toCharArray();
		if(a[k-1]>='A'&&a[k-1]<='Z'){
			a[k-1] = (char)(a[k-1]-'A'+'a');
		}
		System.out.println(a);
	}
}