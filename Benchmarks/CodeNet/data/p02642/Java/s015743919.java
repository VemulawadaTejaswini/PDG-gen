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

		int t = 0;
		for ( int i=0; i<n-1; i++ ) {
			if ( a[i].equals(a[i+1]) ) continue;
			boolean f = true;
			for ( int j=n-1; j>=i+1; j-- ) {
				if ( a[i]%a[j]==0 ) {
					f = false;
					break;
				}
				if ( a[i]/a[j]<=1 ) {
					break;
				}
			}
			if ( f ) t++;
		}
		if ( a[n-2]>a[n-1] ) t++;

		System.out.println(t);
	}
}