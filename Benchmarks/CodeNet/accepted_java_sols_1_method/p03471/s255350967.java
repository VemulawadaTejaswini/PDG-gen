import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j + i <= n; j++) {
				int k = (n - i - j);

				if (k < 0)
					continue;
				long sum = 10000 * i + 5000 * j + 1000 * k;

				//System.out.println(i + " " + j + " " + k);

				if (sum == y) {
					System.out.println(i + " " + j + " " + k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}
