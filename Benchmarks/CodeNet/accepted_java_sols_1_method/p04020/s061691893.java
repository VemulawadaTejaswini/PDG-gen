import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		long ans = a[0] / 2;
		a[0] %= 2;
		for (int i = 1; i < n; i++) {
			int b = a[i - 1] + a[i];
			ans += b / 2;
			a[i] = Math.min(b % 2, a[i]);
		}
		System.out.println(ans);
	}
}
