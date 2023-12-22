/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    long n = sc.nextLong();
	    int level = 0;
	    while(n > 0){
	    	++level;
	    	n/=2;
	    }
	    long ans = (1L<<level)-1;
		 System.out.print(ans);
		
	}
}