import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int ans = 0;

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int h = Integer.parseInt(str[i]);

			if (h >= k) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}