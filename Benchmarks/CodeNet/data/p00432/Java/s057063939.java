import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	private static int[][] sp = new int[1002][1002];
	private static int xmax = 0, ymax = 0, xmin = 1002, ymin = 1002;

	public static void main(String[] args) throws FileNotFoundException {

		for (int x = 0; x < 1002; x++)
			for (int y = 0; y < 1002; y++)
				sp[x][y] = 1;

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0508-input.txt"));

		while (true) {
			int n = scan.nextInt();
			int r = scan.nextInt();
			if (n == 0 && r == 0)
				break;
			int area = 0;
			for (int x = xmin + 1; x <= xmax; x++)
				for (int y = ymin + 1; y <= ymax; y++)
					sp[x][y] = 1;
			xmax = 0;
			ymax = 0;
			xmin = 1002;
			ymin = 1002;

			for (int i = 0; i < n; i++) {
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();
				area += setRect(x1, y1, x2, y2);
			}
			System.out.println(area);
			if (r == 2)
				System.out.println(side());
		}

		scan.close();
		System.exit(0);
	}

	private static int side() {
		int sideLen = 0;
		for (int x = xmin + 1; x <= xmax; x++)
			for (int y = ymin + 1; y <= ymax; y++)
				if (sp[x][y] == 0)
					sideLen += (sp[x - 1][y] + sp[x][y - 1] + sp[x + 1][y] + sp[x][y + 1]);
		return sideLen;
	}

	private static int setRect(int x1, int y1, int x2, int y2) {
		int area = 0;
		for (int x = x1 + 1; x <= x2; x++)
			for (int y = y1 + 1; y <= y2; y++)
				if (sp[x][y] == 1) {
					area++;
					sp[x][y] = 0;
				}
		if (xmin > x1)
			xmin = x1;
		if (ymin > y1)
			ymin = y1;
		if (xmax < x2)
			xmax = x2;
		if (ymax < y2)
			ymax = y2;
		return area;

	}
}