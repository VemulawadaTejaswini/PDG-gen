import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		int[] a = new int[n];
		Integer[] b = new Integer[n];
		Integer[] c = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
	
		int p=0;
		int e=n-1;
		for (int i = 0; i < n; i++) {
			c[i] = b[e];
			if( c[i] == a[i] ) {
				while( c[i] == a[i] && p<e) {
					c[i] = b[p++];
				}
			}else {
				e--;
			}
		}

		for (int i = 0; i < n; i++) {
			if( a[i] == c[i]) {
				System.out.println( "No");
				return ;
			}
		}
		System.out.println( "Yes");
		for (int i = 0; i < n; i++) {
			System.out.println( c[i]);
		}

	}
}