import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long l = Long.parseLong(str[0]);
		long r = Long.parseLong(str[1]);

		if (r - l >= 2019) {
			System.out.println("0");
		} else {
			long ans = 2018;
			for (long i = l; i < r; i++) {
				for (long j = i + 1; j <= r; j++) {
					ans = Math.min(ans, (i * j) % 2019);
				}
			}
			System.out.println(ans);
		}
	}
}