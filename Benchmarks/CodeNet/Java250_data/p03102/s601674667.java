import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			int M = Integer.parseInt(sc.next());
			int C = Integer.parseInt(sc.next());
			int[] B = new int[M];
			for(int i = 0; i < M; i++) {
				B[i] = Integer.parseInt(sc.next());
			}
			int[][] A = new int[N][M];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					A[i][j] = Integer.parseInt(sc.next());
				}
			}
			
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				int ret = 0;
				for(int j = 0; j < M; j++) {
					ret += A[i][j] * B[j]; 
				}
				if(ret + C > 0) {
					count++;
				}
			}
			
			
			System.out.println(count);
		} // Scanner Close
	}
}