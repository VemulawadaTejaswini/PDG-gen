import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

			int N = sc.nextInt();
			int M = sc.nextInt();

			if ((N | M) == 0) {
				break;
			}
			ans = 0;
			int[] h = new int[N];
			int[] hSum = new int[N + 1];
			int[] w = new int[M];
			int[] wSum = new int[M + 1];

			hSum[0] = 0;
			for (int i = 0; i < N; i++) {
				h[i] = sc.nextInt();
				hSum[i + 1] = h[i] + hSum[i];
			}
			wSum[0] = 0;
			for (int i = 0; i < M; i++) {
				w[i] = sc.nextInt();
				wSum[i + 1] = w[i] + wSum[i];
			}

			Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
			for (int i = 0; i < N + 1; i++) {
				for (int j = i + 1; j < N + 1; j++) {
					int tmpLength = hSum[j] - hSum[i];
					if (hMap.containsKey(tmpLength)) {
						hMap.put(tmpLength, hMap.get(tmpLength) + 1);
					} else {
						hMap.put(tmpLength, 1);
					}
				}
			}

			Map<Integer, Integer> wMap = new HashMap<Integer, Integer>();
			for (int i = 0; i < M + 1; i++) {
				for (int j = i + 1; j < M + 1; j++) {
					int tmpLength = wSum[j] - wSum[i];
					if (wMap.containsKey(tmpLength)) {
						wMap.put(tmpLength, wMap.get(tmpLength) + 1);
					} else {
						wMap.put(tmpLength, 1);
					}
				}
			}

			for (int hLength : hMap.keySet()) {
				if (wMap.containsKey(hLength)) {
					ans += hMap.get(hLength) * wMap.get(hLength);
				}
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

