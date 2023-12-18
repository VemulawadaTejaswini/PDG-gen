import java.util.Scanner;
public class Main {
	boolean[][] board;
	int[] fdx = new int[]{1, -1, 0, 0};
	int[] fdy = new int[]{0, 0, -1, 1};

	void dfs(int x, int y) {
		if(x < 0 || y < 0 || x >= 12 || y >= 12) return;
		if(!board[x][y]) return;
		if(board[x][y]) board[x][y] = false;
		for(int r = 0; r < fdx.length; r++) {
			dfs(x + fdx[r], y + fdy[r]);
		}
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			board = new boolean[12][12];
			for(int r = 0; r < 12; r++) {
				String input = stdIn.next();
				for(int c = 0; c < 12; c++) {
					if(input.charAt(c) == '1') board[r][c] = true;
				}
			}
			int count = 0;
			while(true) {
				boolean flag = false;
				for(int r = 0; r < 12; r++) {
					for(int c = 0; c < 12; c++) {
						if(board[r][c]) {
							flag = true;
							dfs(r, c);
							count++;
							break;
						}
						if(flag) break;
					}
				}
				if(!flag) break; //見つからなかったら既に探索が完了している。
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}