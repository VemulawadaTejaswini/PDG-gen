import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[n];
		for ( int i = 0; i < n; i++ ) {
			d[i] = in.nextInt();
		}

		int ans = 0;
		for ( int p = 0; p < n; p++ ) {
			for ( int c = p + 1; c < n; c++ ) {
				ans += d[p] * d[c];
			}
		}
		System.out.println(ans);
		in.close();
	}
}