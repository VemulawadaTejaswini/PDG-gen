import java.util.Scanner;

public class Main {
	
	static int N, M;
	static char[][] maze=new char[51][51];
	static int[] dx= {-1, 0, 1, 0, 0};
	static int[] dy= {0, 1, 0, -1, 0};

//	static int count=0;
//	static boolean dfs(int x, int y) {
//		if(x>=0 && x<N && y>=0 && y<M && maze[0][M-1]=='.' && maze[x][y]!='v') {
//			if(count==0) 	maze[x][y]='.';
//			else  			maze[x][y]='v';
//			count++;
//			if(x==0) {
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1)) return true;
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y)) return true;
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y)) return true;
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1))return true;
//			}
//			else {
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y) )return true;
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1))return true;
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y)) return true;
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1)) return true;
//			}
//		}
//		else if(x>=0 && x<N && y>=0 && y<M && maze[N-1][M-1]=='.' && maze[x][y]!='v') {
//			maze[x][y]='v';
//			count++;
//			if(y==M-1) {
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y)) return true;
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1)) return true;
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1)) return true;
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y)) return true;
//			}
//			else {
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1)) return true;
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y)) return true;
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1)) return true;
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y)) return true;
//			}
//		}
//		else if(x>=0 && x<N && y>=0 && y<M && maze[N-1][0]=='.' && maze[x][y]!='v') {
//			maze[x][y]='v';
//			count++;
//			if(x==N-1) {
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1)) return true;
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y)) return true;
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y)) return true;
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1)) return true;
//			}
//			else {
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y)) return true;
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1)) return true;
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y)) return true;
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1)) return true;
//			}
//		}
//		else if(x>=0 && x<N && y>=0 && y<M && maze[0][0]=='.' && maze[x][y]!='v') {
//			maze[x][y]='v';
//			count++;
//			if(y==0) {
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y))return true;
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1))return true;
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1))return true;
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y))return true;
//			}
//			else {
//				if(y>0 && maze[x][y-1]=='.' && dfs(x, y-1))return true;
//				if(x>0 && maze[x-1][y]=='.' && dfs(x-1, y))return true;
//				if(y<M-1 && maze[x][y+1]=='.' && dfs(x, y+1))return true;
//				if(x<N-1 && maze[x+1][y]=='.' && dfs(x+1, y))return true;
//			}
//		}
//		if(maze[0][0]=='.' || maze[0][M-1]=='.' || maze[N-1][M-1]=='.'||maze[N-1][0]=='.') {
//			return false;
//		}
//		return true;
//	}//全部でやっちゃうと戻ったときにそれまでの状態も戻るから大変
	
	static boolean dfs(int i, int j,int d, int gi, int gj) {
		if(gi==i && gj==j) {
			return true;
		}
		for(int k=-1; k<3; k++) {
			int x=i+dx[(k+d+4)%4];
			int y=j+dy[(k+d+4)%4];
			if(0<=x && x<N && 0<=y && y<M && maze[x][y]=='.') {
				maze[x][y]='#';
				if(dfs(x, y, (k+d+4)%4, gi, gj)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				N=sc.nextInt();
				M=sc.nextInt();
				if(N+M==0) break;
				for(int i=0; i<N; i++) {
					String str=sc.next();
					for(int j=0; j<M; j++) {
						maze[i][j]=str.charAt(j);
					}
				}
				if(dfs(0, 0, 1, 0, M-1) && dfs(0, M-1, 2, N-1, M-1) && dfs(N-1, M-1, 3, N-1, 0) && dfs(N-1, 0, 0, 0, 0)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			
		}
	}
}
