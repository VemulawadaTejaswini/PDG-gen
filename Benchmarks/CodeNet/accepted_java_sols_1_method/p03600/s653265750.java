import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long[][] A = new long[N][N];
		long ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				A[i][j] = sc.nextLong();
				ans += A[i][j];
			}
		}

		//2点間がつながっているか
		boolean[][] connected = new boolean[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(connected[i], true);
		}
		for(int i=0; i<N; i++) {
			connected[i][i] = false;
		}

		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					//別の経由地を通ったほうが距離が短くなる場合
					if(A[i][j] > A[i][k] + A[k][j]) {
						System.out.println(-1);
						return;
					}
					//別の経由地を通っても最短距離になる場合
					else if(connected[i][j] && i != k && j != k && A[i][j] == A[i][k] + A[k][j]) {
						ans -= A[i][j];
						connected[i][j] = false;	//2重で引くのを防ぐ
					}
				}
			}
		}

		//無向グラフなので2で割る
		ans /= 2;

		System.out.println(ans);

	}

}
