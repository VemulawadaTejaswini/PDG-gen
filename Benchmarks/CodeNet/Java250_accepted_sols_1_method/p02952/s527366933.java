import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (i < 10 || (i < 1000 && i > 99) || (i < 100000 && i > 9999) && i != 100000) {
				count++;
			}
		}
		System.out.println(count);
	}
}