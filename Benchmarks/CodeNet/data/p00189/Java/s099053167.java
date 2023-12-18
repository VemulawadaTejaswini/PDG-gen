import java.util.*;
import java.awt.Point;

public class Main{
	public static int min;

	public static void dfs(int[][] map,boolean[] u,int s,int g,int cost){
		if(s == g){
			if(cost < min) min = cost;
			return;
		}

		for(int i=0;i<map.length;i++){
			if(i==s) continue;
			if(map[s][i]!=0 && !u[i]){
				u[i] = true;
				dfs(map,u,i,g,cost+map[s][i]);
				u[i] = false;
			}
		}
	}

	public static Point solve(int[][] map,int n){
		int ans=0,ansDist=Integer.MAX_VALUE;

		for(int i=0;i<n;i++){
			int res = 0;
			for(int j=0;j<n;j++){
				if(i==j) continue;
				boolean[] u = new boolean[n];
				u[i] = true;
				min = Integer.MAX_VALUE;
				dfs(map,u,i,j,0);
				res += min;
			}
			if(ansDist>res){ansDist=res; ans=i;}
			else if(ansDist==res && ans>i){ans=i;}
		}
		return new Point(ans,ansDist);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int m = 0;
			int[][] map = new int[10][10];
			while(n-- > 0){
				int s=sc.nextInt(), g=sc.nextInt(), d=sc.nextInt();
				map[s][g] = map[g][s] = d;
				if(m < s) m = s;
				if(m < g) m = g;
			}
			Point p = solve(map,m+1);
			System.out.println(p.x + " " + p.y);
		}
	}
}