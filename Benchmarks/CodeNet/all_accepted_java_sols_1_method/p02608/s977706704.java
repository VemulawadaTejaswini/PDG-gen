import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[10001];
		int g = 0;
		for ( int x=1; x<=100; x++ ) {
			int x2 = x*x;
			for ( int y=1; y<=100; y++ ) {
				int y2 = y*y;
				int xy = x*y;
				for ( int z=1; z<=100; z++ ) {
					int f = x2 + y2 + z*z + xy + z*x + y*z;
					if ( f<=10000 ) a[f]++;
				}
			}
		}

		for ( int i=1; i<=n; i++ ) System.out.println(a[i]);
	}
}
