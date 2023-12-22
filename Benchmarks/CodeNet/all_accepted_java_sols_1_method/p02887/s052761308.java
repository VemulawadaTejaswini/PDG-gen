import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split("");

		String last = str[0];
		int ans = 1;

		for (int i = 1; i < n; i++) {
			if (last.equals(str[i])) {

			} else {
				last = str[i];
				ans++;
			}
		}
		System.out.println(ans);
	}
}