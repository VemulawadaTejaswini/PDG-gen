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
			boolean f = true;
			for ( int j=i+1; j<n; j++ ) {
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