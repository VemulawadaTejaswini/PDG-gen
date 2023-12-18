import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] ans = new int[n + 1];
		for (int i = n; i > 0; i--) {
			int j = i * 2;
			int cnt = 0;
			while (j <= n) {
				cnt += ans[j];
				j += i;
			}
			ans[i] = cnt + a[i - 1];
		}

		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (ans[i] % 2 == 1) {
				cnt++;
				sb.append(i).append(' ');
			}
		}
		System.out.println(cnt);
		if (cnt > 0) {
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
