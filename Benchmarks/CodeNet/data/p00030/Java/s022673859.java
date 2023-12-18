import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int s;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0 0")) {
			String[] dataset = str.split(" ");
			int n = Integer.parseInt(dataset[0]);
			s = Integer.parseInt(dataset[1]);
			int cnt = 0;
			int[] a = new int[n];
			for (int i = 0; i < 10; i++) {
				a[0] = i;
				cnt += Search(s, i, 1, n, a);
			}
			System.out.println(cnt);
			str = br.readLine();

		}
	}

	private static int Search(int n0, int t0, int d0, int dmax, int[] a) {
		int num = 0;
		if (d0 < dmax) {
			for (int i = Math.min(n0 - t0, t0); i >= 0; i--) {
				if (i == t0)
					continue;
				a[d0] = i;
				num += Search(n0 - t0, i, d0 + 1, dmax, a);
			}
		} else if (d0 == dmax) {
			int total = 0;
			for (int k : a)
				total += k;
			if (total == s) {
				num += 1;
			}
		}
		return num;
	}
}