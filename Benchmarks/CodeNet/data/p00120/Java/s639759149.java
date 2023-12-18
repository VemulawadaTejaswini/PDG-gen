import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	public static final double INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			int len = ss.length;
			int box = Integer.parseInt(ss[0]);
			int n = len - 1;
			//System.out.println("n = " + n);
			int[] r = new int[n];
			for(int i = 1; i < len; i++){
				r[i - 1] = Integer.parseInt(ss[i]);
			}
			int max = 1 << n;
			//集合Sが箱に入っていて、nが最後の時の幅の最小値
			double[][] dp = new double[max][n];
			//arg1とarg2を並べた時の幅。2sqrt(a1*a2)
			double[][] width = new double[n][n];
			for(int i = 0; i < n; i++){
				
				for(int j = i + 1; j < n; j++){
					width[i][j] = 2*Math.sqrt(r[i]*r[j]);
					width[j][i] = width[i][j];
				}
			}
			//dp[0][0] = 0;
			//init
			for(double[] a : dp){
				Arrays.fill(a, INF);
			}
			for(int i = 0; i < n; i++){
				dp[1 << i][i] = r[i];
			}
			
			
			for(int i = 1; i < max; i++){
				for(int j = 0; j < n; j++){
					if(dp[i][j] != INF){
						//最小値があれば、新たなケーキを足してみる
						for(int k = 0; k < n; k++){
							//既に使われているか？
							if(((i >> k) & 1) == 0){
								dp[i + (1 << k)][k] = Math.min(dp[i + (1 << k)][k], dp[i][j] + width[j][k]);
							}
						}
					}
				}
			}
			double min = INF;
			//最後に半径を足す
			for(int i = 0; i < n; i++){
				min = Math.min(min, dp[max - 1][i] + r[i]);
			}
			//System.out.println(min);
			System.out.println(min > box? "NA" : "OK");
		}
	}

}