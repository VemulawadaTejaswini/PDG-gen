

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
		long x = sc.nextLong();
		
		long sum_500 = x/500;
		long sum_5 = (x%500)/5;	
		
		System.out.println(sum_500*1000+sum_5*5);
	}
}
