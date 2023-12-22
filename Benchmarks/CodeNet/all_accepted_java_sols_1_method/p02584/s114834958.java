import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long x = Long.parseLong(str[0]);
		long k = Long.parseLong(str[1]);
		long d = Long.parseLong(str[2]);

		long kaisu = x / d;
		long near = x % d;
		long revnear = (near < 0) ? near + d : near - d;

		if (Math.abs(kaisu) >= k) {
			if (x < 0) {
				System.out.println(Math.abs(x + k * d));
			} else
				System.out.println(x - k * d);
		} else {
			if ((k - kaisu) % 2 == 0) {
				System.out.println(Math.abs(near));
			} else {
				System.out.println(Math.abs(revnear));
			}
		}
	}
}
