import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int red = 0;
		for (int i = 0; i < n; i++) {
			if (str[i].equals("R")) {
				red++;
			}
		}

		int ans = 0;
		for (int i = 0; i < red; i++) {
			if (str[i].equals("W")) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}