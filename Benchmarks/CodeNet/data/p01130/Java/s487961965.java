import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g1 = sc.nextInt();
			int g2 = sc.nextInt();
			if(n==0 && m==0 && s==0 && g1==0 && g2==0) break;
			
			int[][] cost = new int[n+1][n+1];
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			for(int i=0;i<m;i++) cost[sc.nextInt()][sc.nextInt()] = sc.nextInt();
			for(int i=1;i<=n;i++) cost[i][i] = 0;
			
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					for(int k=1;k<=n;k++){
						if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
							cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
						}
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			for(int i=1;i<=n;i++){
				if(cost[s][i]!=Integer.MAX_VALUE && cost[i][g1]!=Integer.MAX_VALUE && cost[i][g2]!=Integer.MAX_VALUE){
					min = Math.min(min, cost[s][i] + cost[i][g1] + cost[i][g2]);
				}
			}
			System.out.println(min);
		}	
	}	
}