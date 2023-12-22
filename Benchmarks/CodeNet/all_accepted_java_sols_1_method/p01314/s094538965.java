import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			if (n == 1 || n == 2) {
				System.out.println(0);
				continue;
			}

			int ans = 0;
			for (int i = n / 2 + 1; i >= 1; i--) {
				int sum = 0;
				for (int j = i; j >= 1; j--) {
					sum += j;
					if (sum == n) {
						ans++;
					}
					if (sum >= n)
						break;
				}
			}
			System.out.println(ans);
		}
	}
}
