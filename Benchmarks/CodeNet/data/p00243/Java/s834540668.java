import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int [][] data;
	int min, h,w;
	boolean [][] used, used2;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};

	private void doit(){
		while(sc.hasNext()){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			data = new int[h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					char c = sc.next().charAt(0);
					if(c == 'R'){
						data[i][j] = 0;
					}
					else if(c == 'G'){
						data[i][j] = 1;
					}
					else{
						data[i][j] = 2;
					}
				}
			}
			min = 1 << 24;
			used = new boolean[h][w];
			dfs(0, data[0][0], count(0,0));
			System.out.println(min);
		}
	}

	private void dfs(int deep, int prev,int num) {
		if(num == w * h){
			min = Math.min(min, deep);
			return;
		}
		boolean [][] work = new boolean[h][w];
		init();
		count(0,0);
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				work[i][j] = used[i][j];
			}
		}
		
		for(int i = 0; i < 3; i++){
			if(i == prev) continue;
			paint(i, work);
			
			init();
			int res = count(0,0);
			if(res > num){
				dfs(deep + 1, i, res);
			}
			paint(prev, work);
		}
	}

	private void init() {
		for(int i = 0; i < h; i++){
			Arrays.fill(used[i], false);
		}
	}

	private void paint(int color, boolean [][] work) {
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(work[i][j]){
					data[i][j] = color;
				}
			}
		}
	}
	
	private int count(int x, int y) {
		used[y][x] = true;
		int sum = 1;
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(xx,yy)) continue;
			if(used[yy][xx]) continue;
			if(data[yy][xx] == data[0][0]){
				sum += count(xx,yy);
			}
		}
		return sum;
	}

	private boolean isOK(int xx, int yy) {
		if(0<= xx && xx < w && 0<= yy && yy < h) return true;
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}