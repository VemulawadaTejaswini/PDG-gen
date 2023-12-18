import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Oil Company
public class Main{

	@SuppressWarnings("unchecked")
	void run(){
		Set<Integer>[] valid = new Set[21];
		for(int L=1;L<=20;L++){
			valid[L] = new HashSet<Integer>();
			for(int S=0;S<1<<L;S++){
				boolean ok = true;
				for(int j=0;j+1<L;j++)if(((S>>j)&1)>0 && ((S>>(j+1))&1)>0)ok = false;
				if(ok)valid[L].add(S);
			}
		}
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] dp = new int[2][1<<20];
		StringBuilder sb = new StringBuilder();
		for(int CASE=1;CASE<=T;CASE++){
			int w = sc.nextInt(), h = sc.nextInt();
			int[][] a = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)a[i][j]=sc.nextInt();
			int mask = (1<<w)-1, x = 0, bit = 1<<(w-1);
			for(int[]d:dp)Arrays.fill(d, 0);
			for(int i=0;i<h;i++)for(int j=0;j<w;j++,x=1-x){
				Arrays.fill(dp[x], 0);
				for(int S:valid[w]){
					int ns = (S<<1)&mask;
					dp[x][ns] = Math.max(dp[x][ns], dp[1-x][S]);
					if((S&bit)==0 && (j==0||(S&1)==0))dp[x][ns|1] = Math.max(dp[x][ns|1], dp[1-x][S]+a[i][j]);
					else dp[x][ns] = Math.max(dp[x][ns], dp[1-x][S]);
				}
			}
			int res = 0;
			for(int S:valid[w])res = Math.max(res, dp[1-x][S]);
			sb.append("Case "+CASE+": "+res+"\n");
		}
		System.out.print(sb);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}