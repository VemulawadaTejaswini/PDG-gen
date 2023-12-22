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
		int n = a.length();
		String ans = "";
		for(int i=0;i<n;i++){
			ans += "x";
		}
		System.out.println(ans);
		// your code goes here
	}
}