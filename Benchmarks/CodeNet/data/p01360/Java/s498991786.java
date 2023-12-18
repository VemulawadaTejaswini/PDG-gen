import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new C(), "RUN", STACK_SIZE).start();
	}
	
	class C implements Runnable{
		C(){}
		@Override public void run(){
			while(sc.hasNext()){
				line=sc.next();
				if(line.equals("#"))	break;
				solve();
			}
		}
		
		String line;
		
		void solve(){
			int LEN=line.length();
			int[] arrow=new int[LEN+1];
			for(int i=1; i<=LEN; i++)	arrow[i]=line.charAt(i-1)-'0';
			int[] v={-1,0,1,2,0,-1,2,0,1,2};
			
			int[][][][] dp=new int[LEN+1][3][3][2];
			for(int i=0; i<=LEN; i++)for(int j=0; j<3; j++)for(int k=0; k<3; k++)for(int m=0; m<2; m++)	dp[i][j][k][m]=1<<29;
			dp[0][0][0][0]=0;
			dp[0][0][0][1]=0;
			
			for(int i=0; i<LEN; i++){
				for(int r=0; r<3; r++){
					for(int l=0; l<3; l++){
						int d=v[arrow[i+1]];
						
						// right
						if(l<=d){
							dp[i+1][d][l][0]=min(dp[i+1][d][l][0], min(dp[i][r][l][1], dp[i][r][l][0]+1));
						}
						
						// left
						if(d<=r){
							dp[i+1][r][d][1]=min(dp[i+1][r][d][1], min(dp[i][r][l][0], dp[i][r][l][1]+1));
						}
					}
				}
			}
			
			int ans=1<<29;
			for(int r=0; r<3; r++)for(int l=0; l<3; l++)for(int i=0; i<2; i++)ans=min(ans,dp[LEN][r][l][i]);
			
			System.out.println(ans);
		}
	}
}