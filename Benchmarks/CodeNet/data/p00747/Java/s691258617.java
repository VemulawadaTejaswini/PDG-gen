import java.util.Scanner;

public class Main {
	static int w, h, m;
	static int turn=0;
	static int[][] visit=new int[31][31];
	static int[][][][] maze=new int[31][31][31][31];
	static void dfs(int x, int y) {
		turn++;

		if(x==w-1 && y==h-1 && turn<m) {
			m= turn;
		}
		else {
			if(x<w-1 && maze[x][y][x+1][y]!=1 && visit[x+1][y]==0) {
				visit[x][y]=1;
				dfs(x+1, y);
				visit[x][y]=0;
			}
			if(x>=1 && maze[x][y][x-1][y]!=1 && visit[x-1][y]==0) {
				visit[x][y]=1;
				dfs(x-1, y);
				visit[x][y]=0;
			}
			if(y<h-1 && maze[x][y][x][y+1]!=1 && visit[x][y+1]==0) {
				visit[x][y]=1;
				dfs(x, y+1);
				visit[x][y]=0;
			}
			if(y>=1 && maze[x][y][x][y-1]!=1 && visit[x][y-1]==0) {
				visit[x][y]=1;
				dfs(x, y-1);
				visit[x][y]=0;
			}
		}
		turn--;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			w=sc.nextInt();
			h=sc.nextInt();
			if(w==0 && h==0)	break;
			m=901;
			for(int i=0; i<2*h-1; i++) {
				if(i%2==0) {
					for(int j=0; j<w-1; j++) {
						maze[j][i/2][j+1][i/2]=sc.nextInt();
					}
				}
				else {
					for(int j=0; j<w; j++) {
						maze[j][i/2][j][i/2+1]=sc.nextInt();
					}
				}
			}
			dfs(0, 0);
			if(m==901)	System.out.println(0);
			else System.out.println(m);
		}
	}
}
