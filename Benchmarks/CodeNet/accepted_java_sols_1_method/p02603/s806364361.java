import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long now = 1000;
		long cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] < a[i + 1]) {
				cnt += now / a[i];
				now %= a[i];
			}
			if (a[i] > a[i + 1]) {
				now += a[i] * cnt;
				cnt = 0;
			}
		}
		now += a[n - 1] * cnt;
		System.out.println(now);
	}
}
