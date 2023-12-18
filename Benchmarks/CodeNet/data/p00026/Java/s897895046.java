import java.util.*;

class Main {

	static int board[][] = new int[10][10];
	static int dx[] = {1,0,-1,0,1,-1,-1,1,2,0,-2,0};
	static int dy[] = {0,1,0,-1,1,1,-1,-1,0,2,0,-2};
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		in.useDelimiter("[,{\\n}]");
		while(in.hasNext()){
			sub(in.nextInt(), in.nextInt(), in.nextInt());
		}
		int cnt=0, best=0;
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(board[i][j]==0) cnt++;
				else if(board[i][j] > best) best=board[i][j];
			}
		}
		
		System.out.println(cnt);
		System.out.println(best);
	}
	
	private static void sub(int x, int y, int s){
		if(x<0 || x>=10 || y<0 || y>=10) return ;
		board[x][y]++;
		for(int i=0; i<((s==0)?0:(s==1)?4:(s==2)?8:12);i++){
			sub(x+dx[i], y+dy[i], 0);
		}
		return ;
	}
}