import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String str[] = br.readLine().split(" ");

			int n = Integer.parseInt(str[0]);
			int x = Integer.parseInt(str[1]);

			if (n == 0 && x == 0)
				break;

			long ans = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i == j || j == k || k == i)
							continue;

						if (i + j + k == x) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}
