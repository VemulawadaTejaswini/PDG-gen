import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] xs = new int[n];
		int[] ys = new int[m];
		String msg = "No War";

		for (int i = 0; i < n; i++) {
			xs[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			ys[i] = sc.nextInt();
		}

		Arrays.sort(xs);
		Arrays.sort(ys);

		if (Math.max(x, xs[n - 1]) >= Math.min(y, ys[0])) {
			msg = "War";
		}
		System.out.println(msg);

	}
}