import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long t = 1l;
		double d = 0d;
		for ( int i=0; i<n; i++ ) {
			long a = sc.nextLong();

			if ( a==0 ) {
				System.out.println(0);
				System.exit(0);
			}

			d += Math.log10((double)a);
			t *= a;

		}

		if ( d>18 ) {
			System.out.println(-1);
		} else if ( t>1000000000000000000l ) {
			System.out.println(-1);
		} else {
			System.out.println(t);
		}
	}
}