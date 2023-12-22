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

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		long sum1 = 0;
		int idx = 0;
		while (sum1 < sum - sum1) {
			sum1 += a[idx];
			idx++;
		}

		long ans1 = Math.abs(sum1 - (sum - sum1));
		sum1 -= a[idx - 1];
		long ans2 = Math.abs(sum1 - (sum - sum1));
		System.out.println(Math.min(ans1, ans2));
	}
}
