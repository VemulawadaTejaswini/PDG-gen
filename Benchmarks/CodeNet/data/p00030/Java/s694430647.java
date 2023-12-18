import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r = null;
		while ((r = br.readLine()) != null) {
			String[] s = r.split(" ");
			int a = Integer.valueOf(s[0]);
			int b = Integer.valueOf(s[1]);
			if (a == 0 && b == 0)
				break;
			System.out.println(f(a, b)+f(a-1, b));
		}
	}

	private static int f(int n, int s) {
		int sum = 0;
		if (n == 0) {
			if (s == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		for (int k = Math.max(n, s - n); k <= s; k++) {
			sum += f(n - 1, s - k);
		}
		return sum;
	}
}