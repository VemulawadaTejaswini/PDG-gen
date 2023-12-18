import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);

			if (a % 2 != 0) {
				if (i % 2 != 0) {
					ans++;
				}
			}
		}

		System.out.println(ans);
	}
}