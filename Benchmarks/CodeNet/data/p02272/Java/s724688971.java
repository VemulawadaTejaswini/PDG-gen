import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_5_B
public class Main {
	int SENTINEL = 1234567890;
	int sum = 0;
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
			sum += 1;
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
	    
	    
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] S = new int[n];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			S[i] = Integer.parseInt(str[i]);
		}
		mergeSort(S, 0, n - 1);
		for (int i = 0; i < S.length; i++) {
    			if (i == S.length - 1) System.out.println(S[i]);
    			else System.out.print(S[i] + " ");
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

