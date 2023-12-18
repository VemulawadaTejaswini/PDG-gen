import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	//2320 start
	//2345 end
	//2356 sample match
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	int w,h;
	int INF = 1 << 24;
	
	class C{
		int x,y,s,hp;

		public C(int x, int y, int s, int hp) {
			this.x = x;
			this.y = y;
			this.s = s;
			this.hp = hp;
		}

		@Override
		public String toString() {
			return "C [x=" + x + ", y=" + y + ", s=" + s + ", hp=" + hp + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			int [][] data = new int[h][w];
			int sx = -1, sy = -1;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
					if(data[i][j] == 2){
						data[i][j] = 1;
						sx = j;
						sy = i;
					}
				}
			}
			
			LinkedList<C> open = new LinkedList<C>();
			open.add(new C(sx,sy,0,6));
			boolean [][][] close = new boolean[h][w][7];
			Arrays.fill(close[sy][sx], true);
			
			int ans = INF;
			boolean flg = false;
			while(! open.isEmpty()){
				C now = open.removeFirst();
				//System.out.println(now);
				//System.out.println("debug = " + close[4][2][6] + " " + close[4][2][5]);
				for(int i = 0; i < 4; i++){
					int xx = now.x + vx[i];
					int yy = now.y + vy[i];
					int nextHP = now.hp - 1;
					int nexts = now.s + 1;
					if(nextHP == 0) break;
					if(! isOK(xx,yy)) continue;
					if(data[yy][xx] == 0) continue;
					if(close[yy][xx][nextHP])continue;
					
					if(data[yy][xx] == 3){
						ans = nexts;
						flg = true;
						break;
					}
					
					if(data[yy][xx] == 4){
						nextHP = 6;
					}
					//NextHp以下をtrueにすればよい？
					for(int j = nextHP; j >= 0; j--){
						//System.out.println("yy = " + yy + " xx = " + xx +  " " + nextHP);
						close[yy][xx][j] = true;
					}
					open.add(new C(xx,yy,nexts,nextHP));
				}
				if(flg) break;
			}
			System.out.println(ans == INF ? -1 : ans);
		}
		
		
	}

	private boolean isOK(int x, int y) {
		if(0<= x && x< w && 0<= y && y < h ){
			return true;
		}
		return false;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}