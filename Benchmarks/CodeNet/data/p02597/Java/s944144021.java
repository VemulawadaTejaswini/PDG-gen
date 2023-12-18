import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int ans = 0;
		int red = 0;
		int white = 0;

		if (str[0].equals("W")) {
			white++;
		} else {
			red++;
		}
		for (int i = 1; i < n; i++) {
			if (str[i].equals("W")) {
				if (i != 1 && str[i - 1].equals("R")) {
					ans += Math.min(red, white);
					white = 0;
					red = 0;
				}
				white++;
			} else {
				red++;
			}
			if (i == n - 1 && str[i].equals("R")) {
				ans += Math.min(red, white);
				white = 0;
				red = 0;
			}
		}
		System.out.println(ans);
	}
}