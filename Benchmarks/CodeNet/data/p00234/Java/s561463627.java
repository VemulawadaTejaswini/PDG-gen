
import java.util.*;
public class Main {
	//0040 start
	//0251 RE
	int INF = 1 << 24;
	int [] vx = {0,1,-1};
	int [] vy = {1,0,0};
	
	class State implements Comparable<State>{
		
		int cost, nowh, noww, cap;
		String state;
		public State(int cost, int nowh, int cap, String state, int noww) {
			this.cost = cost;
			this.nowh = nowh;
			this.cap = cap;
			this.state = state;
			this.noww = noww;
		}
		@Override
		public int compareTo(State o) {
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost)return 1;
			return 0;
		}
		@Override
		public String toString() {
			return "State [cost=" + cost + ", nowh=" + nowh + ", cap=" + cap
					+ ", state=" + state + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h) == 0) break;
			int f = sc.nextInt();
			int m = sc.nextInt();
			int o = sc.nextInt();
			int [][] data = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = -1 * sc.nextInt();
				}
			}
			
			PriorityQueue<State> open = new PriorityQueue<Main.State>();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < w; i++){
				sb.append('1');
			}
			StringBuilder none = new StringBuilder();
			for(int i = 0; i < w; i++){
				none.append('0');
			}
			for(int i = 0; i < w; i++){
				none.setCharAt(i, '1');
				open.add(new State(0, -1, o,none.toString(),i));
				none.setCharAt(i, '0');
				
			}
			int [][][][] close = new int[h][w][m + 1][1 << w];
			for(int i = 0; i < h; i++){
				for(int j = 0;j < w; j++){
					for(int k = 0; k <= m; k++){
						Arrays.fill(close[i][j][k], INF);
					}
				}
			}
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.nowh == h - 1){
					ans = now.cost;
					break;
				}
				
				for(int i = 0; i < 3; i++){
					int hh = now.nowh + vy[i];
					int ww = now.noww + vx[i];
					if(hh == -1) continue;
					if(ww < 0 || ww >= w) continue;
					
					int nextcost = now.cost;
					int nextcap = now.cap - 1;
					if(nextcap <= 0) continue;
					StringBuilder nextstate = new StringBuilder(now.state); 
					if(i == 0){
						nextstate = new StringBuilder(none.toString()); 
						if(data[hh][ww] > 0){
							nextcost += data[hh][ww];
						}
						else{
							nextcap = Math.min(m, nextcap - data[hh][ww]);
						}
						nextstate.setCharAt(ww, '1');
					}
					else if(now.state.charAt(ww) == '0'){
						if(data[hh][ww] > 0){
							nextcost += data[hh][ww];
						}
						else{
							nextcap = Math.min(m, nextcap - data[hh][ww]);
						}
						nextstate.setCharAt(ww, '1');
					}
					if(nextcost > f) continue;
					int nextstatenum = Integer.parseInt(nextstate.toString(), 2);
					if(close[hh][ww][nextcap][nextstatenum] <= nextcost) continue;
					open.add(new State(nextcost, hh, nextcap, nextstate.toString(), ww));
					close[hh][ww][nextcap][nextstatenum] = nextcost;
				}
			}//end while
			System.out.println(ans == -1 ? "NA" : ans );
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}