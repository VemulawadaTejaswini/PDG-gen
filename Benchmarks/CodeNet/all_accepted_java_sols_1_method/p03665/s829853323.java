import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int p = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		int even = 0;
		int odd = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);

			if (a % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		if (p == 0) {
			if (odd == 0) {
				System.out.println((long) Math.pow(2, n));
			} else {
				System.out.println((long) Math.pow(2, n - 1));
			}
		} else {
			if (odd >= 1) {
				System.out.println((long) Math.pow(2, n - 1));
			} else {
				System.out.println("0");
			}
		}
	}
}
