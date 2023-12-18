package aizuonlinejudge;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static Scanner sc;
	private static int[][] cells;

	static {
		cells = new int[14][14];
	}

	public static void main(String[] args) throws IOException {

		sc = new Scanner(System.in);

		String line;
		int x, y, size, blind = 0, max = 0;

		while ((line = sc.nextLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line, ",");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			size = Integer.parseInt(st.nextToken());
			set(x, y, size);
		}
		for (x = 2; x < 12; x++) {
			for (y = 2; y < 12; y++) {
				if (cells[x][y] == 0) {
					blind++;
				}
				if (max < cells[x][y]) {
					max = cells[x][y];
				}
			}
		}
		System.out.println(blind + "\n" + max);
	}

	private static void set(int x, int y, int size) {
		cells[x][y]++;
		cells[x - 1][y]++;
		cells[x + 1][y]++;
		cells[x][y - 1]++;
		cells[x][y + 1]++;
		if (size >= 2) {
			cells[x - 1][y - 1]++;
			cells[x - 1][y + 1]++;
			cells[x + 1][y - 1]++;
			cells[x + 1][y + 1]++;
		}
		if (size >= 3) {
			cells[x - 2][y]++;
			cells[x + 2][y]++;
			cells[x][y - 2]++;
			cells[x][y + 2]++;
		}
	}
}