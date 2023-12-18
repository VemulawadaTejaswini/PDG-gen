import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 2];
		A[0] = 0; A[N + 1] = 0;
		for(int i = 1; i <= N; i++) A[i] = sc.nextInt();
		int[] left = new int[N + 2];
		int[] right = new int[N + 2];

		// left
		for(int i = 1; i < N + 2; i++) left[i] = left[i - 1] + Math.abs(A[i] - A[i - 1]);
		// right
		for(int i = N; i >= 0; i--) right[i] = right[i + 1] + Math.abs(A[i] - A[i + 1]);

		for(int i = 1; i <= N; i++) {
			// remove A_i
			System.out.println(left[i - 1] + right[i + 1] + Math.abs(A[i - 1] - A[i + 1]));
		}
	}
}