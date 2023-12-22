import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int[][] A = new int[N][N];
		for(int i = 0; i < M; i++)
			A[sc.nextInt()-1][sc.nextInt()-1]++;
		int[][] S = new int[N+1][N+1];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				S[i+1][j+1] = S[i][j+1] + S[i+1][j] - S[i][j] + A[i][j];
		for(int i = 0; i < Q; i++) {
			int p = sc.nextInt()-1;
			int q = sc.nextInt();
			System.out.println(S[q][q]+S[p][p]-S[p][q]-S[q][p]);
		}
	}

}