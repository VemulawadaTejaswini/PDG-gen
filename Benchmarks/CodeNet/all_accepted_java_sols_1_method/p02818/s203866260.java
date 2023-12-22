import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    long k = sc.nextLong();
	    if (k <= (a + b)) {
		    if (a < k) {
		    	k = k - a;
		    	a = 0;
		    } else {
		    	a = a - k;
		    	k = 0;
		    }
		    b = b - k;
			System.out.print(a + " " + b);
	    } else {
	    	System.out.print(0 + " " + 0);
	    } 
	}

}
