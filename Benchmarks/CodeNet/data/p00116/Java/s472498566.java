import java.util.*;

public class Main {

	char[][] board;
	int W, H;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			H = in.nextInt();
			W = in.nextInt();
			if(H==0 && W==0) return ;
			board = new char[H][];
			for(int i=0; i<H; i++){
				board[i] = in.next().toCharArray();
			}
			System.out.println(solve());
		}
	}

	int solve(){
		int[][] accum = new int[H][W+1];
		int ans = 0;
		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++){
				accum[i][j+1] = accum[i][j] + (board[i][j]=='*'?1:0);
			}
		}
		for(int j=0; j<W; j++)for(int k=j+1; k<=W; k++){
			int len = 0, cur=0;
			for(int i=0; i<H; i++){
				if(accum[i][k] - accum[i][j] == 0){
					cur++;
				}
				else{
					cur = 0;
				}
				if(len < cur){
					len = cur;
				}
			}
			ans = Math.max(ans, (k-j)*len);
		}
		return ans;
	}

	public static void main(String args[]){
		new Main().run();
	}
}