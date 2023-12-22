import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int ans = 0;
		for (int i = 0; i < str.length / 2; i++) {
			if (!str[i].equals(str[str.length - i - 1])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}