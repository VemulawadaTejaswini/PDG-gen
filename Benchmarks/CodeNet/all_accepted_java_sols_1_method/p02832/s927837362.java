import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int b = 0;
		int c = 1;
		//
		for ( int j = 0; j < n ; j++ ) {
			if ( a[j] == c ) {
				c++ ;
			} else {
				b++ ;
			}
		}
		if ( b == n ) {
			b = -1;
		}
		System.out.println(b);
	}
}