/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = 100000;
		int nums,numc;
		Scanner s = new Scanner(System.in);
		int weeks = s.nextInt();
		for(int i = 0;i < weeks;i++){
			num *= 1.05; 
			nums = num % 1000;
			numc = num / 1000;
			
			if(nums > 0){
				num = numc * 1000 + 1000;
			}
		}

		System.out.println(num);
		
	}
}