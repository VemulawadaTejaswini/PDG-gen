import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static long coins = Long.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = getInt(sc);
		for (int i = 0; i < t; i++) {
			coins = Long.MAX_VALUE;
			long n = getLong(sc);
			int a = getInt(sc);
			int b = getInt(sc);
			int c = getInt(sc);
			int d = getInt(sc);
			calc(n, a, b, c, d);
			System.out.println(coins);

		}

	}

	private static void calc(long n, int a, int b, int c, int d) {
		ArrayDeque<Status> statusQue = new ArrayDeque<>();
		statusQue.add(new Status(0, 0));

		while (!statusQue.isEmpty()) {
			Status s = statusQue.poll();
			if (coins <= s.tmpCoins) {
				// 現状で最小ではない->リターン
				continue;
			}
			if (s.x == n) {
				coins = s.tmpCoins;
				continue;
			}

			if (s.x == 0) {
				// x=0=>D確定
				statusQue.addFirst(new Status(s.x + 1, s.tmpCoins + d));
				continue;
			}
			if (s.x > n) {
				// x>n=>nになるまでD
				statusQue.addFirst(new Status(n, s.tmpCoins + d * (s.x - n)));
				continue;
			}
			// その他=>ABCDそれぞれで計算
			statusQue.addFirst(new Status(s.x * 5, s.tmpCoins + c));
			statusQue.addFirst(new Status(s.x * 3, s.tmpCoins + b));
			statusQue.addFirst(new Status(s.x * 2, s.tmpCoins + a));
			statusQue.addFirst(new Status(s.x + 1, s.tmpCoins + d));
		}

	}

	/**
	 * *汎用メソッド<br>
	 * 入力した配列に対する順列を取得
	 *
	 * @param numArray
	 * @return
	 */
	private static List<Integer[]> getPermutation(int[] numArray) {
		List<Integer[]> permutation = new ArrayList<>();
		Integer[] ans = new Integer[numArray.length];
		boolean[] used = new boolean[numArray.length];

		return buildPermutaion(permutation, numArray, ans, used, 0);
	}

	/**
	 * *汎用メソッド(内部)<br>
	 * 入力した配列に対する順列を作成
	 *
	 * @param list
	 * @param numArray
	 * @param ans
	 * @param used
	 * @param depth
	 * @return
	 */
	private static List<Integer[]> buildPermutaion(List<Integer[]> list, int[] numArray, Integer[] ans, boolean[] used,
			int depth) {

		// 全部使い切った時=>できた順列を返す
		if (depth == numArray.length) {
			list.add(ans.clone());
			return list;
		}
		// 使い切っていない場合

		for (int i = 0; i < numArray.length; i++) {
			if (used[i]) {
				continue;
			}
			ans[depth] = numArray[i];
			used[i] = true;
			list = buildPermutaion(list, numArray, ans, used, depth + 1);

			used[i] = false;
		}

		return list;
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をlongで返却
	 *
	 * @return
	 */
	public static long getLong(Scanner sc) {

		return Long.parseLong(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をintで返却
	 *
	 * @return
	 */
	public static int getInt(Scanner sc) {

		return Integer.parseInt(sc.next());
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をStringで返却
	 *
	 * @return
	 */
	public static String getString(Scanner sc) {

		return sc.next();
	}

	/**
	 * *汎用メソッド <br>
	 * スキャナーからの入力値をint配列で返却
	 *
	 * @return
	 */
	public static int[] getIntArray(Scanner sc) {
		String line = "";
		// 直前にnext()を実行していると改行コードだけ取ってしまうのでその対策
		while (line.equals("")) {
			line = sc.nextLine();
		}

		String[] strArray = line.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}

class Status {
	long x;
	long tmpCoins;

	public Status(long x, long tmpCoins) {
		this.x = x;
		this.tmpCoins = tmpCoins;
	}
}
