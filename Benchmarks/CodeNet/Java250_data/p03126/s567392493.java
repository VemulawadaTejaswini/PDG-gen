import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] K = new int[N];
		int[][] A = new int[N][M];
		int[] food = new int[M + 1];
		
		for(int i = 0; i < N; i++) {
			K[i] = sc.nextInt();
			for(int j = 0; j < K[i]; j++) {
				A[i][j] = sc.nextInt();
				for(int k = 1; k <= M; k++) {
					if(A[i][j] == k) {
						food[k]++;
					}
				}				
			}			
		}
		
		int sum = 0;
		
		for(int i = 1; i <= M; i++) {
			if(food[i] == N) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
