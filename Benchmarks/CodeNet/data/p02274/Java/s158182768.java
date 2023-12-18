/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_5_D&lang=jp
 */
import java.util.*;


public class Main {

	int[] A;
	int count = 0;

	void merge(int left, int mid, int right) {
		//System.out.println("#: " + left + ", " + mid + ", " + right);
		//printArray(A);
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for (int i = 0; i < n1; i++) L[i] = A[left + i];
		for (int i = 0; i < n2; i++) R[i] = A[mid + i];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				//if (i != n1 && j != n2) count += n2 - j;
				//System.out.println(L[i] + ", " + R[j]);
				count += n1 - i;
				A[k] = R[j];
				j++;
			}
		}
		//printArray(A);
		//System.out.println();
	}

	void mergeSort(int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(mid, right);
			mergeSort(left, mid);
			merge(left, mid, right);
		}
	}
	
	int test(int x) {
		int sum = 0;
		for (int a = x-1; a >= 0; a--) {
			sum += a;
		}
		return sum;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		mergeSort(0, A.length);
		System.out.println(count);
		//System.out.println(test(10));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

