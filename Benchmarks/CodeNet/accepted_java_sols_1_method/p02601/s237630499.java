import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		int k = Integer.parseInt(br.readLine());

		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			int count = 0;
			for (int i = 0; i < k; i++) {
				if (a < b) {
					break;
				}
				b *= 2;
				if (k <= 0) {
					break;
				}
				count = i + 1;
			}
			if (a < b && b < c) {
				System.out.println("Yes");
			} else {
				k -= count;
				for (int i = 0; i < k; i++) {
					if (b < c) {
						break;
					}
					c *= 2;
					if (k <= 0) {
						break;
					}
				}
				if (a < b && b < c) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}