import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int casenum=0;
			while(sc.hasNext()) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a==0) break;
				int n=sc.nextInt();
				int[][] dp=new int[a+1][b+1];
				for(int i=1; i<=a; i++) {
					for(int j=1; j<=b; j++) {
						dp[i][j]=100000000;
					}
				}
				for(int i=1; i<=a; i++) {
					dp[i][1]=1;
				}
				for(int i=1; i<=b; i++) {
					dp[1][i]=1;
				}
				for(int i=0; i<n; i++) {
					int w=sc.nextInt();
					int h=sc.nextInt();
					dp[w][h]=0;
				}
				for(int i=2; i<=a; i++) {
					for(int j=2; j<=b; j++) {
						dp[i][j]=Math.min(dp[i][j], dp[i][j-1]+dp[i-1][j]);
					}
				}
				System.out.println(dp[a][b]);
			}
		}
	}
} 
