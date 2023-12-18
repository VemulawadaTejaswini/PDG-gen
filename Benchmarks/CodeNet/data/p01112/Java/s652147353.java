import java.util.Scanner;

public class Main {
	static int n;
	static int[] win;
	static int wincount=0;
	static int dfs(int[][] map, int x, int y, int r) {
		map[x][y]=r;//勝ち2　負け1　まだ0
		map[y][x]=3-r;
		for(int i=1; i<=n; i++) {
			win[i]=0;
			for(int j=1; j<=n; j++) {
				if(map[i][j]==2) {
					win[i]++;
				}
			}
			if(win[i]>wincount) {
				return 0;
			}
		}
		//System.out.println("dfs後　"+"x="+x+" y="+y+" r="+r+" win["+x+"]="+win[x]);
		int count=0;
		int ai=0, aj=0;
		boolean box=false;//空欄ありtrue なしfalse
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) continue;
				if(map[i][j]==0) {
					box=true;
					ai=i;
					aj=j;
					break;
				}
			}
			if(box) break;
		}
		if(! box) {
			for(int i=1; i<=n; i++) {
				//System.out.println("win["+i+"]="+win[i]);
				if(win[i]!=wincount) {
					return 0;
				}
			}
			return 1;
		}
		int[][] cmap=new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				cmap[i][j]=map[i][j];
			}
		}
		
		count+=dfs(cmap, ai, aj, 2);
		//win[ai]--;
		//System.out.println("ai後　win["+ai+"]="+win[ai]);
		count+=dfs(cmap, ai, aj, 1);
		//win[aj]--;
		//System.out.println("aj後　win["+aj+"]="+win[aj]);
		
		return count;
		
		
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				n=sc.nextInt();
				if(n==0) break;
				int m=sc.nextInt();
				int[][] p=new int[n+1][n+1];
				win=new int[n+1];
				for(int i=0; i<m; i++) {
					int x=sc.nextInt();
					int y=sc.nextInt();
					p[x][y]=2;
					p[y][x]=1;
					win[x]++;
				}
				wincount=(n-1)/2;
				System.out.println(dfs(p, 1, 1, 0));
			}


		}
	}
}
