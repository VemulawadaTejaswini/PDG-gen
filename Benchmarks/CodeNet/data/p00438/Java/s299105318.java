import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static boolean[][] u = new boolean[16][16];
	static int a;
	static int b;
	static int[][] r = new int[16][16];

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0515-input.txt"));
		while (true) {
			a = scan.nextInt();
			b = scan.nextInt();
			if (a == 0 && b == 0)
				break;
			a--;
			b--;

			for (int x = 0; x < 16; x++)
				for (int y = 0; y < 16; y++) {
					u[x][y] = false;
					r[x][y] = -1;
				}

			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				u[scan.nextInt() - 1][scan.nextInt() - 1] = true;
			}

			System.out.println(run(0, 0));
		}

		scan.close();
		System.exit(0);
	}

	private static int run(int x, int y) {
		if (x > a || y > b)
			return 0;
		if (x == a && y == b)
			return 1;
		if (u[x][y])
			return 0;

		if (r[x][y] != -1)
			return r[x][y];

		int ret = run(x + 1, y) + run(x, y + 1);
		r[x][y] = ret;
		return ret;
	}

}