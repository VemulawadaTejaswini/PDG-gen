import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int an = sc.nextInt();
		int bn = sc.nextInt();
		int mn = sc.nextInt();

		int[] a = new int[an];
		int[] b = new int[bn];

		int amin = 9999999;
		int bmin = 9999999;
		for ( int i=0; i<an; i++ ) {
			a[i] = sc.nextInt();
			amin = Math.min(amin, a[i]);
		}
		for ( int i=0; i<bn; i++ ) {
			b[i] = sc.nextInt();
			bmin = Math.min(bmin, b[i]);
		}

		int tmin = amin + bmin;

		for ( int i=0; i<mn; i++ ) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int c = sc.nextInt();
			tmin = Math.min(tmin, a[x]+b[y]-c) ;
		}

		System.out.println(tmin);
	}
}