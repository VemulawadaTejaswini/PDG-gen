import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextInt();
		}
		insertionSort(A,N);



	}
	public static void insertionSort(int[] A, int N) { // N個の要素を含む0-オリジンの配列A
		for(int i = 0;i < N;i++) {
			int v = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
				A[j+1] = v;
			}
			printArray(A);
		}
	}

	public static void printArray(int[] A) {
		for(int i = 0;i < A.length;i++) {
			System.out.print(((i==0)?"":" ") + A[i] + ((i==A.length-1)?"\n":""));
		}
	}
}

