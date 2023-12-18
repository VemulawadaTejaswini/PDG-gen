import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.transaction.xa.Xid;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;

	static int[] xBegin;
	static int[] xEnd;
	static int[] yBegin;
	static int[] yEnd;
	static int N;
	static int W;
	static int H;
	static int wBeginIdx;
	static int hBeginIdx;
	static int wEndIdx;
	static int hEndIdx;
	static int xCount;
	static int yCount;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] w = new int[N];
		xBegin = new int[N];
		xEnd = new int[N];
		yBegin = new int[N];
		yEnd = new int[N];

		for (int j = 0; j < N; j++) {
			x[j] = sc.nextInt();
			y[j] = sc.nextInt();
			w[j] = sc.nextInt();

			xBegin[j] = x[j] - w[j];
			if (xBegin[j] < 0) {
				xBegin[j] = 0;
			}
			xEnd[j] = x[j] + w[j];
			yBegin[j] = y[j] - w[j];
			if (yBegin[j] < 0) {
				yBegin[j] = 0;
			}
			yEnd[j] = y[j] + w[j];
		}

		Arrays.sort(xBegin);
		Arrays.sort(xEnd);
		Arrays.sort(yBegin);
		Arrays.sort(yEnd);

		int xIdx = 0;
		wBeginIdx = 0;
		wEndIdx = 0;
		int yIdx = 0;
		hBeginIdx = 0;
		hEndIdx = 0;
		boolean xBool = true;
		while (xIdx < W && xBool) {

			while (wBeginIdx < N && xBegin[wBeginIdx] == xIdx) {
				xCount++;
				wBeginIdx++;
			}
			while (wEndIdx < N && xEnd[wEndIdx] == xIdx) {
				xCount--;
				wEndIdx++;
			}
			if (xCount < 1) {
				xBool = false;
			}

			xIdx++;
		}

		boolean yBool = true;

		while (yIdx < H && yBool) {

			while (hBeginIdx < N && yBegin[hBeginIdx] == yIdx) {
				hBeginIdx++;
				yCount++;
			}
			while (hEndIdx < N && yEnd[hEndIdx] == yIdx) {
				hEndIdx++;
				yCount--;
			}
			if (yCount < 1) {
				yBool = false;
			}
			yIdx++;
		}

		// List<Integer> xLeft = new LinkedList<>();
		// List<Integer> yLeft = new LinkedList<>();
		if (xBool || yBool) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static void countYEnd(int hIdx, int yIdx) {

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

