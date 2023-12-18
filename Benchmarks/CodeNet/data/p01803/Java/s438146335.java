import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			String[] s = new String[n];
			String[] codes = new String[n];
			int maxLength = 0;
			int maxCount = 0;

			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
				codes[i] = "";

				for (int j = 0; j < s[i].length(); j++) {
					if (j == 0) {
						codes[i] += s[i].charAt(0);
					} else {
						char preChar = s[i].charAt(j - 1);
						if (preChar == 'a' || preChar == 'i' || preChar == 'u' || preChar == 'e' || preChar == 'o') {
							codes[i] += s[i].charAt(j);
						}
					}
				}
				if (maxLength < codes[i].length()) {
					maxCount = 1;
					maxLength = codes[i].length();
				} else if (maxLength == codes[i].length()) {
					maxCount++;
				}
			}

			int idx = -1;
			ans = -1;
			boolean hasSameCode = true;

			while (hasSameCode && idx < maxLength) {
				idx++;
				hasSameCode = false;

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i == j) {
							continue;
						}
						if (codes[i].substring(0, Integer.min(idx + 1, codes[i].length()))
								.equals(codes[j].substring(0, Integer.min(idx + 1, codes[j].length())))) {
							hasSameCode = true;
						}
					}
				}
			}

			ans = idx + 1;
			if (idx == maxLength) {
				ans = -1;
			}

			System.out.println(ans);
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

