import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] m = new int[n];
		int[] d = new int[n];
		int[] w = new int[n];
		for(int i=0;i<n;i++){
			m[i] = sc.nextInt();
			d[i] = sc.nextInt();
			w[i] = 20*sc.nextInt();
		}
		
		double[][] dp = new double[1<<n][n];
		int[][] pre = new int[1<<n][n];
		int[][] wgt = new int[1<<n][n];
		for(int i=0;i<(1<<n);i++){
			Arrays.fill(dp[i], -1.0);
			Arrays.fill(pre[i], -1);
			Arrays.fill(wgt[i], -1);
		}
		dp[0][0] = 0;
		
		double q;
		for(int j=0;j<1<<n;j++){
			for(int v=0;v<n;v++){
				if(dp[j][v]>-1){
					for(int u=0;u<n;u++){
						if((j&(1<<u))>0) continue;
						q = dp[j][v] + (double)(Math.abs(d[v]-d[u])*(70+wgt[j][v]))/2000;
						if(dp[j^(1<<u)][u]<=0 || dp[j^(1<<u)][u]>q){
							dp[j^(1<<u)][u] = q;
							pre[j^(1<<u)][u] = v;
							wgt[j^(1<<u)][u] = wgt[j][v] + w[u];
						}
					}
				}
			}
		}

		double min = Integer.MAX_VALUE;
		int num = 0;
		for(int i=0;i<n;i++){
			if(dp[(1<<n)-1][i]>-1 && min>dp[(1<<n)-1][i]){
				min = dp[(1<<n)-1][i];
				num = i;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(m[num]);
		int s = (1<<n)-1;
		while(pre[s][num]!=-1){
			list.add(m[pre[s][num]]);
			int t = s^(1<<num);
			num = pre[s][num];
			s = t;
		}
		
		for(int i=list.size()-2;i>0;i--) System.out.print(list.get(i) + " ");
		System.out.println(list.get(0));
	}	
}