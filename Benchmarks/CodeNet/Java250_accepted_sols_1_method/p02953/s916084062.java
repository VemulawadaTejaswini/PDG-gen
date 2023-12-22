import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);

		str = br.readLine().split(" ");
		int h[] = new int[n];

		int max = 0;
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(str[i]);
			max = Math.max(h[i], max);
		}

		if (n == 1)
			System.out.println("Yes");
		else if (max - 2 >= h[n - 1])
			System.out.println("No");
		else {
			for (int i = n - 1; i > 0; i--) {
				if (h[i - 1] - h[i] >= 2) {
					System.out.println("No");
					System.exit(0);
				} else if (h[i - 1] > h[i]) {
					h[i - 1]--;
				}
			}
			System.out.println("Yes");
		}
	}
}