import java.util.*;

class Main {

	static boolean touched[][] = new boolean[55][55];
	static char board[][] = new char[55][55];
	static int owner[][] = new int[55][55];
	static int w, h;
	static int dx[] = {1,0,-1,0}, dy[] = {0,1,0,-1};

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			w = in.nextInt();
			h = in.nextInt();
			for(int i=0; i<55; i++)for(int j=0; j<55; j++){
				board[i][j] = '@';
				owner[i][j] = 0;
			}
			for(int i=0; i<h; i++){
				String str = in.next();
				for(int j=0; j<w; j++){
					board[i][j] = str.charAt(j);
				}
			}
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(board[i][j] != '.'){
						for(int ii=0; ii<h; ii++)for(int jj=0;jj<w;jj++) touched[ii][jj] = false;
						for(int k=0; k<4; k++)dfs(j+dx[k], i+dy[k], board[i][j]);
					}
				}
			}
			int black = 0, white = 0;
			for(int i=0; i<h; i++)
				for(int j=0; j<w; j++)
					if(owner[i][j]==1) black++;
					else if(owner[i][j]==2) white++;
			
			System.out.println(black + " " + white);
		}
	}
	
	static void dfs(int x, int y, char c){
		if(x<0 || w<=x || y<0 || h<=y) return ;
		touched[y][x] = true;
		if(board[y][x]=='.'){
			owner[y][x] |= (c=='B')?1:2;
			for(int i=0; i<4; i++){
				if(!(x+dx[i]<0 || w<=x+dx[i] || y+dy[i]<0 || h<=y+dy[i]) && !touched[y+dy[i]][x+dx[i]]){
					dfs(x+dx[i], y+dy[i], c);
				}
			}
		}
		return ;
	}

}