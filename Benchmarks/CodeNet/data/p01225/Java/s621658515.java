
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] cards;
	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int T=0;T<t;T++) {
			int[] num = new int[9];
			
			cards = new int[3][9];
			for(int i=0;i<9;i++) num[i] = sc.nextInt();
			
			for(int i=0;i<9;i++) {
				int j=0;
				switch (sc.next().charAt(0)) {
				case 'R': j=0; break;
				case 'G': j=1; break;
				case 'B': j=2; break;
				}
				cards[j][num[i]-1]++;
			}
			System.out.println(dfs(0, 0, 0));
		}
	}
	
	int dfs(int i, int j, int c) {
		int flg = 0;
		if( i == 3 ) {
//			debug(cards);
			if( c == 3) return 1;
			else return 0;
		}
		for(int k=j;k<9;k++) {
			if(cards[i][k] >= 3 ) {
				cards[i][k] -= 3;
				flg |= dfs(i, k, c+1);
				cards[i][k] += 3;
			}
		}
		for(int k=j;k<7;k++) {
			if(cards[i][k] >= 1 && cards[i][k+1] >= 1 && cards[i][k+2] >= 1) {
				cards[i][k] -= 1; cards[i][k+1] -= 1; cards[i][k+2] -= 1;
				flg |= dfs(i, k, c+1);
				cards[i][k] += 1; cards[i][k+1] += 1; cards[i][k+2] += 1;
			}
		}
		flg |= dfs(i+1, 0, c);
		return flg;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}