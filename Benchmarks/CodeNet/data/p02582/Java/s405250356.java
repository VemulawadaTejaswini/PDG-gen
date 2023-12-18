import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;


public class Main {
	
	

	public static void main(String[] args) {
		//Scanner myObj = new Scanner(System.in);
		Scanner ret = new Scanner(System.in);
		
		int a,b,t;
		String s;
	
		s=ret.nextLine();
		 if((s.charAt(0)=='R')&&(s.charAt(1)=='R')&&(s.charAt(2)=='R'))
			System.out.println("3");
		 else if((s.charAt(0)=='R')&&(s.charAt(1)=='R')||(s.charAt(1)=='R')&&(s.charAt(2)=='R'))
		    System.out.println("2");
		
		else if((s.charAt(0)=='S')&&(s.charAt(1)=='S')&&(s.charAt(2)=='S'))
			System.out.println("0");
		else
			System.out.println("1");
			
		
		
	}

}