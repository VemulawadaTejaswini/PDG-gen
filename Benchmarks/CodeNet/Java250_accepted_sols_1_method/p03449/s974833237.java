import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}
		scan.close();
		int[] SA = new int[n+1];
		int[] SB = new int[n+1];
		SA[0] = 0;
		SB[0] = 0;

		for (int i = 1; i <= n; i++) {
			SA[i] = SA[i-1] + a[i-1];
			SB[i] = SB[i-1] + b[i-1];
		}
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			int c = (SA[i]-SA[0])+(SB[n]-SB[i-1]);
			ans = Math.max(ans, c);
		}

		System.out.println(ans);
	}
}
