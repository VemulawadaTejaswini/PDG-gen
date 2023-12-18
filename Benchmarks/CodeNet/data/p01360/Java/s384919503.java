import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		//final long STACK_SIZE=8*1024*1024;
		//new Thread(null, new C(), "RUN", STACK_SIZE).start();
		new C();
	}
	
	class C{
		C(){
			while(sc.hasNext()){
				line=sc.next();
				if(line.equals("#"))	break;
				solve();
			}
		}
		
		String line;
		
		void solve(){
			int LEN=line.length();
			int[] v={-1,0,1,2,0,-1,2,0,1,2};
			
			int[][][][] dp=new int[2][3][3][2];
			for(int i=0; i<2; i++)for(int j=0; j<3; j++)for(int k=0; k<3; k++)for(int m=0; m<2; m++)	dp[i][j][k][m]=1<<29;
			dp[1][2][0][0]=0;
			dp[1][2][0][1]=0;
			
			for(int i=0; i<LEN; i++){
				int idx=i%2,last=(idx==0?1:0),d=v[line.charAt(i)-'0'];
				
				for(int r=0; r<3; r++)for(int l=0; l<3; l++){
					
					// right
					if(l<=d || i==0){
						dp[idx][d][l][0]=min(dp[idx][d][l][0], min(dp[last][r][l][1], dp[last][r][l][0]+1));
					}
					
					// left
					if(d<=r){
						dp[idx][r][d][1]=min(dp[idx][r][d][1], min(dp[last][r][l][0], dp[last][r][l][1]+1));
					}
				}
				
				for(int r=0; r<3; r++)for(int l=0; l<3; l++)for(int j=0; j<2; j++)dp[last][r][l][j]=1<<29;
			}
			
			int ans=1<<29;
			for(int r=0; r<3; r++)for(int l=0; l<3; l++)for(int i=0; i<2; i++)ans=min(ans,dp[LEN%2==0?1:0][r][l][i]);
			
			System.out.println(ans);
		}
	}
}