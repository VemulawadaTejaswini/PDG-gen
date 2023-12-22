/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().trim();
		//System.out.println(s);
		
		if((s.charAt(2)==s.charAt(3)) && (s.charAt(4)==s.charAt(5)))
		    System.out.println("Yes");
		else
		    System.out.println("No");
	}
}
