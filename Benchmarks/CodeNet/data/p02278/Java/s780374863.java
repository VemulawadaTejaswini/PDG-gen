import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

// ALDS1_6_D
public class Main {
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
		ArrayList<Integer> lis = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			lis.add(i);
			A[i] = sc.nextInt();
		}
		int[] B = A.clone();
		mergeSort(B, 0, n-1);
		while (true) {
			// A[i] == B[i] 値の位置が正しい場合を除外
			ArrayList<Integer> liscopy = new ArrayList<Integer>(lis);
			for (Integer v : lis) {
				if (A[v] == B[v]) liscopy.remove(v);
			}
			lis = new ArrayList<Integer>(liscopy);
			// 基底条件
			if (lis.isEmpty()) break;
			// 交換する組を決める
			int minpoint = lis.get(0);
			for (Integer v : lis) 
				if (B[minpoint] - A[minpoint] < B[v] - A[v]) minpoint = v;
			// 交換先の値をtmpnum
			int tmppoint = -1;
			for (Integer v : lis) {
				if (minpoint == v) continue;
				if (B[minpoint] == A[v]) tmppoint = v;
			}
			if (tmppoint == -1) System.out.println("not tmpnum");
			// 相互
			for (Integer v : lis) {
				if (minpoint == v) continue;
				if (B[minpoint] != B[v]) continue;
				if (A[v] == B[tmppoint]) minpoint = v;
			}
			cost += A[tmppoint] + A[minpoint];
			int tmp = A[tmppoint];
			A[tmppoint] = A[minpoint];
			A[minpoint] = tmp;
		}
		System.out.println(cost);
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

