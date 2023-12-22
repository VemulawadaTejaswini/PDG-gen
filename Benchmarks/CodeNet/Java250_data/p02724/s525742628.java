/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long x;
	x=Long.parseLong(br.readLine());
	long sum =( (x/500)*1000)+((x%500)/5)*5;
	System.out.print(sum);}catch (Exception e){}
	
		
	}
}