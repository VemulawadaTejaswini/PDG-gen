import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		double ans = 0.0;
		for (int i = 1; i <= n; i++) {
			double d = (double) 1 / n;
			int point = i;
			while (point < k) {
				d *= (double) 1 / 2;
				point *= 2;
			}
			ans += d;
		}

		System.out.println(ans);
	}
}