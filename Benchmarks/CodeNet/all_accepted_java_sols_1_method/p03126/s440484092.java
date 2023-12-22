import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N, M, ans=0;
		int Food[][];
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		Food = new int[N+1][M];
		
		for(int i=0; i<M;i++) {
			Food[N][i] = 1;
		}
		
		int A, K;
		for(int i=0; i<N; i++) {
			K = scan.nextInt();
			for(int j=0; j<K; j++) {
				A = scan.nextInt();
				Food[i][A-1] = 1;
			}
		}
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				Food[N][i] *= Food[j][i];
			}
		}
		for(int i=0; i<M; i++) {
			ans += Food[N][i];
		}
		System.out.print(ans);
	}

}
