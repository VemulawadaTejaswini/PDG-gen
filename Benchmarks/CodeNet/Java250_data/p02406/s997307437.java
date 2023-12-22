import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		new Main();
	}

	public Main() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();
		int n = Integer.parseInt(line);
		br.close();

		call(n);
	}

	void call(int n) {
		int i = 1;

		do {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else {
				do {
					if (x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					x /= 10;
				} while (x != 0);
			}
		} while (++i <= n);

		System.out.println();
	}
}