import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		for (int i = 1; i <= 10000; i++) {
			double e = (double) (i * 0.08);
			double t = (double) (i * 0.1);

			e = Math.floor(e);
			t = Math.floor(t);

			if (e == a && b == t) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}
}