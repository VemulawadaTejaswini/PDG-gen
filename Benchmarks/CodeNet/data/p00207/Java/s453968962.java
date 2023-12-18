import java.util.*;

class Main {

	static int mat[][] = new int[105][105];

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int w = in.nextInt(), h = in.nextInt();
			if(w==0 && h==0) return ;
			int sx = in.nextInt(), sy = in.nextInt();
			int gx = in.nextInt(), gy = in.nextInt();
			int n = in.nextInt();
			for(int i=0; i<105; i++)
				for(int j=0; j<105; j++)
					mat[i][j] = -1;
			for(int i=0; i<n; i++){
				int c = in.nextInt(), d = in.nextInt(), x = in.nextInt(), y = in.nextInt();
				if(d==1){
					for(int j=0; j<2; j++)
						for(int k=0; k<4; k++)
							mat[x+j][y+k] = c;
				}
				else{
					for(int j=0; j<4; j++)
						for(int k=0; k<2; k++)
							mat[x+j][y+k] = c;
				}
			}
			
			if(mat[sx][sy]==-1){
				System.out.println("NG");
				continue;
			}
			dfs(sx,sy,mat[sx][sy]);
			System.out.println((mat[gx][gy]==-2)?"OK":"NG");
		}
	}
	
	static void dfs(int i, int j, int col){
		if(mat[i][j] != col) return ;
		mat[i][j] = -2;
		dfs(i+1,j,col);
		dfs(i,j+1,col);
		dfs(i-1,j,col);
		dfs(i,j-1,col);
		return ;
	}
	
}