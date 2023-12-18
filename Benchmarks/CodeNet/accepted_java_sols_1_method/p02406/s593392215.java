import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
		} catch (IOException e) {
		}
		int n = Integer.parseInt(input);
		for (int i = 1; i <= n; i++) {
			int x = 10 * n;
			if (i % 3 == 0 || i % 10 == 3 || i / 10 % 10 == 3 || i / 100 % 10 == 3 || i / 1000 % 10 == 3) {
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}
}
