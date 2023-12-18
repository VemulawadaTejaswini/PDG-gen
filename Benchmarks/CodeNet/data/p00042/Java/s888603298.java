import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);
		for(int c=1;;c++){
			int W = scan.nextInt();
			if(W==0)
				break;
			int N = scan.nextInt();
			int[] v = new int[N];
			int[] w = new int[N];
			for(int i=0;i<N;i++){
				String[] t = scan.next().split(",");
				v[i]=Integer.parseInt(t[0]);
				w[i]=Integer.parseInt(t[1]);
			}

			int[][] dp = new int[N+1][W+1];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= W; j++) {
					dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j]);
					if(j+w[i]<=W){
						dp[i+1][j+w[i]]=dp[i][j]+v[i];
					}
				}
			}

			int p=0;
			for(int j=0;j<=W;j++){
				if(dp[N][j]>dp[N][p])
					p=j;
			}

			System.out.println("Case "+c+":");
			System.out.println(dp[N][p]);
			System.out.println(p);
		}
	}

}