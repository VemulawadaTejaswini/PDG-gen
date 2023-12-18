
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[] fiz = new String[10001];
		for (int i = 1; i <= 10000; i++) {
			if (i % 15 == 0)
				fiz[i] = "FizzBuzz";
			else if (i % 5 == 0)
				fiz[i] = "Buzz";
			else if (i % 3 == 0)
				fiz[i] = "Fizz";
			else
				fiz[i] = String.valueOf(i);
		}
		while (true) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			if ((m | n) == 0)
				break;
			boolean[] player = new boolean[m + 1];
			int at = 1;
			int out = 0;
			for (int i = 1; i <= n; i++) {
				String str = scanner.next();
				if (out + 1 == m)
					continue;
				if (!str.equals(fiz[i])) {
					player[at] = true;
					out++;
				}
				while (true) {
					at = at == m ? 1 : at + 1;
					if (!player[at])
						break;
				}
			}
			boolean flag = false;
			for (int i = 1; i <= m; i++) {
				if (!flag) {
					if (!player[i]) {
						System.out.print(i);
						flag = true;
					}
				} else {
					if (!player[i]) {
						System.out.print(" " + i);
					}
				}
			}
			System.out.println();

		}
	}
}