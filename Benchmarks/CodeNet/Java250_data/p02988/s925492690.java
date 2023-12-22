import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] p = new int[n];
		int cnt = 0;
		for ( int i = 0; i < n; i++ ) {
			p[i] = in.nextInt();
		}

		for ( int i = 0; i < n; i++ ) {

			if ( 1 <= i && i <= n - 2 ) {
				if ( p[i - 1] < p[i] && p[i] < p[i + 1] ) {
					cnt++;
				} else if ( p[i - 1] > p[i] && p[i] > p[i + 1] ) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}