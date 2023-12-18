import java.util.*;

public class Main {

	char[][] board;
	int N;
	int dx[] = {0,0,1,1,1,-1,-1,-1};
	int dy[] = {1,-1,1,0,-1,1,0,-1};
	int maxDepth;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			board = new char[N][];
			for(int i=0; i<N; i++){
				board[i] = in.next().toCharArray();
			}
			System.out.println(solve());
		}
	}

	boolean dfs(int depth){
		if(depth > maxDepth) return false;
		int x = 0, y = 0;
		boolean foundVirus = false;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(board[i][j] == '#'){
					foundVirus = true;
				}
				else if(board[i][j] == '@'){
					y = i; x = j;
				}
			}
		}
		if(!foundVirus){
			return true;
		}
		char[][] tmp = new char[N][];
		for(int i=0; i<N; i++){
			tmp[i] = board[i].clone();
		}
		for(int k=0; k<8; k++){
			int nx = x + dx[k], ny = y + dy[k];
			if(0<=nx && nx<N && 0<=ny && ny<N && tmp[ny][nx]!='#'){
				tmp[y][x] = '.';
				tmp[ny][nx] = '@';
				for(int i=0; i<N; i++){
					for(int j=0; j<N; j++){
						int cnt = 0;
						for(int kk=0; kk<8; kk++){
							int nny = i + dy[kk], nnx = j + dx[kk];
							if(0<=nny && nny<N && 0<=nnx && nnx<N && tmp[nny][nnx]!='.')
								cnt++;
						}
						if(tmp[i][j] == '.'){
							board[i][j] = (cnt==3?'#':'.');
						}
						else if(tmp[i][j] == '#'){
							board[i][j] = ((cnt==2 || cnt==3)?'#':'.');
						}
						else{
							board[i][j] = '@';
						}
					}
				}
				if(dfs(depth+1)) return true;
				tmp[ny][nx] = '.';
				tmp[y][x] = '@';
			}
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				board[i][j] = tmp[i][j];
			}
		}
		return false;
	}

	int solve(){
		for(maxDepth=0; maxDepth<=11; maxDepth++){
			if(dfs(0)) return maxDepth;
		}
		return -1;
	}

	public static void main(String args[]){
		new Main().run();
	}
}