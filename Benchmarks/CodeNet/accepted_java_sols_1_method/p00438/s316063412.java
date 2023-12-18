import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0&&h==0)break;
			int n = sc.nextInt();
			
			boolean map[][]=new boolean[w+1][h+1];
			for(int i=0;i<n;i++)map[sc.nextInt()][sc.nextInt()]=true;
			
			
			//今いる場所を記録
			int dp[][]=new int[w+1][h+1];
			dp[1][1]=1;
			for(int i=1;i<=w;i++){
				for(int j=1;j<=h;j++){
					if(map[i][j]){
						dp[i][j]=0;
					}else if(i==1&&j==1){
						dp[i][j]=1;
					}else if(i==1){
						dp[i][j]=dp[i][j-1];
					}else if(j==1){
						dp[i][j]=dp[i-1][j];
					}else{
						dp[i][j]=dp[i][j-1]+dp[i-1][j];
					}				
					//System.out.println(i+""+j+" "+dp[i][j-1]+" "+dp[i-1][j]+" "+dp[i][j]);
				}
			}
			System.out.println(dp[w][h]);
		}
	}
}