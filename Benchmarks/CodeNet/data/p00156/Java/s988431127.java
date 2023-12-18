import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int w,h,gx,gy;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	static int[][] cost;
	static char[][] field;
	
	static boolean read() {
		w = sc.nextInt(); h = sc.nextInt();
		if(w == 0) return false;
		
		field = new char[h][w];
		for(int i = 0; i < h; i++) field[i] = sc.next().toCharArray();
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(field[i][j] == '&') {
					gx = j;
					gy = i;
				}
			}
		}
		return true;
	}
	
	static void solve() {
		int ans = Integer.MAX_VALUE;
		search();

		for(int i = 0; i < w; i++) ans = min(ans, min(cost[0][i], cost[h-1][i]));
		for(int i = 0; i < h; i++) ans = min(ans, min(cost[i][0], cost[i][w-1]));
		System.out.println(ans);
	}
	
	static int search() {
		cost = new int[h][w];
		for(int i = 0; i < h; i++) fill(cost[i], Integer.MAX_VALUE);
		Queue<State> pq = new LinkedList<State>();
		pq.offer(new State(gx, gy, 0));
		
		State s = null;
		while(!pq.isEmpty()) {
			s = pq.poll();
			if(cost[s.y][s.x] <= s.step) continue;
			cost[s.y][s.x] = s.step;
			for(int k = 0; k < 4; k++) {
				int x = s.x + dx[k], y = s.y + dy[k];
				if(x < 0 || x >= w || y < 0 || y >= h) continue;
				switch(field[y][x]) {
				case '.':
					pq.offer(new State(x, y, s.step));
					break;
				case '#':
					pq.offer(new State(x, y, s.step + 1));
					break;
				}
			}
		}
		return Integer.MAX_VALUE;
	}
	
	
	public static void main(String[] args) {
		while(read()) solve();
	}
}

class State implements Comparable<State>{
	int x,y,step;
	State(int x, int y, int step) {
		this.x = x;
		this.y = y;
		this.step = step;
	}
	
	public int compareTo(State s) {
		return this.step - s.step;
	}
}