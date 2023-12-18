import java.util.Scanner;

public class Main{

	int[][] board;

	void run(){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i=0; i<N; i++){
			board = new int[5][5];
			for(int j=0; j<5; j++){
				for(int k=0; k<5; k++){
					board[j][k] = in.nextInt();
				}
			}
			System.out.println(solve());
		}
	}

	int solve(){
		int ret = 0;
		for(int lx=0; lx<5; lx++)for(int ux=lx+1; ux<=5; ux++)
			for(int ly=0; ly<5; ly++)for(int uy=ly+1; uy<=5; uy++){
				int tar = (ux-lx)*(uy-ly);
				if(tar > ret){
					int cnt = 0;
					for(int i=lx; i<ux; i++){
						for(int j=ly; j<uy; j++){
							cnt += board[i][j];
						}
					}
					if(cnt == tar){
						ret = tar;
					}
				}
			}
		
		return ret;
	}

	public static void main(String[] args){
		new Main().run();
	}
}