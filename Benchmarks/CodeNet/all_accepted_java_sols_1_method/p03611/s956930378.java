import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] a = new int[100001][2];
		for (int i = 0; i < N; i++) {
			int d = in.nextInt();
			a[d][0] = d;
			a[d][1]++;
		}
		int ans = 1;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				if (i + 1 < a.length) {
					ans = Math.max(ans, a[i][1] + a[i + 1][1]);
				}
			} else if (i == a.length - 1) {
				ans = Math.max(ans, a[i][1] + a[i - 1][1]);
			} else {
				ans = Math.max(ans, a[i][1] + a[i + 1][1] + a[i - 1][1]);
			}
		}
		System.out.println(ans);
		in.close();
	}
}