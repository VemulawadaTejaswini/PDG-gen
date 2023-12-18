import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		br.close();

		int mod = 1000000007;
		long ans = 0;
		long sum = 0;
		for (int i = n - 2; i >= 0; i--) {
			sum += a[i + 1];
			sum %= mod;
			ans += sum * a[i];
			ans %= mod;
		}
		System.out.println(ans);
	}
}
