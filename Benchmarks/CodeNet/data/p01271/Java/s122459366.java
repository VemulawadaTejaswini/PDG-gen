import java.util.*;

public class Main{
	int w,h;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	class C{
		int x1,y1,x2,y2;

		public C(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			char [][][]data = new char[2][h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < 2; j++){
					data[j][i] = sc.next().toCharArray();
				}
			}
			int x1 = 0,x2 = 0,y1 = 0,y2 = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[0][i][j] == 'L'){
						data[0][i][j] = '.';
						x1 = j;
						y1 = i;
					}
				}
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[1][i][j] == 'R'){
						data[1][i][j] = '.';
						x2 = j;
						y2 = i;
					}
				}
			}
			LinkedList<C> open = new LinkedList<C>();
			open.add(new C(x1, y1, x2, y2));
			boolean [][][][] close = new boolean[h][w][h][w];
			close[y1][x1][y2][x2] = true;
			boolean ans = false;
			while(! open.isEmpty()){
				C now = open.poll();
				
				boolean flg = false;
				for(int i = 0; i < 4; i++){
					int xx = now.x1 + vx[i];
					int yy = now.y1 + vy[i];
					int xx2 = now.x2 + vx[i] *  -1;
					int yy2 = now.y2 + vy[i];
					if(! isOK(xx,yy) || ! isOK(xx2, yy2)) continue;
					if(data[0][yy][xx] == '#'){
						yy = now.y1;
						xx = now.x1;
					}
					if(data[1][yy2][xx2] == '#'){
						yy2 = now.y2;
						xx2 = now.x2;
					}
					if(data[0][yy][xx] == '%' && data[1][yy2][xx2] == '%'){
						flg = true;
						ans = true;
						break;
					}
					if(data[0][yy][xx] == '%' ||data[1][yy2][xx2] == '%'){
						continue;
					}
					
					if(close[yy][xx][yy2][xx2]) continue;
					
					open.add(new C(xx, yy, xx2, yy2));
					close[yy][xx][yy2][xx2] = true;
				}
				if(flg){
					break;
				}
			}
			System.out.println(ans ? "Yes" : "No");
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