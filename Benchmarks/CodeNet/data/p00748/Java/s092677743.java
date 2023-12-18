import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int MAX = 1000000;
	static int[][] dp = new int[2][MAX];
	
	// nを表す必要な正四面体の最小個数を返す
	static int Search(int k, int n){
		// 計算されている
		if(dp[k][n]!=-1){
			return dp[k][n];
		}
		// 再帰によりnを減らすので0の終了条件
		else if(n==0){
			return 0;
		}
		// 最大値で初期化
		int min = Integer.MAX_VALUE;
		// 1番目の正四面体から順にひたすら
		for(int i=1;;i++){
			// i 番目の正四面体における粒の数は j
			int j = i*(i+1)*(i+2)/6;
			// 求めたい整数より粒が多い
			if(j>n){
				break;
			}
			// 奇数判定時、正四面体の数が偶数
			else if(k==1&&j%2==0){
				continue;
			}
			// 再帰呼び出し
			// 　整数nからj個引いた整数において
			// 　　必要な正四面体の最小の個数を
			// 　　　Search(k,n-j)で呼び出す
			// 　　　　+1はその結果に対してj個足した
			// 　　　　　正四面体1個を意味する
			min = Math.min(min, Search(k,n-j)+1);
		}
		// 整数nの最小個数が求まったので登録
		dp[k][n] = min;
		// 最小値を返す
		return min;
	}
	
	static void dp(){
		// 整数 i を小さいのから順に
		// 　必要な正四面体の最小個数を調べる
		for(int i=0;i<MAX;i++){
			Search(0,i);
			Search(1,i);		// 奇数
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		for(int i=0;i<2;i++){
			Arrays.fill(dp[i], -1);
		}
		dp();
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			System.out.println(dp[0][n]+" "+dp[1][n]);
		}
	}
}