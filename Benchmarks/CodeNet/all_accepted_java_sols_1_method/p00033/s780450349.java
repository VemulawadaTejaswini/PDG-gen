
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		for (int j = 0; j < n; j++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			boolean flag = true;
			int b = 0;
			int c = 0;
			for (int i = 0; i < 10; i++) {
				int a = Integer.parseInt(tokenizer.nextToken());
				if (a > b) {
					b = a;
				} else if (a > c) {
					c = a;
				} else {
					flag = false;
					break;
				}

			}
			System.out.println(flag ? "YES" : "NO");
		}
	}
}