import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int w, h, sx, sy, gx, gy;
	static int[][] field = new int[20][20];
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}
	
	static boolean read() {
		w = sc.nextInt();
		h = sc.nextInt();
		if(w == 0) 
			return false;
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				field[i][j] = sc.nextInt();
				if(field[i][j] == 2) {
					sx = j; sy = i;
				} else if(field[i][j] == 3) {
					gx = j; gy = i;
				}
			}
		}
		return true;
	}
	
	//DæTõÅððßé. DæÅÍA©Â©Á½ðóâªAÅKðÆÈé.
	static int solve() {
		Queue<State> que = new LinkedList<State>();
		int[] dx = {-1, 0, 1, 0}; int[] dy = {0, -1, 0, 1};
		que.add(new State(sx, sy, 0, field));
		while(!que.isEmpty()) {
			State s = que.poll();
			//Xebvª10ÈãÈÌÅAðÈµ
			if(s.step >= 10)
				return -1;			
		
			//eûüÖTõ
			for(int k = 0; k < 4; k++) {
				int x = s.x, y = s.y, nx = s.x + dx[k], ny = s.y + dy[k];
				if(!inField(nx, ny) || s.field[ny][nx] == 1)
					continue;
				for(;;) {
					//S[ÉÅ«½
					if(s.field[ny][nx] == 3)
						return s.step + 1;
					
					x = nx; y = ny;	nx += dx[k]; ny += dy[k];
					if(inField(nx, ny)) {
						if(s.field[ny][nx] == 1) {
							s.field[ny][nx] = 0;
							que.add(new State(x, y, s.step + 1, s.field));
							s.field[ny][nx] = 1;
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		//±±ÉÍBµÈ¢ªAEclipseÌG[ðñð·é×.
		return -1;
	}
	
	static boolean inField(int x, int y) {
		return (x >= 0 && x < w && y >= 0 && y < h);
	}
}

class State {
	int x, y, step;
	int[][] field;
	State(int x, int y, int step, int[][] field) {
		this.x= x; this.y = y; this.step = step;
		this.field = new int[20][20];
		for(int i = 0; i < field.length; i++) 
			for(int j = 0; j < field[0].length; j++)
				this.field[i][j] = field[i][j];
	}
}