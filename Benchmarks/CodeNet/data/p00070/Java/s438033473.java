import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] u = new boolean[10];

	static int[][] c = new int[10][10];

	static int search(int n, int s) {
		if (n == 1)
			return (s < 10 && !u[s]) ? 1 : 0;
		int x = 0;
		for (int i = 0; i < 10; i++) {
			if (!u[i] && s >= c[i][n - 1]) {
				u[i] = true;
				x += search(n - 1, s - c[i][n - 1]);
				u[i] = false;
			}
		}
		return x;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				c[i][j] = i * (j + 1);
			}
		}
		while (sc.hasNextInt()) {
			Arrays.fill(u, false);
			int n = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(search(n, s));
		}
	}
}