import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0547().doIt();
	}

	class AOJ0547{
//		右向きで曲がれる->0
//		上向きで曲がれる->1
//		右向きで曲がれない->2
//		上向きで曲がれない->3
		int dp[][][],N=101;
		void doIt(){
			dp = new int[101][101][4];
			for(int i=1;i<N;i++){
				dp[0][i][0] = 1;
				dp[i][0][1] = 1;
			}
			for(int y=1;y<N;y++)for(int x=1;x<N;x++){
				dp[y][x][0] = (dp[y][x][0] + dp[y][x-1][0] + dp[y][x-1][2])%100000;
				dp[y][x][1] = (dp[y][x][1] + dp[y-1][x][1] + dp[y-1][x][3])%100000;
				dp[y][x][2] = (dp[y][x][2] + dp[y][x-1][1])%100000;
				dp[y][x][3] = (dp[y][x][3] + dp[y-1][x][0])%100000;
			}
			while(true){
				int w = in.nextInt(),h = in.nextInt();
				if(w+h==0)break;
				int result = 0;
				for(int i=0;i<4;i++)result += dp[h-1][w-1][i];
				System.out.println(result%100000);
			}
		}
	}
}