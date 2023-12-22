import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int[] F = new int[M];
		for(int i = 0;i < N;i++) {
			int K = scn.nextInt();
			for(int j = 0;j < K;j++) {
				F[scn.nextInt()-1] ++;
			}
		}
		int ans = 0;
		for(int i = 0;i < M;i++) {
			if(F[i] == N)ans++;
		}
		System.out.println(ans);
	}

}
