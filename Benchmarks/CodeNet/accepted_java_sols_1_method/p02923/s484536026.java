import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int h[] = new int[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(str[i]);
		}

		int ans = 0;
		int j = 0;

		for (int i = 0; i < n; i++) {
			while (j < n - 1 && h[j] >= h[j + 1]) {
				j++;
			}
			ans = Math.max(ans, j - i);
			if (i == j) {
				j++;
			}
		}

		System.out.println(ans);
	}
}