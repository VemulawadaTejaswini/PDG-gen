/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rem = n%10;
		if(rem == 2 || rem == 4 || rem == 7 || rem == 9 || rem ==5){
			System.out.println("hon");
		}
		else if(rem == 0 || rem == 1 || rem == 6 || rem == 8){
			System.out.println("pon");
		}
		else{
			System.out.println("bon");
		}
	}
}