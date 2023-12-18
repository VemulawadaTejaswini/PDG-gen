import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

// ALDS1_6_D
public class Main {
	int binarySearch(int[] array, int n, int min, int max) {
		if (min > max) return -1;
		int mid = (max + min) / 2;
		if (array[mid] == n) return mid;
		if (array[mid] > n) return binarySearch(array, n, min, mid-1);
		else return binarySearch(array, n, mid+1, max);
	}
	
	int SENTINEL = 1234567890;
	void merge(int[]A, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[mid + 1 + i];
		}
		L[n1] = SENTINEL;
		R[n2] = SENTINEL;
		int i = 0;
		int j = 0;
		for (int k = left; k <= right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;
			}
	    }
	}

	void mergeSort(int[] A, int left, int right) {
	    	if (left < right) {
	    		int mid = (left + right)/2;
	    		mergeSort(A, left, mid);
	    		mergeSort(A, mid + 1, right);
	    		merge(A, left, mid, right);
	  	}
	}
	int cost = 0;
	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 10000;
		int[] A = new int[n];
		boolean[] check = new boolean[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			check[i] = false;
			if (min > A[i]) min = A[i];
		}
		int[] B = A.clone();
		mergeSort(B, 0, n-1);
		for (int i = 0; i < n; i++) {
			if (check[i]) continue;
			check[i] = true;
			if (A[i] == B[i]) continue;
			int loopmin = A[i];
			int count = 0;
			int j = i;
			while(true) {
				cost += A[j];
				j = binarySearch(B, A[j], 0, n-1);
				if (check[j]) break;
				if (loopmin > A[j]) loopmin = A[j];
				check[j] = true;
				count++;
			}
			cost -= loopmin;
			if ((count)*(loopmin-min) > 2*(min + loopmin))
				cost += 2*(min + loopmin);
			else
				cost += count*loopmin;
		}
		System.out.println(cost);
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

