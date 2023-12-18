import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long x = (long)Math.abs(sc.nextLong());
		long k = sc.nextLong();
		long d = sc.nextLong();

		if ( x<=d ) {
			if ( k%2==0 ) System.out.println(x);
			else          System.out.println(d-x);
			System.exit(0);
		}

		long t = x/d ;
		if ( t>=k ) {
			System.out.println(x - d*k);
			System.exit(0);
		}

		long xt = x - d*t ;
		if ( (k-t)%2==0 ) System.out.println(xt);
		else              System.out.println(d-xt);
	}
}