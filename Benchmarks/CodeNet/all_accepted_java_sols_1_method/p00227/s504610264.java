import java.util.*;

public class Main {
	public static void main ( String[] args ) {
		int n , m;
		Scanner sc = new Scanner(System.in);
		while ( true ) {
			int cost = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			if ( n == 0 && m == 0 ) break;
			int[] deta = new int[1000];
			for ( int i = 0; i < n; i++ )
				deta[i] = sc.nextInt();
			Arrays.sort(deta,0,n);
			int index = n - 1 , count = 1;
			for ( int i = index; i >= 0; i-- ) {
				for ( ; i > i - m; i-- ) {
					if ( i < 0 ) break;
					if ( count % m != 0 )
						cost += deta[i];
					count++;
				}
			}
			System.out.println(cost);
		}
	}
}