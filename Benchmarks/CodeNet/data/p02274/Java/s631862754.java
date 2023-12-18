import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] A = new int[n];
		for (int i=0; i<n; i++) {
			A[i] = stdIn.nextInt();
		}
		System.out.println(bubbleSort(A,A.length));
	}

	static int bubbleSort(int[] A,int n){
		int count = 0;
		int i = 0;
		while (i < n-1) {
			int last = n-1;
			int exchg = 0;
			for (int j=n-1; j>i; j--) {
				if (A[j-1] > A[j]) {
					swap(A,j-1,j);
					last = j;
					exchg++;
					count++;
				}
			}
			if(exchg == 0)
					break;
			i = last;
		}

		return count;
	}

	static void swap(int[] A,int x,int y){
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
}