import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		for(;;){
			int a = sc.nextInt(),b=sc.nextInt();
			if(a+b==0)break;
			int[][]dp = new int[a+2][b+2];
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				dp[x][y]=-1;
			}
			dp[0][0]=1;
			for(int i=0;i<a;i++){
				for(int j=0;j<b;j++){
					if(dp[i][j]==-1)continue;
					if(dp[i+1][j]!=-1)
						dp[i+1][j]+=dp[i][j];
					if(dp[i][j+1]!=-1)
						dp[i][j+1]+=dp[i][j];
				}
			}
			System.out.println(dp[a-1][b-1]);
		}

	}
}