import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		int[][] B = new int[N][N];
		for(int i = 0; i < N; i++)
			Arrays.fill(B[i], Integer.MAX_VALUE);
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				A[i][j] = sc.nextInt();
		long ans = 0;
		for(int k = 0; k < N; k++)
			for(int i = 0; i < N; i++)
				for(int j = i; j < N; j++) {
					if(k != i && k != j)
						B[i][j] = Math.min(B[i][j], A[i][k] + A[k][j]);
					if(A[i][j] > B[i][j]) {
						System.out.println(-1);
						return;
					}
				}
		for(int i = 0; i < N; i++)
			for(int j = i+1; j < N; j++)
				if(B[i][j] != A[i][j]) 
					ans += A[i][j];
		System.out.println(ans);
	}

}