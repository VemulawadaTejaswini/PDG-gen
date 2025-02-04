import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int[] a = new int[n];

		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for ( int i=1; i<n; i++ ) {
			if ( a[i] == a[i-1] ) {
				System.out.println("NO");
				System.exit(0);
			}
		}

		System.out.println("YES");
	}
}