import java.util.Scanner;

public class Main {
 	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
 		int N = sc.nextInt();
 		int M = sc.nextInt();
		int C = sc.nextInt();

		int B[] = new int[M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		int ans = 0;

		for (int i = 0; i < N; i++) {

			int sum = 0;
			int A[] = new int[M];

			for (int j = 0; j < M; j++) {
				A[j] = sc.nextInt();

				sum += A[j]*B[j];
				if (j == M-1) {
					sum += C;
					if (sum > 0) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
 	}
}
