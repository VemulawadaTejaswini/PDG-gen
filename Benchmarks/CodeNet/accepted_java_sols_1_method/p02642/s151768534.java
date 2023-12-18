import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		boolean[] b = new boolean[a[n-1]+1];
		Arrays.fill(b, true);

		for ( int i=0; i<n; i++ ) {
			if ( b[a[i]] ) {
				int f = a[i]*2;
				while ( f<=a[n-1] ) {
					b[f] = false;
					f += a[i];
				}
			}
		}

		int t = 0;
		for ( int i=0; i<n; i++ ) {
			if ( (i>0 && a[i]==a[i-1]) || (i<n-1 && a[i]==a[i+1]) ) continue;
			if ( b[a[i]] ) t++;
		}

		System.out.println(t);
	}
}