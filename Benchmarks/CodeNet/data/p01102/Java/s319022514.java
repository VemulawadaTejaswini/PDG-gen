import java.util.ArrayList;
import java.util.Arrays;
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

			String s1 = sc.next();

			if (s1.equals(".")) {
				break;
			}
			String s2 = sc.next();

			int maxLength = Integer.max(s1.length(), s2.length());

			if (s1.equals(s2)) {
				System.out.println("IDENTICAL");
			} else {
				String newS1 = "";
				String newS2 = "";

				String[] q1 = new String[100];
				String[] q2 = new String[100];
				Arrays.fill(q1, "");
				Arrays.fill(q2, "");

				int idx1 = 0;
				int idx2 = 0;

				boolean inQ1 = false;
				boolean inQ2 = false;

				for (int i = 0; i < maxLength; i++) {
					if (i < s1.length()) {
						if (s1.charAt(i) == '"') {
							if (inQ1 == true) {
								idx1++;
							}
							newS1 += s1.charAt(i);
							inQ1 = !inQ1;
						} else {
							if (inQ1) {
								q1[idx1] += s1.charAt(i);
							} else {
								newS1 += s1.charAt(i);
							}
						}
					}
					if (i < s2.length()) {

						if (s2.charAt(i) == '"') {
							if (inQ2 == true) {
								idx2++;
							}
							newS2 += s2.charAt(i);
							inQ2 = !inQ2;
						} else {
							if (inQ2) {
								q2[idx2] += s2.charAt(i);
							} else {
								newS2 += s2.charAt(i);
							}
						}
					}
				}
				int difNum = 0;
				for (int i = 0; i < 100; i++) {
					if (!q1[i].equals(q2[i])) {
						difNum++;
					}
				}

				if (newS1.equals(newS2) && difNum == 1) {
					System.out.println("CLOSE");
				} else {
					System.out.println("DIFFERENT");
				}
			}
		}
	}

	// 素数判定
	static boolean isPrime(long n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;

		int i = 3;
		while (i <= Math.sqrt(n)) {
			if (n % i == 0)
				return false;
			else
				i += 2;
		}
		return true;
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

