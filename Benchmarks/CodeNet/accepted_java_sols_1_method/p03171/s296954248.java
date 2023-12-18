import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long dp[] = new long[n * n];
		for ( int i = 0; i < n; i++ ) {
			dp[ i*n + i] = in.nextInt();
		}
		in.close();

		for ( int col = 1; col < n; col++ ) {
			int r = 0, c = col;
			while ( c < n ) {
				dp[ r*n + c] = Math.max(dp[ r*n + r] - dp[ (r + 1)*n + c], dp[ c*n + c] - dp[ r*n + c - 1]);
				r++;
				c++;
			}
		}
		System.out.println(dp[n - 1]);
	}
}