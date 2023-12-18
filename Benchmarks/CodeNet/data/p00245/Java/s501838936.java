import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	int w,h;
	
	class Goods{
		int num, d, start, end;

		public Goods(int num, int d, int start, int end) {
			this.num = num;
			this.d = d;
			this.start = start;
			this.end = end;
		}
	}
	
	class State{
		int x,y,step, bit, value;

		public State(int x, int y, int step, int bit, int value) {
			this.x = x;
			this.y = y;
			this.step = step;
			this.bit = bit;
			this.value = value;
		}

		@Override
		public String toString() {
			return "State [x=" + x + ", y=" + y + ", step=" + step + ", bit="
					+ bit + ", value=" + value + "]";
		}
		
	}
	
	private void doit(){
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) ==0) break;
			char [][] data = new char[h][w];
			int sx = -1, sy = -1;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.next().charAt(0);
					if(data[i][j] == 'P'){
						sx = j;
						sy = i;
						data[i][j] = '.';
					}
				}
			}
			int n = sc.nextInt(), maxT = 0;
			HashMap<Integer, Goods> map = new HashMap<Integer, Main.Goods>();
			for(int i = 0; i < n;i++){
				int num = sc.nextInt();
				int d = sc.nextInt();
				int start = sc.nextInt();
				int end = sc.nextInt();
				map.put(num, new Goods(i, d, start, end));
				maxT = Math.max(maxT, end);
			}
			
			LinkedList<State> open = new LinkedList<Main.State>();
			open.add(new State(sx, sy, 0, 0, 0));
			boolean [][][][] close = new boolean[h][w][1 << n][maxT + 1];
			close[sy][sx][0][0] = true;
			int ans = 0;
			while(! open.isEmpty()){
				State now = open.poll();
				ans = Math.max(ans, now.value);
				if(now.step >= maxT){
					break;
				}
				if(now.bit == (1 << n) - 1){
					break;
				}
				for(int i = 0; i < 4; i++){
					int xx = now.x + vx[i];
					int yy = now.y + vy[i];
					if(! isOK(xx,yy)) continue;
					if(data[yy][xx] != '.') continue;
					int nextstep = now.step + 1;
					int nextbit = now.bit;
					int nextvalue = now.value;
					for(int j = 0; j < 4; j++){
						int xxx = xx + vx[j];
						int yyy = yy + vy[j];
						if(! isOK(xxx, yyy)) continue;
						if(data[yyy][xxx] != '.'){
							Goods g = map.get(data[yyy][xxx] - '0');
							if(g.start <= nextstep && nextstep < g.end){
								if((nextbit & (1 << g.num)) > 0) continue;
								nextbit = nextbit | (1 << g.num);
								nextvalue += g.d;
							}
						}
					}
					if(close[yy][xx][nextbit][nextstep]) continue;
					open.add(new State(xx, yy, nextstep, nextbit, nextvalue));
					close[yy][xx][nextbit][nextstep] = true;
				}
				
			}
			System.out.println(ans);
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < w && 0 <= yy && yy < h) return true;
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}