import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int d = Integer.parseInt(str[1]);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			long x = Long.parseLong(str[0]);
			long y = Long.parseLong(str[1]);

			double dist = Math.sqrt(x * x + y * y);

			if (dist <= d) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}