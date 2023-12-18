import java.util.Scanner;
//import java.util.TreeSet;

public class Main {
	
	private static long cnt;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		// TreeSet<Integer> all = new TreeSet<Integer>();
		// int cnt = 0;

		// while (n > 0) {
		// int k = sc.nextInt();
		// cnt += (all.tailSet(k)).size();
		// all.add(k);
		// n--;
		// }

		// System.out.println(cnt);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		mergeSort(A, 0, n);

		System.out.println(cnt);

	}

	public static void marge(int[] A, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;

		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}

		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
				cnt += (n1 - i);
				
				// L[i] > R[i] ?????¨??? R[i]???L???????´?????????????L???????´???°-1-i????????????????°???????
			}

		}
	}

	public static void mergeSort(int[] A, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			marge(A, left, mid, right);
		}
	}

}