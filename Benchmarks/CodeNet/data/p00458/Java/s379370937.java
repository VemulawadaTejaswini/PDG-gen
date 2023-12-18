import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0534-input.txt"));

		while (scan.hasNext()) {

			int m = scan.nextInt();
			int n = scan.nextInt();
			if (m == 0)
				break;
			Park p = new Park(m, n);
			for (int y = 0; y < n; y++)
				for (int x = 0; x < m; x++)
					p.add(x, y, scan.nextInt());

			System.out.println(p.maxRoot());
		}

		scan.close();
		System.exit(0);

	}
}

class Park {
	boolean[][] loc;

	public Park(int m, int n) {
		loc = new boolean[m][n];
	}

	public int maxRoot() {
		int max = 0;
		for (int sx = 0; sx < loc.length; sx++)
			for (int sy = 0; sy < loc[sx].length; sy++)
				if (loc[sx][sy]) {
					Root root = new Root();
					int l = root.len(sx, sy);
					if (l > max)
						max = l;
				}
		return max;
	}

	class Root {
		boolean[][] rt;

		public Root() {
			rt = new boolean[loc.length][loc[0].length];
		}

		public int len(int x, int y) {
			if (x < 0 || y < 0 || x == loc.length || y == loc[0].length)
				return 0;
			if (!loc[x][y] || rt[x][y])
				return 0;
			rt[x][y] = true;
			int max = 0;
			int l = len(x, y + 1);
			if (l > max)
				max = l;
			l = len(x, y - 1);
			if (l > max)
				max = l;
			l = len(x + 1, y);
			if (l > max)
				max = l;
			l = len(x - 1, y);
			if (l > max)
				max = l;
			rt[x][y] = false;
			return max + 1;
		}

	}

	public void add(int x, int y, int is) {
		if (is == 1)
			loc[x][y] = true;
	}
}