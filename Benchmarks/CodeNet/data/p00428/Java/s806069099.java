import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final PrintStream out = System.out;
		int n = in.nextInt(), m = in.nextInt();
		do {
			int[] point = new int[m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					point[j] += in.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				int cp = n - i;
				for (int j = 0; j < m; j++) {
					if (point[j] == cp) {
						if (i != 0) {
							out.print(' ');
						}
						out.print(j + 1);
					}
				}
			}
			out.println();
			n = in.nextInt();
			m = in.nextInt();
		} while (n != 0 || m != 0);
		in.close();
	}
}