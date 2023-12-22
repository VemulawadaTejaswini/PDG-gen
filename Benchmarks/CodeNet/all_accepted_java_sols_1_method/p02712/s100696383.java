/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   long sum = 0;
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		
		for(long i=1;i<=n;i++){
		    if(i%3==0 && i%5==0){
		      // System.out.println("FizzBuzz");
		    }else if(i%3==0){
		       //System.out.println("Fizz");
		    }else if(i%5==0){
		        //System.out.println("Buzz");
		    }
		    else{
		        //System.out.println(i);
		        sum+=i;
		    }
		    
		}
		System.out.println(sum);
	}
}
