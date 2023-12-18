/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if(solve(n) == true) {
		    System.out.println("Yes");
		} else{
		    System.out.println("No");
		}
	}
	
	public static boolean solve(long n) {
	    if(n==0) {
	        return true;
	    }
	    
	    if(sumDigits(n) % 9 != 0) {
	        return false;
	    }
	    
	    return true;
	}
	
	public static long sumDigits(long n) {
	    if(n<10) {
	        return n;
	    }
	    
	    return sumDigits(n/10) + n%10;
	}
}