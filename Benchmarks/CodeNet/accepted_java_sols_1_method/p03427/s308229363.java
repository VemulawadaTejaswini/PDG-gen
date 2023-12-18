import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
		String s = String.valueOf(n);
		String str[] = s.split("");

		int ans = 0;
		for (int i = 0; i < str.length; i++) {
			ans += Integer.parseInt(str[i]);
		}

		int down = ((Integer.parseInt(str[0]) - 1));

		for (int i = 0; i < str.length - 1; i++) {
			down += 9;
		}

		ans = Math.max(ans, down);
		System.out.println(ans);
	}
}
