import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	int w,h, gx, gy;
	char [][] data;
	
	class State implements Comparable<State>{
		int x, y, step, restdist;
		int [] enter;
		public State(int x, int y, int step, int [] enter, int restdist) {
			this.x = x;
			this.y = y;
			this.step = step;
			this.enter = enter;
			this.restdist = restdist;
		}
		@Override
		public int compareTo(State o) {
			return (this.step + this.restdist) - (o.step + o.restdist);
		}
	}
	
	private void doit(){
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			data = new char[h][w];
			for(int i = 0 ; i < h; i++){
				data[i]= sc.next().toCharArray();
			}
			int sx = -1, sy = -1;
			ArrayList<Integer> list = new ArrayList<Integer>();
			char c = '0';
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == 'S'){
						data[i][j] = '.';
						sx = j;
						sy = i;
					}
					else if(data[i][j] == 'G'){
						gx = j;
						gy = i;
					}
					else if(data[i][j]== 'X'){
						int res = dfs(i,j, c);
						if(res == 1){
							data[i][j] = '#';
						}
						else{
							list.add(res / 2);
							c++;
							if(c == 'G' || c == 'S'){
								c++;
							}
						}
					}
				}
			}
			
			int [] initenter = new int[list.size()];
			for(int i = 0; i < initenter.length; i++){
				initenter[i] = list.get(i);
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			open.add(new State(sx, sy, 0, initenter, calcM(sx,sy)));
			HashSet<String> close = new HashSet<String>();
			close.add((sy * w + sx)+ " "+ getState(initenter));
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				boolean flg = false;
				for(int i = 0; i < 4; i++){
					int xx = now.x + vx[i];
					int yy = now.y + vy[i];
					if(! isOK(xx, yy)) continue;
					if(data[yy][xx] == '#') continue;
					
					
					int [] nextenter = (int[]) now.enter.clone();
					if(data[yy][xx]== 'G' ){
						ans = now.step + 1;
						flg =true;
						break;
					}
					else if(data[yy][xx] != '.'){
						int ind = data[yy][xx] - '0';
						if(ind >= ('U' - '0')){
							ind--;
						}
						if(ind >= ('G' - '0')){
							ind--;
						}
						if(nextenter[ind] <= 0) continue;
						nextenter[ind]--;
					}
					String nextstate = (yy * w + xx) + " " + getState(nextenter);
					if(close.contains(nextstate))continue;
					open.add(new State(xx, yy, now.step + 1, nextenter, calcM(xx, yy)));
					close.add(nextstate);
				}
				if(flg){
					break;
				}
			}
			System.out.println(ans);
		}
	}

	private int calcM(int sx, int sy) {
		int res = Math.abs(sx - gx) + Math.abs(sy - sy);
		return res;
	}

	private String getState(int [] list) {
		StringBuilder sb = new StringBuilder();
		for(int value: list){
			sb.append(" " + value);
		}
		return sb.length() == 0 ? "" : sb.substring(1);
	}

	private int dfs(int y, int x, char c) {
		int sum = 1;
		data[y][x] = c;
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(xx, yy)) continue;
			if(data[yy][xx] == 'X'){
				sum += dfs(yy,xx,c);
			}
		}
		return sum;
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