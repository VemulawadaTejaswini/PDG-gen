import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;
	static int tmpAns;
	static int[] dep;
	static int[] arr;
	static int depIdx;
	static int arrIdx;
	static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			n = sc.nextInt();

			if (n == 0) {
				break;
			}

			dep = new int[n];
			arr = new int[n];

			String tmpInput = null;
			String timeStr = null;
			for (int i = 0; i < n; i++) {
				tmpInput = sc.next();
				timeStr = tmpInput.substring(0, 2);
				timeStr += tmpInput.substring(3, 5) + tmpInput.substring(6, 8);
				dep[i] = Integer.valueOf(timeStr);

				tmpInput = sc.next();
				timeStr = tmpInput.substring(0, 2);
				timeStr += tmpInput.substring(3, 5) + tmpInput.substring(6, 8);
				arr[i] = Integer.valueOf(timeStr);
			}

			tmpAns = 0;
			ans = 0;
			depIdx = 0;
			arrIdx = 0;

			Arrays.sort(dep);
			Arrays.sort(arr);

			for (int i = 0; i < 235959; i++) {
				depCount(i);
				arrCount(i);
				if (tmpAns > ans) {
					ans = tmpAns;
				}
			}
			System.out.println(ans);
		}

	}

	static void depCount(int i) {
		if (depIdx < n && dep[depIdx] == i) {
			tmpAns++;
			depIdx++;
			depCount(i);

		}
	}

	static void arrCount(int i) {
		if (arrIdx < n && arr[arrIdx] == i) {
			tmpAns--;
			arrIdx++;
			arrCount(i);

		}
	}

	// BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	// //二分探索
	// k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// 二分探索
	// k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList) {
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedList.get(mid) <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

