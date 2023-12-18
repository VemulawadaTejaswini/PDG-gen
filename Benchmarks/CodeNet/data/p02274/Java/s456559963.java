import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] A = new int[n];
		for (int i=0; i<n; i++) {
			A[i] = stdIn.nextInt();
		}
		System.out.println(bubbleSort(A));
	}

	static int bubbleSort(int[] A){
		int count = 0;
		for (int i=0; i<A.length; i++) {
			for (int j=A.length-1; j>i; j--) {
				if (A[j] < A[j-1]) {
					swap(A,j,j-1);
					count++;
				}
			}
		}
		return count;
	}

	static void swap(int[] A,int x,int y){
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
}