import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n+1];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
		}
		a[n] = 0;

		int m = 1000;	// money
		int s = 0;	// stock
		for ( int i=0; i<n; i++ ) {
			// sell
			m += s*a[i];
			s = 0;
			if ( a[i]<a[i+1] ) {
				// buy
				s += m/a[i];
				m = m%a[i];
			}
		}
		System.out.println(m);
	}
}