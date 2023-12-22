import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] v = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		for (int i = 0; i < (1 << n); i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					sum += v[j] - c[j];
				}
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
		sc.close();
	}
}