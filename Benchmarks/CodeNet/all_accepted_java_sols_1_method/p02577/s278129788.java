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
		Scanner scanner = new Scanner(System.in);
	    String n = scanner.next();
	    
	    int sum = 0;
	    int i = n.length() - 1;
	    while(i >=0){
	    	int num = n.charAt(i) - '0';
	    	sum = (sum + num) % 9;
	    	i--;
	    }
	    
	    if(sum == 0)
	      System.out.println("Yes");
		
		else
			System.out.println("No");
	}
}