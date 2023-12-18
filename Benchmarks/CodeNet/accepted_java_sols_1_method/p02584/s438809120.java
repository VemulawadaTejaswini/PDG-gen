import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long x = sc.nextLong();
	    long k = sc.nextLong();
	    long d = sc.nextLong();
	    if (x == d) {
	    	if (k % 2 == 0)  System.out.println(x);
	    	if (k % 2 == 1)  System.out.println(0);
	    } else {
	    	long wk = (long)Math.floor(Math.abs(x) / d);
	    	if (wk >= k) {
		    	if (x < 0) System.out.println(Math.abs(x + k*d));
		    	if (x >= 0) System.out.println(Math.abs(x - k*d));
	    	} else {
	    		if ((k - wk) % 2 == 0) {
	    			if (x < 0) System.out.println(Math.abs(x + wk*d));
			    	if (x >= 0) System.out.println(Math.abs(x - wk*d));
	    		} else {
	    			if (x < 0) System.out.println(Math.abs(x + (wk + 1)* d));
			    	if (x >= 0) System.out.println(Math.abs(x - (wk + 1)* d));
	    		}
	    	}
	    }
	}
}
