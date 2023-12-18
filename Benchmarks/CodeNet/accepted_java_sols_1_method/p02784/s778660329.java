import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			sum += a;
			if (h <= sum) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
