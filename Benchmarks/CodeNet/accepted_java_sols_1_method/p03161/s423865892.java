import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			int N = scan.nextInt();
			int K = scan.nextInt();
			long[]h = new long[N];
			for(int i = 0;i<N;i++)h[i] =scan.nextLong();

			long[]dp = new long[N+1];

			for(int i = 1;i<N;i++) {
				if(i-K>=0){
					long dpcost = Long.MAX_VALUE;
					int dpnum = 0;
					for(int j = 1;j<=K;j++) {
						if(dpcost>dp[i-j]+Math.abs(h[i]-h[i-j])) {
							dpcost = dp[i-j]+Math.abs(h[i]-h[i-j]);
							dpnum = j;
						}
					}

					dp[i] =dpcost;

				}else {
					long dpcost = Long.MAX_VALUE;
					int dpnum = 0;
					for(int j = 1;j<=i;j++) {
						if(dpcost>dp[i-j]+Math.abs(h[i]-h[i-j])) {
							dpcost = dp[i-j]+Math.abs(h[i]-h[i-j]);
							dpnum = j;
						}

					}


					dp[i] =dpcost;

				}
			}

			System.out.println(dp[N-1]);





		}


	}


}
