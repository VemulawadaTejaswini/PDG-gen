import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, q, m;
		int[] a;
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		a = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		q = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < q; i++) {
			m = Integer.parseInt(st.nextToken());
			System.out.println(solve(a, 0, m) ? "yes" : "no");
		}
	}

	static boolean solve(int[] a, int p, int t) {
		boolean result = false;
		if (p == a.length) {
			result = false;
		} else {
			if (a[p] == t) {
				result = true;
			} else if (solve(a, p + 1, t - a[p])) {
				result = true;
			} else if (solve(a, p + 1, t)) {
				result = true;
			}
		}
		return result;
	}
	// 1 5 7 10 21
}