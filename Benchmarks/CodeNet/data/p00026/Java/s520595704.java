import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	// フィールド
	static int droppingField[][] = new int[10][10];
	// インクが落ちていない数
	static int clearCount = 0;
	// 一番濃いインク
	static int maxDoropping = 0;

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		// 標準入力よりインプットを取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<int[]> inkList = new ArrayList<int[]>();

		// 最終行まで読み込む
		String line = "";
		while ((line = br.readLine()) != null) {

			// 1行をデータの要素に分割
			StringTokenizer st = new StringTokenizer(line, ",");

			// リストに格納
			while (st.hasMoreTokens()) {
				int[] input = { Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()) };
				inkList.add(input);
			}
		}
		br.close();

		// インクを塗る
		drop(inkList, droppingField);

		// インクが落ちていない数、 一番濃いインクを求める
		outputResult();

		// インクが落ちていない数、 一番濃いインクを出力する
		System.out.println(clearCount);
		System.out.println(maxDoropping);

	}

	// 引数にインクとフィールドを指定し、フィールドにインクを落とす
	public static void drop(List<int[]> inkList, int[][] droppingField) {

		List<int[]> inks = new ArrayList<int[]>();
		int maxLength = droppingField.length;

		// リストをばらしてドロップできる状態に
		for (int[] a : inkList) {

			if (a[2] == 1) {
				inks.addAll(smallInk(a[0], a[1], maxLength));
			} else if (a[2] == 2) {
				inks.addAll(middiumInk(a[0], a[1], maxLength));
			} else if (a[2] == 3) {
				inks.addAll(largeInk(a[0], a[1], maxLength));
			}

		}
		droppingInk(inks);

	}

	// 小さいの塗る
	public static List<int[]> smallInk(int x, int y, int maxLength) {
		List<int[]> inks = new ArrayList<int[]>();

		int[] ink1 = { x, y };
		int[] ink2 = { x - 1, y };
		int[] ink3 = { x + 1, y };
		int[] ink4 = { x, y - 1 };
		int[] ink5 = { x, y + 1 };

		inks.add(ink1);
		inks.add(ink2);
		inks.add(ink3);
		inks.add(ink4);
		inks.add(ink5);

		return inks;
	}

	// 中くらいの塗る
	public static List<int[]> middiumInk(int x, int y, int maxLength) {
		List<int[]> inks = new ArrayList<int[]>();

		for (int i = x - 1; i <= x + 1; i++) {
			for (int n = y - 1; n <= y + 1; n++) {
				int[] ink1 = { i, n };
				inks.add(ink1);
			}
		}

		return inks;

	}

	// 大きいの塗る
	public static List<int[]> largeInk(int x, int y, int maxLength) {
		List<int[]> inks = new ArrayList<int[]>();

		for (int i = x - 1; i <= x + 1; i++) {
			for (int n = y - 1; n <= y + 1; n++) {
				int[] ink1 = { i, n };
				inks.add(ink1);
			}
		}
		int[] ink2 = { x - 2, y };
		int[] ink3 = { x + 2, y };
		int[] ink4 = { x, y - 2 };
		int[] ink5 = { x, y + 2 };

		inks.add(ink2);
		inks.add(ink3);
		inks.add(ink4);
		inks.add(ink5);

		return inks;
	}

	// インクをフィールドに塗る
	public static void droppingInk(List<int[]> inks) {
		int maxLength = droppingField.length;

		for (int[] a : inks) {
			if (a[0] >= 0 && a[0] < maxLength && a[1] >= 0 && a[1] < maxLength) {
				droppingField[a[0]][a[1]]++;
			}
		}

	}

	// インクが落ちていない数、 一番濃いインクを算出する
	public static void outputResult() {

		for (int i = 0; i < droppingField.length; i++) {
			for (int n = 0; n < droppingField[0].length; n++) {

				if (droppingField[i][n] == 0) {
					// 塗られていない箇所(0)を数える
					clearCount++;
				} else {
					// 一番濃いインクを保持する
					maxDoropping = Math.max(maxDoropping, droppingField[i][n]);
				}
			}
		}

	}

}