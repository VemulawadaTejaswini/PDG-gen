import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int white[] = new int[n + 1];
		int black[] = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			if (i - 1 >= 0) {
				if (str[i - 1].equals("#"))
					black[i] = 1 + black[i - 1];
				else
					black[i] = black[i - 1];
			}
		}

		for (int i = n; i >= 0; i--) {
			if (i + 1 < n) {
				if (str[i + 1].equals("."))
					white[i] = 1 + white[i + 1];
				else
					white[i] = white[i + 1];
			}
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < n + 1; i++) {
			ans = Math.min(ans, black[i] + white[i]);
		}

		System.out.println(ans);
	}
}
