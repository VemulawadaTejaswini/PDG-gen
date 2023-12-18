import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long x = sc.nextLong();
	    long k = sc.nextLong();
	    long d = sc.nextLong();
	    List wk = new ArrayList();
	    if (x == d) {
	    	if (k % 2 == 0)  System.out.println(x);
	    	if (k % 2 == 1)  System.out.println(0);
	    } else if (Math.abs(k * d) < Math.abs(x)) {
	    	if (x < 0) System.out.println(Math.abs(x + k*d));
	    	if (x >= 0) System.out.println(Math.abs(x - k*d));
	    } else {
	    	boolean flag = false;
		    for (long i = 0; i < k; i++) {
		    	if (Math.abs(x - d) > Math.abs(x + d)) {
		    		x = x + d;
		    	} else {
		    		x = x - d;
		    	}
		    	if (flag) {
		    		break;
		    	}
		    	// 同じ場所の往復
		    	if (wk.contains(x)) {
		    		if ((k - i - 1) % 2 == 0) {
		    			break;
		    		} else {
		    			flag = true;
		    		}
		    	}
		    	wk.add(x);
		    }
		    System.out.println(Math.abs(x));
	    }
	}
}
