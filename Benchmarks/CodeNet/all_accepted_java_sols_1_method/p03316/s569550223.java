/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int temp = n;
		
		while(temp>0){
			sum+=temp%10;
			temp/=10;
		}
		
		if(n%sum == 0)
			System.out.println("Yes");
		else	
			System.out.println("No");
	}
}