import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i <= n; i++) {
			int c = 0;

			int t = i;
			while (t > 0) {
				c += t % 6;
				t /= 6;
			}

			t = (int) (n - i);
			while (t > 0) {
				c += t % 9;
				t /= 9;
			}

			ans = Math.min(ans, c);
		}

		System.out.println(ans);
	}
}