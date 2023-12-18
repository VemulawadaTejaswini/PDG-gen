import java.util.*;
 
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long x = sc.nextLong();
	long k = sc.nextLong();
	long d = sc.nextLong();
	long X = Math.abs(x);
	if (X/d >= k) {
	    System.out.print(X - k*d);
	} else {
	    long near = X/d;
	    if ((k-near)%2==0) {
		System.out.print(Math.abs(X-near*d)); 
	    } else {
	        System.out.print(Math.abs(X-(near-1)*d));
	    }
	}
    }
}
