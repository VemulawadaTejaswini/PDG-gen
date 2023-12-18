import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int N, k = 0;
		int[] A = new int[100];
		Scanner stdIn = new Scanner(System.in);

		N = stdIn.nextInt();

		for(int i = 0; i < N; i++){
			A[i] = stdIn.nextInt();
		}

		k = bubbleSort(N, A);
		trace(N, A, k);
	}

	public static void trace(int N, int[] A, int k){
		for(int i = 0; i < N; i++){
			if(i > 0)	System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(k);
	}

	public static int bubbleSort(int N, int[] A){
		int k = 0;
		for(int i = 0; i < N - 1; i++){
			for(int j = N - 1; j > i; j--){
				if(A[j] < A[j - 1]){
					int tmp = A[j - 1];
					A[j - 1] = A[j];
					A[j] = tmp;
					k++;
				}
			}
		}
		return k;
	}

}