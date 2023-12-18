import java.util.*;
public class Main{
	static int n;
	static int m;
	static int[][] table = new int[9][9];
	static int ans;
	static boolean check(int team){
		int win = 0;
		int lose = 0;
		for(int i=0; i<n; i++){
			if(table[team][i]>0)win++;
			else if(table[team][i]<0)lose++;
		}
		return win <= (n-1)/2 & lose <= (n-1)/2;
	}

	static void dfs(int cnt){
		if(cnt==n*n){
			ans++;
			return;
		}
		int team = cnt / n;
		int against = cnt % n;
		if(table[team][against]==2 || table[team][against]==-2 || team>=against){
			if(check(team))dfs(cnt+1);
			return;
		}
		
			table[team][against] = 1;
			table[against][team] = -1;
			if(check(team))dfs(cnt+1);
	
			table[team][against] = -1;
			table[against][team] = 1;
			if(check(team))dfs(cnt+1);

			table[team][against] = 0;
			table[against][team] = 0;
			return;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n!=0){
			m = sc.nextInt();
			for(int i=0; i<9; i++){
				Arrays.fill(table[i], 0);
			}
			for(int i=0; i<m; i++){
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				table[x][y] = 2;
				table[y][x] = -2;
			}
			ans = 0;
			dfs(0);
			System.out.println(ans);
			n = sc.nextInt();
		}
	}
}
