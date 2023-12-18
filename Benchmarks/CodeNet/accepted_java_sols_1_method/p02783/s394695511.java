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
		int a = Integer.parseInt(str[1]);

		int count = 0;
		while (h > 0) {
			h -= a;
			count++;
		}
		System.out.println(count);
	}
}
