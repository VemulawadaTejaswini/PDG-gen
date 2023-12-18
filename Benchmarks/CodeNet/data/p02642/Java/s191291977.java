import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = getInt(sc);
		int[] a = getIntArray(sc);
//		System.out.println(a.length);
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean ng = false;

			for (int j = 0; j < n; j++) {

				if (a[i] < a[j]) {
					break;
				}

				if (a[j] != 1 && a[i] != a[j] && isPrime(a[i])) {
					break;
				}
				if (a[i] % a[j] == 0 && i != j) {
					ng = true;
					break;
				}
			}
			if (!ng) {
				count++;
			}
		}
		System.out.println(count);

	}

	static boolean isPrime(int n) {
		// nが1以下ならfalse
		if (n <= 1) {
			return false;
		}
		// nが2または3ならtrue
		if (2 == n || 3 == n) {
			return true;
		}
		// nが2の倍数ならfalse
		if (0 == n % 2) {
			return false;
		}
		// nの平方根を整数で取得(5なら2, 10なら3)
		int square_root = (int) Math.sqrt(n);
		// nがnの平方根以下の、3以上の奇数(3,5,7,9,11,...)で1回でも割れたらfalse
		for (int i = 3; i <= square_root; i += 2) {
			if (0 == n % i) {
				return false;
			}
		}
		// 上記すべて回避したらtrue
		return true;
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
