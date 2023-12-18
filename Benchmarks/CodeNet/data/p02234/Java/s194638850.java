import java.util.Scanner;

class Main{
	
	static int getAns(int[] r,int[] c,int n){
		int[][] dp=new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=i;j<n;j++)
				dp[i][j]=Integer.MAX_VALUE;
		
		
		int i=0; int j=0;
		
		for(int sj=0;sj<n;sj++){
			i=0; j=sj;
			for(int k=0;k<n-sj;k++){
				if(i==j)
					dp[i][j]=0;
				else{
					for(int m=i;m<j;m++){
						dp[i][j]=Math.min(dp[i][j],dp[i][m]+dp[m+1][j]+r[i]*c[m]*c[j]);
					}
				}
				i++; j++;
			}
		}
		
		
		return dp[0][n-1];
	}
				
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] r=new int[n];
		int[] c=new int[n];
		
		for(int i=0;i<n;i++){
			r[i]=scan.nextInt();
			c[i]=scan.nextInt();
		}
		
		System.out.println(getAns(r,c,n));
		
	}
}
		
