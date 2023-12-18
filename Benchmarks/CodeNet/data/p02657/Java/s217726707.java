//package codef;

import java.util.Scanner;

public class Main {
 
 
 
	public static void main(String[] args) {
 
 
		Scanner myObj = new Scanner(System.in);
 
		long bound = (long)Math.pow(10.0, 18.0);
		
		long total = 1;
		
		long n = myObj.nextLong();
		
		while(n != 0)
		{
			
			total *= myObj.nextLong();
			n--;
		}
		
		if(total > bound)
		{
			total = -1;
		}
		myObj.close();
		
		System.out.println(total);
	}
 
}