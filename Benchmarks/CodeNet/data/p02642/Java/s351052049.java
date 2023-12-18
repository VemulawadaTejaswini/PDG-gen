import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Comparator.reverseOrder());

		int[] b = new int[n];
		int ii = 0;
		int k = 1;
		for ( int i=0; i<n; i++ ) {
			while ( b[i]==0 && k<n ) {
				if ( a[i]/a[k]==1 ) {
					k++;
				} else {
					b[i] = k;
				}
			}
			if ( k>=n ) b[i] = k;
		}

		int t = 0;
		for ( int i=0; i<n-1; i++ ) {
			if ( b[i]>=n ) continue;
			boolean f = true;
			for ( int j=b[i]; j<n; j++ ) {
				if ( a[i]%a[j]==0 ) {
					f = false;
					break;
				}
			}
			if ( f ) t++;
		}
		if ( a[n-2]>a[n-1] ) t++;

		System.out.println(t);
	}
}