

import java.util.Scanner;

public class Main {
	static int gcd(int x, int y) {
		 	int r;
		 	if(x>=y) {
		 		while (y > 0) {
		            r = x % y;
		            x = y;
		            y = r;
	        	}
		 		return x;
	        }else {
	        	 while (x > 0) {
	 	            r = y % x;
	 	            y = x;
	 	            x = r;
	 	        	}
	        	}

		 		return y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));

	}

}

