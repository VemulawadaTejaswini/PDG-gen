import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i + 1] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] b = new int[n + 1];
		for (int i = n; i > 0; i--) {
			int sum = 0;
			for (int j = i; j <= n; j+=i) {
				sum += b[j];
			}
			sum %= 2;
			b[i] = (a[i] + 2 - sum) % 2;
		}

		int m = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (b[i] == 1) {
				m++;
				sb.append(i).append(' ');
			}
		}
		System.out.println(m);
		if (m != 0) {
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
