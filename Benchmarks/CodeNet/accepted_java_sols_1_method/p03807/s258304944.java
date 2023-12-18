import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int count = 0;
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(str[i]);

			if (k % 2 != 0) {
				count++;
			}
		}

		if (count % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
