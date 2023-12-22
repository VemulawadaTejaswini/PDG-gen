import java.util.*;
public class Main {
	
	static int h, w;
	static int dp[][][] = new int[81][81][81*160];
	static int maxB = 80 * 160;
	static int A[][] = new int[81][81];
	static int B[][] = new int[81][81];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		w = sc.nextInt();
		
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				A[i][j] = sc.nextInt();
			}
		}
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				B[i][j] = sc.nextInt();
			}
		}
		
		dp[0][1][0] = 1;
		dp[1][0][0] = 1;
	
		for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
				int dif = Math.abs(A[i][j] - B[i][j]);
				for(int k=0;k<=maxB;k++){
					if(dp[i-1][j][k] == 1 || dp[i][j-1][k] == 1){
						dp[i][j][Math.abs(dif - k)] = 1;
						dp[i][j][dif + k] = 1;
					}
				}
			}
			
		}
		
		for(int i=0;i<=maxB;i++){
			if(dp[h][w][i]==1){
				System.out.println(i);
				break;
			}
		}
		
	}
}
