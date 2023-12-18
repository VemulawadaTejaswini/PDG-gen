import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		label:
		for (int x = 0; x < t; x++) {
			int n = Integer.parseInt(br.readLine());
			String[] sa = br.readLine().split(" ");
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(sa[i]);
			}
			char[] s = br.readLine().toCharArray();

			for (int i = n - 1; i >= 0; i--) {
				if (s[i] == '0') {
					for (int k = 0; k < 61; k++) {
						if ((a[i] >> k & 1) == 1) {
							for (int j = 0; j < n; j++) {
								if (i != j && (a[j] >> k & 1) == 1) {
									a[j] ^= a[i];
								}
							}
						}
					}
				} else {
					if (a[i] != 0) {
						System.out.println(1);
						continue label;
					}
				}
			}
			System.out.println(0);
		}
	}
}
