import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		solve(N, A);
	}
	
	public static void solve(int N, int[] A) {
		for (int j = 0; j < N; j++) {
			int key = A[j];
			int i = j - 1;
			while(i >= 0 && A[i] > key) {
				A[i+1] = A[i];
				i--;
			}
			A[i+1] = key;
			
			System.out.print(A[0]);
			for(int k = 1; k < N; k++) {
				System.out.print(" ");
				System.out.print(A[k]);
			}
			System.out.println();
		}
	}
}