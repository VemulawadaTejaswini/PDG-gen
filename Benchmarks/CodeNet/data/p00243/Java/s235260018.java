import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int [][] data;
	int min, h,w;
	boolean [][] used;
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
			dfs(0, -1, paint(data[0][0], data[0][0], 0,0));
			System.out.println(min);
		}
	}

	private void dfs(int deep, int prev,int num) {
		if(num == w * h){
			min = Math.min(min, deep);
			return;
		}
		
		used = new boolean[h][w];
		int [][] work = deepcopy(data);
		for(int i = 0; i < 3; i++){
			if(i == prev) continue;
			used = new boolean[h][w];
			paint(data[0][0], i, 0,0);
			used = new boolean[h][w];
			int res = paint(i,i,0,0);
			if(res > num){
				dfs(deep + 1, i, res);
			}
			data = deepcopy(work);
		}
	}

	private int paint(int nowcolor, int nextcolor, int x, int y) {
		used[y][x] = true;
		data[y][x] = nextcolor;
		int sum = 1;
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(xx,yy)) continue;
			if(used[yy][xx]) continue;
			if(data[yy][xx] == nowcolor){
				sum += paint(nowcolor, nextcolor, xx,yy);
			}
		}
		return sum;
	}

	private boolean isOK(int xx, int yy) {
		if(0<= xx && xx < w && 0<= yy && yy < h) return true;
		return false;
	}

	private int[][] deepcopy(int[][] data2) {
		int [][] res = new int[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				res[i][j] = data2[i][j];
			}
		}
		return res;
	}

	private boolean check() {
		int color = data[0][0];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(data[i][j] != color){
					return false;
				}
			}
		}
		return true;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}