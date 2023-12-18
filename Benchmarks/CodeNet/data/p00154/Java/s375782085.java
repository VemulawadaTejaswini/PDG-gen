import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int m;
		
		int[] v;
		int[] num;
		int[][] dp;
		int g;
		
		while(true){
			m = scan.nextInt();
			if(m == 0)break;
			
			v = new int[m + 1];
			num = new int[m + 1];
			for(int i = 1; i <= m; i++){
				v[i] = scan.nextInt();
				num[i] = scan.nextInt();
			}
			
			dp = new int[m+1][1001];
			dp[0][0] = 1;
			
			for(int i = 1; i <= m; i++){
				for(int k = 0; k < 1001; k++){
					for(int s = 0; s <= num[i]; s++){
						if(k - v[i] * s < 0)break;
						dp[i][k] += dp[i - 1][k - s * v[i]];
					}
				}
			}
			g = scan.nextInt();
			while(g-- != 0)System.out.println(dp[m][scan.nextInt()]);
		}
	}
}