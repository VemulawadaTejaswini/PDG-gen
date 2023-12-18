import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	int W, D;
	int[] ws, ds;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			W = in.nextInt();
			D = in.nextInt();
			if(W==0 && D==0) return ;
			ws = new int[W];
			ds = new int[D];
			for(int i=0; i<W; i++){
				ws[i] = in.nextInt();
			}
			for(int i=0; i<D; i++){
				ds[i] = in.nextInt();
			}
			System.out.println(solve());
		}
	}

	int solve(){
		int[][] board = new int[W][D];
		sort(ws);
		sort(ds);
		board[W-1][D-1] = ws[W-1];

		for(int p=W-2, q=D-2;p>=0 || q>=0;){
			int nw = p>=0?ws[p]:ds[q], nd = q>=0?ds[q]:ws[p];
			if(nw == nd){
				board[max(p,0)][max(q,0)] = nw;
				p--; q--;
			}
			else if(nw > nd){
				board[p][D-1] = nw;
				p--;
			}
			else if(nd > nw	){
				board[W-1][q] = nd;
				q--;
			}
		}

		int ret = 0;
		for(int i=0; i<W; i++){
			for(int j=0; j<D; j++){
				ret += board[i][j];
			}
		}

		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}