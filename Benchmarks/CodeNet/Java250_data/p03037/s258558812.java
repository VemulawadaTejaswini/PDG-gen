import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int l[] = new int[m];
		int r[] = new int[m];

		int maxL = 0;
		int minR = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			l[i] = Integer.parseInt(str[0]);
			r[i] = Integer.parseInt(str[1]);
			maxL = Math.max(maxL, l[i]);
			minR = Math.min(minR, r[i]);
		}
		int ans = (minR - maxL) + 1;
		if (ans < 0) {
			ans = 0;
		}
		System.out.println(ans);
	}
}