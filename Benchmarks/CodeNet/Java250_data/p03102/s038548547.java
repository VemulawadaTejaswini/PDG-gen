import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int B[] = new int[M];
		int A[][] = new int[N][M];
		int cal[] = new int[N];
		int count = 0;

		for (int k = 0; k < M; k++) {
			B[k] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				cal[i] += A[i][j] * B[j] ;
			}
			cal[i] += C;
			
			if(cal[i] > 0) {
				count++;
			}
		}

		System.out.print(count);
		
	}
}
