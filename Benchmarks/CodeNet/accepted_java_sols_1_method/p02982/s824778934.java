import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n, d;
		n = s.nextInt();
		d = s.nextInt();
		int x[][] = new int[n][d];
		for (int j = 0; j < n; j++)
			for (int i = 0; i < d; i++)
				x[j][i] = s.nextInt();
		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum2 = 0;
				for (int k = 0; k < d; k++) {
					int c;
					c = Math.abs(x[i][k] - x[j][k]);
					c *= c;
					sum2 += c;
				}
				int ans = (int) Math.sqrt(sum2);
				double ans2 = Math.sqrt(sum2);
				if (ans == ans2)cnt2++;
			}
		}
		System.out.println(cnt2);
    }
}