import java.util.Arrays;
import java.util.Scanner;

//Concert Hall Scheduling
public class Main{

	class R implements Comparable<R>{
		int s, t, e;
		public R(int s, int t, int e) {
			this.s = s;
			this.t = t;
			this.e = e;
		}
		public int compareTo(R o) {
			return o.s!=s?o.s-s:o.t-t;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			R[] r = new R[n];
			for(int i=0;i<n;i++)r[i] = new R(sc.nextInt(), sc.nextInt(), sc.nextInt());
			Arrays.sort(r);
			int[][] dp = new int[367][367];
			for(int i=0;i<n;i++){
				int[][] next = new int[367][367];
				for(int j=365;j>0;j--)for(int k=365;k>0;k--){
					int max = dp[j][k];
					if(j<=r[i].s)max = Math.max(max, r[i].e+dp[r[i].t+1][k]);
					if(k<=r[i].s)max = Math.max(max, r[i].e+dp[j][r[i].t+1]);
					next[j][k] = max;
				}
				dp = next;
			}
//			for(int j=M;j>0;j--)for(int k=M;k>0;k--){
//				int max = Math.max(dp[j][k+1], dp[j+1][k]);
//				for(R v:r[j]){
//					max = Math.max(max, dp[v.t+1][k]+v.e);
//				}
//				for(R v:r[k]){
//					max = Math.max(max, dp[j][v.t+1]+v.e);
//				}
//				dp[j][k] = max;
//			}
			System.out.println(dp[1][1]);
//			for(;;){
//				int a = sc.nextInt(), b = sc.nextInt();
//				if((a|b)==0)break;
//				System.out.println("dp["+a+"]["+b+"] DP:" + dp[a][b]);
//			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}