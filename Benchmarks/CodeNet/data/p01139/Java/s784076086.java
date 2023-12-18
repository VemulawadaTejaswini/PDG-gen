import java.util.Scanner;

public class Main {
	static char board[][];
	static Scanner sc = new Scanner(System.in);
	static int[] vx = new int[]{0,1,0,-1};
	static int[] vy = new int[]{1,0,-1,0};
	static int maxh, maxw;
	static boolean wflag;
	static boolean bflag;
	private static int count;
	private static int wcount = 0;
	private static int bcount = 0;;
	
	public static void main(String[] args) {
        while (true) {
            maxw = sc.nextInt();
            maxh = sc.nextInt();
            if(maxw == 0) break;
            board = new char[maxh][maxw];
            for (int i = 0; i < maxh; i++) {
            	board[i] = sc.next().toCharArray();
            }
            wcount=0;
            bcount=0;
            solve();
            System.out.println(bcount + " " + wcount);
        }
	}

	private static void solve() {
		for (int i = 0; i < maxh; i++) {
			for (int j = 0; j < maxw; j++) {
				if (board[i][j] == '.') {
					count=0;
					wflag = false;
					bflag = false;
					dfs(i, j);
					if (wflag && !bflag) wcount += count;
					if (!wflag && bflag) bcount += count;
				}
			}
		}		
	}

	private static void dfs(int h, int w) {
		board[h][w] = 'X';
		count++;
		for (int i = 0; i < 4; i++) {
				if (h + vx[i] >= maxh || h + vx[i]  < 0 || w + vy[i] >= maxw || w + vy[i] < 0)
					continue;
				char c = board[h + vx[i]][w + vy[i]];
				if (c == 'X') continue;
				if (c == 'W') {
					wflag = true;
					continue;
				}
				if (c == 'B') {
					bflag = true;
					continue;
				}
				dfs(h + vx[i], w + vy[i]);
		}
	}
}