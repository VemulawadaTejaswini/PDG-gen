import java.util.Scanner;

public class Main {

	// 数字の最大を探す
	public static int max(int a[], int b[], int n) {
		int i;
		int max = 0;

		for (i = 0; i < n; ++i) {
			if (a[b[max]] <= a[b[i]]) {
				max = i;
			}
		}
		return max;
	}

	// 数字の最小を探す
	public static int min(int a[], int b[], int n) {
		int i;
		int min = 0;

		for (i = 0; i < n; ++i) {
			if (a[b[min]] >= a[b[i]]) {
				min = i;
			}
		}
		return min;
	}

	// 三つ存在する数字がどれだけあるかを数える
	public static int same(int count[], int num[], int b[], int n) {
		int count2 = 0;
		int i;

		for (i = 0; i < n; ++i) {
			if (count[num[b[i]]] >= 3) {
				++count2;
				if (count2 % 3 == 0) {
					count[num[b[i]]] -= 3;
				}
			}
		}
		count2 /= 3;

		return count2;
	}

	// 連続する三つの数字がどれだけ存在するかを数える
	public static int continuous(int count[], int num[], int b[], int n) {
		int count2 = 0;
		int i;
		int min, max;

		// 数字の最大、最小を探す
		max = max(num, b, n);
		min = min(num, b, n);

		// 最小の数字が三つ以上存在した場合その3つを一組とする
		if (count[num[b[min]]] >= 3) {
			count2 += same(count, num, b, n);
		}

		// 連続する三つの数字がどれだけ存在するかを数える
		for (i = num[b[min]] + 1; i < num[b[max]]; ++i) {
			if (count[i] > 0) {
				if (count[i + 1] > 0 && count[i - 1] > 0) {
					++count2;
					--count[i + 1];
					--count[i];
					--count[i - 1];
					if (count[i + 1] > 0 && count[i - 1] > 0 && count[i] > 0) {
						--i;
						continue;
					}
				}
				// 連続する数字の組を作ったうえで、途中で同じ数字が三つ以上並んでいた時、その三つを一組とする
				if (count[i] >= 3) {
					count2 += same(count, num, b, n);
				}
			}
		}
		// 最大の数字が三つ以上存在した場合その3つを一組とする
		if (count[num[b[max]]] >= 3) {
			count2 += same(count, num, b, n);
		}

		return count2;
	}

	public static void main(String[] args) {
		int T, num[];
		int R[], G[], B[];// position of R,B,G
		int count1[], count2, /* counting number */ max, min;
		String str[];
		num = new int[9];
		str = new String[9];
		R = new int[9];
		B = new int[9];
		G = new int[9];
		count1 = new int[10];
		int i, j, k, m, n, l;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (i = 0; i < T * 2; ++i) {
			k = 0;
			m = 0;
			n = 0;
			for (j = 0; j < 9; ++j) {
				if (i % 2 == 0) {
					num[j] = sc.nextInt();
				} else {
					str[j] = sc.next();
					if (str[j].equals("R")) {
						R[k] = j;
						++k;
					} else if (str[j].equals("B")) {
						B[m] = j;
						++m;
					} else {
						G[n] = j;
						++n;
					}
				}
			}

			if (i % 2 == 1) {

				// Rのときに条件を満たすものを探す
				for (l = 0; l < 9; ++l) {
					count1[l] = 0;
				}
				count2 = 0;

				// 数字の最大、最小を探す
				max = max(num, R, k);
				min = min(num, R, k);

				// それぞれの数字の総数
				for (l = 0; l < k; ++l) {
					++count1[num[R[l]]];
				}

				// 数字が並んでいる時
				if (num[R[max]] - num[R[min]] > 1) {
					count2 += continuous(count1, num, R, k);
				}

				// B
				for (l = 0; l < 9; ++l) {
					count1[l] = 0;
				}
				// 数字の最大、最小を探す
				max = max(num, B, m);
				min = min(num, B, m);

				// それぞれの数字の総数
				for (l = 0; l < m; ++l) {
					++count1[num[B[l]]];
				}

				// 数字が並んでいる時
				if (num[B[max]] - num[B[min]] > 1) {
					count2 += continuous(count1, num, B, m);
				}

				// G
				for (l = 0; l < 9; ++l) {
					count1[l] = 0;
				}

				// 数字の最大、最小を探す
				max = max(num, G, n);
				min = min(num, G, n);

				// それぞれの数字の総数
				for (l = 0; l < n; ++l) {
					++count1[num[G[l]]];
				}

				// 数字が並んでいる時
				if (num[G[max]] - num[G[min]] > 1) {
					count2 += continuous(count1, num, G, n);
				}

				if (count2 == 3) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}
		sc.close();
	}

}

