import java.util.*;

public class Main {

	static int H;
	static int W;
	static char[][] map;

	// この問題の場合、H=100,W=100で最高10000回再帰するが、それをやるとStackOverFlowエラーになる
	// dfsを再帰で書かないプログラムが必要

	static void dfs(int y, int x, char c) { // cと同じ文字のところを塗りつぶし的にDFS

		Stack<Integer> stk = new Stack<Integer>();

		stk.push(y);
		stk.push(x);

		while (stk.size() > 0) {

			x = stk.pop();
			y = stk.pop();

			map[y][x] = '.'; // 現在位置は探索済みとして.に変えておく

			if (y > 0)
				if (map[y - 1][x] == c){
					stk.push(y-1);
					stk.push(x);
				}
			if (x > 0)
				if (map[y][x - 1] == c){
					stk.push(y);
					stk.push(x-1);
				}
			if (x < W - 1)
				if (map[y][x + 1] == c){
					stk.push(y);
					stk.push(x+1);
				}
			if (y < H - 1)
				if (map[y + 1][x] == c){
					stk.push(y+1);
					stk.push(x);
				}

		}

		return;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> ans = new ArrayList<Integer>();

		while (true) {

			H = scan.nextInt();
			W = scan.nextInt();

			if (H == 0)
				break;

			map = new char[H][W];

			for (int i = 0; i < H; i++)
				map[i] = (scan.next()).toCharArray();

			int cnt = 0;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] != '.') {
						dfs(i, j, map[i][j]);
						cnt++;
					}
				}
			}

			ans.add(cnt);
		}

		for (Integer integer : ans) {
			System.out.println(integer);
		}

	}

}