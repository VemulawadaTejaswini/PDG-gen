/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double ans = 0;
		if(n == 1){
		    ans = 1;
		    System.out.println(ans);
		}
		else if(n%2 == 0){
		    ans = 0.5;
		    System.out.println(ans);
		}
		else{
		    ans =  (double)((n-1)/2 +1)/(double)n;
		    System.out.println(ans);
		}
	}

}