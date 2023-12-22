import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for ( int i=0; i<n; i++ ) {
			h[i] = sc.nextInt();
		}
		int[] f = new int[n];
		for ( int i=0; i<n; i++ ) {
			f[i] = 1;
		}

		for ( int i=0; i<m; i++ ) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if ( h[a] > h[b] ) {
				f[b] = 0;
			} else if ( h[a] < h[b] ) {
				f[a] = 0;
			} else {
				f[a] = 0;
				f[b] = 0;
			}
		}

		int g = 0;
		for ( int i=0; i<n; i++ ) {
			g += f[i];
		}


		System.out.println(g);
	}
}
