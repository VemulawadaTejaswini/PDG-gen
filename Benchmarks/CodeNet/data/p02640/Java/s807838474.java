import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);

		for (int i = 0; i <= x; i++) {
			int count = i * 2 + (x - i) * 4;

			if (count == y) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}
