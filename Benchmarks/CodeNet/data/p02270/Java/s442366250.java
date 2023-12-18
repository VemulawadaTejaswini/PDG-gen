/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_4_D&lang=jp
 */
import java.util.*;
import java.util.Arrays;

public class Main {

	void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	int findIndexOfMinValue(int[] a) {
		int ret = 0;
		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (minVal > a[i]) {
				ret = i;
				minVal = a[i];
			}
		}
		return ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] W = new int[n];
		for (int i = 0; i < n; i++) {
			W[i] = sc.nextInt();
		}
		Arrays.sort(W);
		{ // reverse `W'
			int i = 0, j = W.length - 1;
			while (i < j) {
				swap(W, i, j);
				i++; j--;
			}
		}

		int[] T = new int[k];
		for (int i = 0; i < n; i++) {
			T[findIndexOfMinValue(T)] += W[i];
		}
		int max = T[0];
		for (int i = 0; i < k; i++) {
			max = Math.max(T[i], max);
		}
		System.out.println(max);
		// printArray(T);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

