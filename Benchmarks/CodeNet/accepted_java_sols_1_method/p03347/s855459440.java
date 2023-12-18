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

		int x = -1;
		long ans = -1;
		for (int i = 0; i < n; i++) {
			x++;
			if (a[i] > x) {
				System.out.println(-1);
				return;
			}
			if (a[i] == x) {
				ans++;
			} else {
				ans += a[i];
			}
			x = a[i];
		}
		System.out.println(ans);
	}
}
