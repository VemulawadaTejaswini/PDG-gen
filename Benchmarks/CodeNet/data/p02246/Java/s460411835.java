import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static final int SIZE = 4;
	public static final int[][] ANSWER = new int[][]{
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15,  0}
	};
	public static final int[][][] DIST = new int[][][]{
		{//0
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0},
			{ 0, 0, 0, 0}
		},
		{//1
			{ 0, 1, 2, 3},
			{ 1, 2, 3, 4},
			{ 2, 3, 4, 5},
			{ 3, 4, 5, 6}
		},
		{//2
			{ 1, 0, 1, 2},
			{ 2, 1, 2, 3},
			{ 3, 2, 3, 4},
			{ 4, 3, 4, 5}
		},
		{//3
			{ 2, 1, 0, 1},
			{ 3, 2, 1, 2},
			{ 4, 3, 2, 3},
			{ 5, 4, 3, 4}
		},
		{//4
			{ 3, 2, 1, 0},
			{ 4, 3, 2, 1},
			{ 5, 4, 3, 2},
			{ 6, 5, 4, 3}
		},
		{//5
			{ 1, 2, 3, 3},
			{ 0, 1, 2, 3},
			{ 1, 2, 3, 4},
			{ 2, 3, 4, 5}
		},
		{//6
			{ 2, 1, 2, 3},
			{ 1, 0, 1, 2},
			{ 2, 1, 2, 3},
			{ 3, 2, 3, 4}
		},
		{//7
			{ 3, 2, 1, 2},
			{ 2, 1, 0, 1},
			{ 3, 2, 1, 2},
			{ 4, 3, 2, 3}
		},
		{//8
			{ 4, 3, 2, 1},
			{ 3, 2, 1, 0},
			{ 4, 3, 2, 1},
			{ 5, 4, 3, 2}
		},
		{//9
			{ 2, 3, 4, 5},
			{ 1, 2, 3, 4},
			{ 0, 1, 2, 3},
			{ 1, 2, 3, 4}
		},
		{//10
			{ 3, 2, 3, 4},
			{ 2, 1, 2, 3},
			{ 1, 0, 1, 2},
			{ 2, 1, 2, 3}
		},
		{//11
			{ 4, 3, 2, 3},
			{ 3, 2, 1, 2},
			{ 2, 1, 0, 1},
			{ 3, 2, 1, 2}
		},
		{//12
			{ 5, 4, 3, 2},
			{ 4, 3, 2, 1},
			{ 3, 2, 1, 0},
			{ 4, 3, 2, 1}
		},
		{//13
			{ 3, 4, 5, 6},
			{ 2, 3, 4, 5},
			{ 1, 2, 3, 4},
			{ 0, 1, 2, 3}
		},
		{//14
			{ 4, 3, 4, 5},
			{ 3, 2, 3, 4},
			{ 2, 1, 2, 3},
			{ 1, 0, 1, 2}
		},
		{//15
			{ 5, 4, 3, 4},
			{ 4, 3, 2, 3},
			{ 3, 2, 1, 2},
			{ 2, 1, 0, 1}
		},
	};
	
	public static int calc_dist(int[][] board){
		int ret = 0;
		
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				ret += DIST[board[i][j]][i][j];
			}
		}
		
		return ret;
	}
	
	public static void do_move(int[][] board, int x, int y, int dx, int dy){
		int tmp = board[y][x];
		board[y][x] = board[y + dy][x + dx];
		board[y + dy][x + dx] = tmp;
	}
	
	public static int calc_move(int[][] board, int x, int y, int dx, int dy){
		final int nx = x + dx;
		final int ny = y + dy;
		
		return DIST[board[ny][nx]][y][x] + DIST[board[y][x]][ny][nx] - 
				(DIST[board[ny][nx]][ny][nx] + DIST[board[y][x]][y][x]);
	}
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static int check_move(int[][] board, int x, int y, int dx, int dy){
		final int nx = x + dx;
		final int ny = y + dy;
		
		if(0 > nx || nx >= SIZE || 0 > ny || ny >= SIZE){
			return INF;
		}else{
			return calc_move(board, x, y, dx, dy);
		}
	}
	
	public static class Tag implements Comparable<Tag>{
		int lower;
		int dx, dy;
		
		public Tag(int lower, int dx, int dy){
			this.lower = lower;
			this.dx = dx;
			this.dy = dy;
		}
		
		@Override
		public int compareTo(Tag arg0) {
			return this.lower - arg0.lower;
		}
	}
	
	public static int[][] move_dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public static int min = INF;
	public static void dfs(int[][] board, int x, int y, int limit, int deep, int dist, int prev_x, int prev_y){
		//System.out.println(x + ", " + y + " : " + deep + "/" + limit + " [" + dist  + "]");
		if(dist == 0){
			min = deep;
			return;
		}
		
		for(int[] moves : move_dir){
			final int nx = x + moves[0];
			final int ny = y + moves[1];
			
			final int next_dist = check_move(board, x, y, moves[0], moves[1]) + dist;
			//System.out.println(nx + "," + ny + " : " + dist + " -> " + next_dist);
			
			if(next_dist != dist - 1){
				continue;
			}else if(next_dist == 0){
				min = Math.min(min, deep + 1);
				return;
			}else if(limit <= next_dist + deep){
				continue;
			}else if(nx == prev_x && ny == prev_y){
				continue;
			}else if(min != INF){
				return;
			}
			
			do_move(board, x, y, moves[0], moves[1]);
			dfs(board, nx, ny, limit, deep + 1, next_dist, x, y);
			do_move(board, x, y, moves[0], moves[1]);
		}
		
		for(int[] moves : move_dir){
			final int nx = x + moves[0];
			final int ny = y + moves[1];
			
			final int next_dist = check_move(board, x, y, moves[0], moves[1]) + dist;
			//System.out.println(nx + "," + ny + " : " + dist + " -> " + next_dist);
			
			if(next_dist != dist + 1){
				continue;
			}else if(next_dist == 0){
				min = Math.min(min, deep + 1);
				return;
			}else if(limit <= next_dist + deep){
				continue;
			}else if(nx == prev_x && ny == prev_y){
				continue;
			}else if(min != INF){
				return;
			}
			
			do_move(board, x, y, moves[0], moves[1]);
			dfs(board, nx, ny, limit, deep + 1, next_dist, x, y);
			do_move(board, x, y, moves[0], moves[1]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[SIZE][SIZE];
		int y = -1, x = -1;
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				board[i][j] = sc.nextInt();
				
				if(board[i][j] == 0){
					y = i;
					x = j;
				}
			}
		}
		
		for(int limit = 0; limit <= 44; limit += 2){
			//System.out.println("lap : " + limit);
			if((x + y) % 2 == 0){
				dfs(board, x, y,     limit, 0, calc_dist(board), -2, -2);
			}else{
				dfs(board, x, y, limit + 1, 0, calc_dist(board), -2, -2);
			}
		}
		
		System.out.println(min);
		
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}