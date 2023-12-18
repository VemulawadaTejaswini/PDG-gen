import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i ++) {
			A[i] = in.nextInt();
		}
		in.close();
		
		for (int i = n/2; i >= 0; i--) {
			maxheap(A, i);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(" " + A[i]);
		}
		System.out.println();
	
	}
	
	public static void maxheap(int[] A, int i) {
		int l = (i + 1) * 2;
		int r = (i + 1) * 2 + 1;
		int largest = 0;
		if (l <= A.length && A[l - 1] > A[i]) {
			largest = l;
		}else {
			largest = i + 1;
		}
		
		if (r <= A.length  && A[r - 1] > A[largest - 1]) {
			largest = r;
		}
		if (largest - 1 != i) {
			int s = A[i];
			A[i] = A[largest - 1];
			A[largest - 1] = s;
			maxheap(A, largest - 1);
		}
	}
}

