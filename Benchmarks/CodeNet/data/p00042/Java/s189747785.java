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
			int[][] dpw = new int[N+1][W+1];
			for(int j=0; j<=W;j++)
				dpw[N][j]=dp[N][j]=0;

			for(int i=N-1;i>=0;i--){
				for(int j=0;j<=W;j++){
					if(w[i]>j){
						dp[i][j]=dp[i+1][j];
					}
					else{
						int a = dp[i+1][j];
						int b = dp[i+1][j-w[i]]+v[i];
						if(a==b){
							dp[i][j]=a;
							dpw[i][j]=Math.min(dpw[i+1][j], dpw[i+1][j-w[i]]+w[i]);
						}
						if(a>b){
							dp[i][j]=a;
							dpw[i][j]=dpw[i+1][j];
						}
						if(a<b){
							dp[i][j]=b;
							dpw[i][j]=dpw[i+1][j-w[i]]+w[i];
						}
					}
				}
			}

			System.out.println("Case "+c+":");
			System.out.println(dp[0][W]);
			System.out.println(dpw[0][W]);
		}
	}

}