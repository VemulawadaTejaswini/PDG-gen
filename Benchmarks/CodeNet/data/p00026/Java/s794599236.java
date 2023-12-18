import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private final static byte MASK_RIGHT = 0x0F; //右4bit数値化用マスク
	private final static int STRIP_LENGTH = 10; //短冊1行の長さ
	private static int[] punchTape = new int[100]; //10*10の方眼紙を短冊にしてくっつけた紙テープ

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 256);
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
			punchTape[x * STRIP_LENGTH + y]++;
		}
	}

	/**
	 *紙の染みを数え、損害を報告する
	 */
	private static void calcResult() {
		int white = 0;//綺麗な部分
		int max = 0;//一番ひどい汚れ
		for (int i = 0; i < 100; i++) {
			if (punchTape[i] == 0) {
				white++;
			} else if (punchTape[i] > max) {
				max = punchTape[i];
			}
		}
		System.out.println(white);
		System.out.println(max);
	}
}