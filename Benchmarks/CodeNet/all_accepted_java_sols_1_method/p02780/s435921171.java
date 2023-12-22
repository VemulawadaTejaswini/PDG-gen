import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];

		for ( int i=0; i<n; i++ ) {
			p[i] = sc.nextInt() + 1 ;
		}

		int si = 0 ;
		for ( int i=0; i<k; i++ ) {
			si = si + p[i] ;
		}
		int u = si ;

		for ( int i=0; i<n-k; i++ ) {
			int t = u - p[i] + p[i+k] ;
			si = Math.max(si,t) ;
			u = t;
		}
		float s = (float)si/2f ;
		System.out.println(s);
	}
}