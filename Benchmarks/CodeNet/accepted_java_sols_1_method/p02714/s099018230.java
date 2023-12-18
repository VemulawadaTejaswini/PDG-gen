import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		char[] c = new char[n];
		long r = 0;
		long g = 0;
		long b = 0;

		for ( int i=0; i<n; i++ ) {
			if ( s.charAt(i)=='R' ) {
				r++;
			} else if ( s.charAt(i)=='G' ) {
				g++;
			} else {
				b++;
			}
		}

		if ( r*g*b==0 ) {
			System.out.println(0);
			System.exit(0);
		}

		long f = 0;
		for ( int i=0; i<n-2; i++ ) {
			for ( int j=i+1; j<n; j++ ) {
				int k = 2*j-i;
				if ( k < n ) {
					if ( s.charAt(i)!=s.charAt(j) && s.charAt(j)!=s.charAt(k) && s.charAt(k)!=s.charAt(i) ) {
						f++;
					}
				}
			}
		}

		System.out.println(r*g*b-f);
	}

}
