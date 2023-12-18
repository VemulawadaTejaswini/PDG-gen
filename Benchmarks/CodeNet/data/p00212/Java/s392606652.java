import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int c = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt()-1;
			int d = sc.nextInt()-1;
			if(c==0 && n==0 && m==0 && s==-1 && d==-1) break;
			
			int[][] f = new int[n][n];
			for(int i=0;i<n;i++) Arrays.fill(f[i], Integer.MAX_VALUE);
			for(int i=0;i<m;i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				f[a][b] = sc.nextInt();
				f[b][a] = f[a][b];
			}
			
			int[][] dp = new int[c+1][n]; //ticket & city
			for(int i=0;i<=c;i++) Arrays.fill(dp[i], Integer.MAX_VALUE);

			ArrayDeque<Integer> q = new ArrayDeque<Integer>(); //ticket
			ArrayDeque<Integer> p = new ArrayDeque<Integer>(); //city
			q.offer(c);
			p.offer(s);
			dp[c][s] = 0;
			while(q.size()!=0){
				int x = q.poll();
				int y = p.poll();
				for(int i=0;i<n;i++){
					if(f[y][i]==Integer.MAX_VALUE) continue;
					if(x>0 && dp[x-1][i] > dp[x][y]+f[y][i]/2){
						dp[x-1][i] = dp[x][y]+f[y][i]/2;
						q.offer(x-1);
						p.offer(i);
					}
					if(dp[x][i] > dp[x][y]+f[y][i]){
						dp[x][i] = dp[x][y]+f[y][i];
						q.offer(x);
						p.offer(i);
					}
				}
			}
			
			int ans = Integer.MAX_VALUE;
			for(int i=0;i<=c;i++) ans = Math.min(ans, dp[i][d]);
			System.out.println(ans);
		}
	}	
}