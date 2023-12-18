import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[][] cost = new int[m+1][m+1];
			int[][] time = new int[m+1][m+1];
			for(int i=0;i<=m;i++){
				for(int j=0;j<=m;j++){
					cost[i][j] = Integer.MAX_VALUE;
					time[i][j] = Integer.MAX_VALUE;
				}
			}
			int a, b, c, d;
			for(int i=0;i<n;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
				time[a][b] = d;
				time[b][a] = d;
			}
			for(int i=0;i<=m;i++){
				cost[i][i] = 0;
				time[i][i] = 0;
			}
			
			for(int i=0;i<=m;i++){
				for(int j=0;j<=m;j++){
					for(int k=0;k<=m;k++){
						if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
							cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
						}
						if(time[j][i]!=Integer.MAX_VALUE && time[i][k]!=Integer.MAX_VALUE){
							time[j][k] = Math.min(time[j][k], time[j][i]+time[i][k]);
						}
					}
				}
			}
			
			int q = sc.nextInt();
			for(int i=0;i<q;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				if(c==0) System.out.println(cost[a][b]);
				else System.out.println(time[a][b]);
			}
		}
	}	
}