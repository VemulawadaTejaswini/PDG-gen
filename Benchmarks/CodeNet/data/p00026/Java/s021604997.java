import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final byte MASK_RIGHT = 0x0F;//右4bit数値化用マスク
	private static int[][] paper = new int[10][10];//都合の良い方眼紙

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 64);
		String sLine;
		while ((sLine = reader.readLine()) != null) {
			droppingInk(sLine.charAt(0) & MASK_RIGHT, sLine.charAt(2) & MASK_RIGHT, sLine.charAt(4) & MASK_RIGHT);
		}
		calcResult();
	}

	/**
	 *都合の良い滴下
	 */
	private static void droppingInk(int x, int y, int size) {
		sinking(x, y - 1);
		sinking(x - 1, y);
		sinking(x, y);
		sinking(x + 1, y);
		sinking(x, y + 1);
		if (size == 1) {
			return;
		}

		sinking(x - 1, y - 1);
		sinking(x + 1, y - 1);
		sinking(x - 1, y + 1);
		sinking(x + 1, y + 1);
		if (size == 2) {
			return;
		}

		sinking(x, y - 2);
		sinking(x - 2, y);
		sinking(x + 2, y);
		sinking(x, y + 2);
	}

	/**
	 * 床は汚さないようにする
	 */
	private static void sinking(int x, int y) {
		if (x >= 0 && x < 10 && y >= 0 && y < 10) {
			paper[x][y]++;
		}
	}

	/**
	 *紙の染みを数え、損害を報告する
	 */
	private static void calcResult() {
		int white = 0;//綺麗な部分
		int max = 0;//一番ひどい汚れ
		for (int[] row : paper) {
			for (int colum : row) {
				if (colum == 0) {
					white++;
				} else if (colum > max) {
					max = colum;
				}
			}
		}
		System.out.println(white);
		System.out.println(max);
	}
}