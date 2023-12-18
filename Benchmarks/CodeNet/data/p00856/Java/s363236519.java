
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();

			if(n == 0){
				break;
			}

//			int loseIndex[] = new int[l];
			boolean lose[] = new boolean[n + 1];
			boolean back[] = new boolean[n + 1];

			for(int j = 0; j < l; j++){
//				loseIndex[j] = sc.nextInt();
				lose[sc.nextInt()] = true;
			}

			for(int j = 0; j < b; j++){
				back[sc.nextInt()] = true;
			}

			double[][] dp = new double[t + 1][2*n + 1];
			dp[0][0] = 1;

			for(int i = 0; i < t; i++){
				for(int j = 0; j < 2*n + 1; j++){
					if(j == n){
						dp[i + 1][j] += dp[i][j];
						continue;
					}
					else if(j > n){
						dp[i + 1][j - n] += dp[i][j];
						continue;
					}
					double tmp = dp[i][j] / 6;
					for(int k = 1; k <= 6; k++){
						int next;

						next = j + k;

						if(next > n){
							next = n - (next - n);
						}

						if(lose[next]){
							next += n;
						}
						else if(back[next]){
							next = 0;
						}

						dp[i + 1][next] += tmp;
					}
				}

//				double sum = 0;
//				for(int j = 0; j <= 2*n; j++){
//					sum += dp[i + 1][j];
//				}
//				System.out.println("sum : "+sum);
			}

//			for(int i = 0; i <= t; i++){
//				for(int j = 0; j <= 2*n; j++){
//					System.out.print(dp[i][j]+" ");
//					if(j == n){
//						System.out.print("|");
//					}
//				}
//				System.out.println();
//			}

			System.out.printf("%.6f\n",dp[t][n]);
		}
	}

}

