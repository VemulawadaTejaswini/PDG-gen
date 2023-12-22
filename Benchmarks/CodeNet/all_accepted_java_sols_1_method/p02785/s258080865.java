import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		if ( k >= n ) {
			System.out.println(0);
			System.exit(0);
		}

		int[] h = new int[n];
		for ( int i=0; i<n; i++ ) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);

		long t = 0;
		// 出力
		for ( int i=0; i<n-k; i++ ) {
			t = t + (long)h[i];
		}
		System.out.println(t);

	}
}