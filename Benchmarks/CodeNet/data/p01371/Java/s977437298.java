import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		doIt();

	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n != 0){
			int[][] time = new int[n][n + 1];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n + 1; j++){
					time[i][j] = sc.nextInt();
				}
			}
			int max = (int)Math.pow(2, n);
			//bitDP i番目のフラグが立っていたらi番目はクリア済み
			//集合iをクリア出来る最短時間
			int[] dp = new int[max];
			dp[0] = 0;
			for(int i = 1; i < max; i++){
				//dp[i] = 1個をiに含まれていない
				int m = INF;
				for(int j = 0; j < n; j++){
					//maskステージをクリアしていないとする
					int mask = 1 << j;
					//ビットを1個消してみる
					if((i & mask) == mask){
						int min = time[j][0];
						for(int k = 0; k < n; k++){
							int m2 = 1 << k;
							//消したステージをクリア済みだったら
							if((m2 & (i & ~mask)) == m2){
								min = Math.min(min, time[j][k + 1]);
							}
						}
						m = Math.min(m,dp[(i & ~mask)] + min);
					}
				}
				dp[i] = m;
			}
			System.out.println(dp[max - 1]);
			
			n = sc.nextInt();
			
		}
	}
}