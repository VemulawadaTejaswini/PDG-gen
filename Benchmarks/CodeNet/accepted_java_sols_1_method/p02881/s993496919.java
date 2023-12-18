

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
	        long N = in.nextLong();
	     
	        long x = 0;
	        long y = 0;
	        
	        long t = (long) Math.sqrt(N);
	        for(long i=t;i>=1;i--){
	        		if( N % i ==  0) {
	        			x = i;
	        			y=N/i;
	        			break;
	        		}
	        }
//	        System.out.println(x);
//	        System.out.println(y);
	        System.out.println(x+y-2);
	}

}
