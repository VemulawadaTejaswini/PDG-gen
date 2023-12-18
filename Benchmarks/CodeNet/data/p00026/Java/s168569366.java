
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Yuki
 */
public class Main {

	/*** ???????????\??????????????????????¨??????\?????? */
	private static BufferedReader br;

	/** ????????? */
	private static int[][] squares = new int[10][10];

	/*** ????????? */
	static {
		// ?¨??????\?????????
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * ?????????????????????<br>
	 * ??????????????????????????????
	 *
	 * @param args
	 *            ??????????????°
	 */
	public static void main(String[] args) {

		String line;
		int x = 0;
		int y = 0;
		int size = 0;
		try {
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				while (st.hasMoreTokens()) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					size = Integer.parseInt(st.nextToken());
					squares[x][y] = 1;
					if (size == 1) {
						set1(x, y);
					}
					if (size == 2) {
						set1(x, y);
						set2(x, y);
					}
					if (size == 3) {
						set1(x, y);
						set2(x, y);
						set3(x, y);
					}
				}
			}
			int count = 0;
			int max = 0;
			for (int[] square : squares) {
				for (int value : square) {
					if (value == 0) {
						count++;
					}
					if(max < value){
						max = value;
					}
				}
			}
			System.out.println(count + "\n" + max);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void set2(int x, int y) {
		if (x > 0 && y > 0) {
			squares[x - 1][y - 1] += 1;
		}
		if (x > 0 && y < 9) {
			squares[x - 1][y + 1] += 1;
		}
		if (x < 9 && y > 0) {
			squares[x + 1][y - 1] += 1;
		}
		if (x < 9 && y < 10) {
			squares[x + 1][y + 1] += 1;
		}
	}

	private static void set1(int x, int y) {
		if (x > 0) {
			squares[x - 1][y] += 1;
		}
		if (x < 9) {
			squares[x + 1][y] += 1;
		}
		if (y > 0) {
			squares[x][y - 1] += 1;
		}
		if (y < 9) {
			squares[x][y + 1] += 1;
		}
	}

	private static void set3(int x, int y) {
		if (x - 1 > 0) {
			squares[x - 2][y] += 1;
		}
		if (x + 1 < 9) {
			squares[x + 2][y] += 1;
		}
		if (y - 1 > 0) {
			squares[x][y - 2] += 1;
		}
		if (y + 1 < 9) {
			squares[x][y + 2] += 1;
		}
	}
}