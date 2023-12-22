import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] dp=new int[W+1];
		for(int i=0; i<=W; i++) {
			dp[i]=-1;		//この重さでは価値がない（荷物を組み合わせてこの重さを作り出すことができない）
		}
		dp[0]=0;	//重さ0で価値0は作り出せる
		int[][] products=new int[N][2];
		for(int i=0; i<N; i++) {
			products[i][0]=sc.nextInt();//価値
			products[i][1]=sc.nextInt();//重さ
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<=W-products[i][1]; j++) {
				if(dp[j]==-1) {
					continue;
					//組み合わせても特定の重さにならないときは、商品の詰合せができないので0
				}
				else {
					dp[j+products[i][1]]=Math.max(dp[j+products[i][1]], dp[j]+products[i][0]);		//同じ商品を何個でも購入できるので、そのままDPテーブルを更新し続ければいいだけなので
					//わざわざ2次元のdpテーブルではなく、即時に更新できる1次元DPテーブルを使う.
				}
			}
		}
		int max=0;
		for(int i=0; i<=W; i++) {
			max=Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}

