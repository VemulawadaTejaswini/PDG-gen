import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		if (a > b) {
			if (c < a && c > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (c < b && c > a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
