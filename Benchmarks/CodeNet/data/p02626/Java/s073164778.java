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

		long xor = 0;
		for (int i = 2; i < n; i++) {
			xor ^= a[i];
		}

		for (int i = 0; i < a[0]; i++) {
			if (((a[0] - i) ^ (a[1] + i) ^ xor) == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
