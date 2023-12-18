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

			int e = sc.nextInt();

			if (e == 0) {
				break;
			}
			int min = Integer.MAX_VALUE;
			for (int z = 0; z <= 100; z++) {
				for (int y = 0; y <= 1000; y++) {
					int x = e - z * z * z - y * y;

					if (x < 0) {
						continue;
					}

					min = Integer.min(min, x + y + z);
				}
			}
			System.out.println(min);
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

