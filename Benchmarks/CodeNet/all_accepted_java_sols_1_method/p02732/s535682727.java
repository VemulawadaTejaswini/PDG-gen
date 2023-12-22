import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] k = new int[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt() - 1;
			k[a[i]]++;
		}

		long c = 0;
		for ( int i=0; i<n; i++ ) {
			c = c + (long)k[i]*((long)k[i]-1l)/2l;
		}
		for ( int i=0; i<n; i++ ) {
			long c0 = (long)k[a[i]]*((long)k[a[i]]-1l)/2l;
			long c1 = 0;
			if ( k[a[i]]!=0) {
				c1 = ((long)k[a[i]]-1l)*((long)k[a[i]]-2l)/2l;
			}

			System.out.println(c-c0+c1);
		}

	}
}