
import java.util.*;
public class Main {
	//0030 start
	//0050 cording end
	int ans, w,h;
	//0が右
	int [][] vx = {
			{1,1,1,1,  1, 2, 2,  2,3},
			{-1,-1,-1,-1,-1, -2,-2,-2, -3}
	};
	int [][] vy = {
			{2,1,0,-1,-2, 1, 0, -1,0},
			{2,1,0,-1,-2   , 1, 0, -1,0}
	};
	int INF = 1 << 24;
	
	class C implements Comparable<C>{
		int x, y, cost;
		int digit;
		public C(int x, int y, int digit, int cost) {
			this.x = x;
			this.y = y;
			this.digit = digit;
			this.cost = cost;
		}
		@Override
		public int compareTo(C o) {
			if(this.cost < o.cost) return -1;
			if(this.cost > o.cost) return 1;
			return 0;
		}
		@Override
		public String toString() {
			return "C [x=" + x + ", y=" + y + ", cost=" + cost + ", digit="
					+ digit + "]";
		}
		
	}

	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			PriorityQueue<C> open = new PriorityQueue<C>();
			int [][] data = new int[h][w];
			//System.out.println("w = " + w + " h = " + h);
			for(int i = 0; i < h; i++){
				for(int j = 0;j < w; j++){
					char c =sc.next().charAt(0);
					switch(c){
					case 'X':
						data[i][j] = INF;
						break;
					case 'S':
						open.add(new C(j, i, 0, 0));
						open.add(new C(j, i, 1, 0));
						data[i][j] = INF;
						break;
					case 'T':
						data[i][j] = 0;
						break;
					default :
						data[i][j] = c - '0';
					}
				}
			}
			
			int [][][] close = new int[h][w][2];
			for(int i = 0; i < h; i++){
				for(int j = 0 ; j < w; j++){
					close[i][j][0] = INF;
					close[i][j][1] = INF;
				}
			}
			
			int ans = -1;
			while(! open.isEmpty()){
				C now = open.poll();
				//System.out.println(now);
				//System.out.println("y = " + now.y + " x= " + now.x + "cost  = " + now.cost);
				if(data[now.y][now.x] == 0){
					
					ans = now.cost;
					break;
					
				}
				for(int i = 0; i < vx[now.digit].length; i++){
					int xx = now.x + vx[now.digit][i];
					int yy = now.y + vy[now.digit][i];
					if(! isOK(xx, yy)) continue;
					if(data[yy][xx] == INF) continue;
					int nextcost = now.cost + data[yy][xx];
					int nextdigit = (now.digit + 1) % 2;
					if(close[yy][xx][nextdigit] <= nextcost) continue;
					//System.out.println("next = " + new C(xx, yy, nextdigit, nextcost));
					open.add(new C(xx, yy, nextdigit, nextcost));
					close[yy][xx][nextdigit] = nextcost;
				}
			}
			System.out.println(ans);
			
		}//while end
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < w && 0 <= yy && yy < h){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}