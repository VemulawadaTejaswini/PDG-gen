import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int W = scan.nextInt();
			int[]w = new int[N];
			int[]v = new int[N];
			for(int i = 0;i<N;i++) {
				w[i] = scan.nextInt();
				v[i] = scan.nextInt();
			}

			long[][]dp = new long[N][W+1];

			long goukei = 0;


			for(int i = 0;i<=W;i++) {
				if(i-w[0]>=0) {
					dp[0][i] = v[0];
				}
			}

			for(int z = 0;z<=W;z++) {
				for(int i = 1;i<N;i++) {
					if(z-w[i]>=0) {
						dp[i][z] = Math.max(dp[i-1][z-w[i]]+v[i], dp[i-1][z]);
					}else {
						dp[i][z] = dp[i-1][z];
				}
			}
			}

			/*
			for(int i = 0;i<=W;i++) {
				for(int j = 0;j<N;j++) {
					System.out.print(dp[j][i]+" ");
				}
				System.out.println();
			}
			*/


			System.out.println(dp[N-1][W]);


		}


	}


}
