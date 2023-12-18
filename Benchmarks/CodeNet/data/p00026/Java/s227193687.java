
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static BufferedReader br;
	private static int[][] cells;
	private static final int S = 1;
	private static final int M = 2;
	private static final int L = 3;

	/*** ????????? */
	static {
		cells = new int[14][14];
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * ?????????????????????
	 *
	 * @param args
	 *            ??????????????°
	 */
	public static void main(String[] args) throws IOException {
		String line;
		int x, y, size, blindNum = 0, max = 0;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line, ",");
			x = Integer.parseInt(st.nextToken()) + 2;
			y = Integer.parseInt(st.nextToken()) + 2;
			size = Integer.parseInt(st.nextToken());
			set(x, y, size);
		}
		for (x = 2; x < 12; x++) {
			for (y = 2; y < 12; y++) {
				int cell = cells[x][y];
				if (cell == 0) {
					blindNum++;
				}
				if (max < cell) {
					max = cell;
				}
			}
		}
		System.out.println(blindNum + "\n" + max);
	}

	/**
	 * ??\????????????????????????????????´????¨??????????<br>
	 *
	 * @param x
	 *            ???
	 * @param y
	 *            ???
	 * @param size
	 *            ??´?????§??????
	 *
	 */
	private static void set(int x, int y, int size) {
		cells[x][y]++;
		if (size >= S) {
			cells[x - 1][y]++;
			cells[x + 1][y]++;
			cells[x][y - 1]++;
			cells[x][y + 1]++;
		}
		if (size >= M) {
			cells[x - 1][y - 1]++;
			cells[x - 1][y + 1]++;
			cells[x + 1][y - 1]++;
			cells[x + 1][y + 1]++;
		}
		if (size >= L) {
			cells[x - 2][y]++;
			cells[x + 2][y]++;
			cells[x][y - 2]++;
			cells[x][y + 2]++;
		}
	}
}