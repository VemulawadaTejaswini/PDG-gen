import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long d = sc.nextLong();

		long d2 = d*d;

		long g = 0;
		for ( int i=0; i<n; i++ ) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			long x2 = x*x;
			long y2 = y*y;
			if ( d2 >= x2+y2 ) g++;
		}
		System.out.println(g);
	}
}