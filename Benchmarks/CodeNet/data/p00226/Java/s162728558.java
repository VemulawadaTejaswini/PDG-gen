import java.util.*;

public class Main {
	public String HitBlow( int ans , int in ) {
		int hit = 0 , blow = 0;
		int[] a = new int[4] , b = new int[4];
		for ( int i = 0; i < 4; i++ ) {
			a[i] = ans % 10;
			ans /= 10;
			b[i] = in % 10;
			in /= 10;
		}
		for ( int i = 0; i < 4; i++ ) {
			if ( a[i] == b[i] ) hit++;
			else {
				for ( int j = 0; j < 4; j++ )
					if ( b[i] == a[j] ) blow++;
			}
		}
		return hit+" "+blow;
	}
	
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while ( true ) {
			int ans = sc.nextInt();
			int in = sc.nextInt();
			if ( ans == 0 && in == 0 ) break;
			System.out.println(m.HitBlow(ans, in));
		}
	}
}