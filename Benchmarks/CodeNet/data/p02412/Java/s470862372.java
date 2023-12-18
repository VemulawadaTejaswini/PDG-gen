import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n, x, ways;
		while (true) {
			ways = 0;
			String[] num = in.readLine().split(" ");
			n = Integer.parseInt(num[0]);
			x = Integer.parseInt(num[1]);
			if (n == 0 && x == 0) {
				break;
			}
			for (int i = 1; i <= n; i += 1) {
				for (int j = 1; j <= n; j += 1) {
					for (int k = 1; k <= n; k += 1) {
						if (i == j || j == k || i == k) {
							continue;
						} else if (i + j + k == x) {
							ways++;
						}
					}
				}
			}
			System.out.println(ways / 6);
		}
	}
}