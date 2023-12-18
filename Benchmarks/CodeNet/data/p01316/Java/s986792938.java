import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	//コードの最大値 + 1
	public static final int MAX = 256;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		//size of input
		int n = sc.nextInt();
		//size of codeBook
		int m = sc.nextInt();
		while(n != 0){
			int[] codeBook = new int[m];
			for(int i = 0; i < m; i++){
				codeBook[i] = sc.nextInt();
			}
			int []input = new int[n];
			for(int i = 0; i < n; i++){
				input[i] = sc.nextInt();
			}
//			int result = DP(0, 0, max, 128);
//			System.out.println(result);
			int[][] dp = new int[2][MAX];
			int using = 0;
			int used = 1;
			for(int j = 0; j < MAX; j++){
				dp[used][j] = -1;
			}
			dp[used][128] = 0;
			for(int i = 0; i < n; i++){
				//まず、使う配列の初期化
				for(int j = 0; j < MAX; j++){
					dp[using][j] = -1;
				}
				for(int j = 0; j < MAX; j++){
					if(dp[used][j] != -1){
						for(int k = 0; k < m; k++){
							int tar = j + codeBook[k];
							if(0 > tar){
								tar = 0;
							}
							else if(tar >= MAX){
								tar = MAX - 1;
							}
							int tmp = tar - input[i];
							int temp = dp[used][j] + tmp*tmp;
							//System.out.println("tmp = " + tmp + ", temp = " + temp);
							if(dp[using][tar] == -1 || dp[using][tar] > temp){
								dp[using][tar] = temp;
							}
						}
					}
				}
				//usedとusingの入れ替え
				int tmp = using;
				using = used;
				used = tmp;
			}
			int min = (255*2)*(255*2)*20000;
			for(int j = 0; j < MAX; j++){
				if(dp[used][j] != -1 && min > dp[used][j]){
					min = dp[used][j];
				}
			}
			//minimumは？
			//結果はdp[used][n]?
			System.out.println(min);

			n = sc.nextInt();
			m = sc.nextInt();
		}

	}
}