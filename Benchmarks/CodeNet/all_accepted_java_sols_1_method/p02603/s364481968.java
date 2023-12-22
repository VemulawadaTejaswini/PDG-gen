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

		long m = 1000L;	// money
		long s = 0L;	// stock
		for ( int i=0; i<n; i++ ) {
			// sell
			m += s*(long)a[i];
			s = 0L;
			if ( a[i]<a[i+1] ) {
				// buy
				s += m/(long)a[i];
				m = m%(long)a[i];
			}
		}
		System.out.println(m);
	}
}