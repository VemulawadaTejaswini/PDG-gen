import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int n  = Integer.parseInt(line);

		int x = 0;
		for (int i = 1; i <= n; i++) {
			x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else if (x % 10 == 3) {
				System.out.print(" " + i);
			} else {
				if ((x /= 10) % 10 == 3) {
					System.out.print(" " + i);
				}
			}
		}
		System.out.println("");
	}
}