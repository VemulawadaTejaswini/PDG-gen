import java.util.*;

public class Main {
	int w,h;
	char [][] data;
	int [] vx = {0,1,0,-1};
	int [] vy = {-1,0,1,0};
	boolean ans;
	boolean [][] visited, searchXvisited, getGvisited;
	int minx, maxx;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			data = new char[h + 1][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			for(int i = 0; i < w; i++){
				data[h][i] = '0';
			}
			h++;
			
			ans = true;
			visited = new boolean[h][w];
			for(int i = 0; i < w; i++){
				if(data[h-1][i] != '.'){
					visited[h-1][i] = true;
					dfs(i, h-1, data[h-1][i]);
					break;
				}
			}
			System.out.println(ans ? "STABLE" : "UNSTABLE");
		}
	}

	private void dfs(int x, int y, char color) {

		for(int i = 0; i < 4; i++){
			int xx = vx[i] + x;
			int yy = vy[i] + y;
			if(! isOK(xx,yy)) continue;
			if(data[yy][xx] == '.') continue;
			if(visited[yy][xx])continue;
			if(data[yy][xx] == color){
				visited[yy][xx] = true;
				dfs(xx,yy, color);
			}
			else if(i == 0){
				boolean res = isStable(x, y, xx,yy);
				if(! res){
					ans = false;
					return;
				}
				else{
					dfs(xx, yy, data[yy][xx]);
				}
			}
		}
	}

	private boolean isStable(int x, int y, int xx, int yy) {
		searchXvisited = new boolean[h][w];
		searchXvisited[y][x] = true;
		minx = x;
		maxx = x;
		searchX(x,y,data[y][x]);
		
		getGvisited = new boolean[h][w];
		getGvisited[yy][xx] = true;
		
		int [] res2 = getG(xx,yy,data[yy][xx]);
		double g = (double)res2[0] / res2[1];
//		for(int i = 0; i < h; i++){
//			debug(data[i]);
//		}
//		debug(g, minx, maxx, "res2", res2, x, y, xx,yy,"map", data[y][x], data[yy][xx]);
		if((double)(minx - 0.5) < g && g < (double)(maxx + 0.5)){
			return true;
		}
		return false;
	}

	private int[] getG(int x, int y, char c) {
		int [] ans = {x, 1};
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(xx,yy)) continue;
			if(getGvisited[yy][xx]) continue;
			if(data[yy][xx] == '.') continue;
			if(data[yy][xx] == c){
				getGvisited[yy][xx] = true;
				int [] res = getG(xx, yy, c);
				ans[0] += res[0];
				ans[1] += res[1];
			}
			else if(i == 0){
				getGvisited[yy][xx] = true;
				int [] res = getG(xx, yy, data[yy][xx]);
				ans[0] += res[0];
				ans[1] += res[1];
			}
		}
		return ans;
	}

	private void searchX(int x, int y, char c) {
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			if(! isOK(xx,yy)) continue;
			if(searchXvisited[yy][xx]) continue;
			if(data[yy][xx] == '.') continue;
			if(data[yy][xx] == c){
				searchXvisited[yy][xx] = true;
				searchX(xx, yy, c);
			}
			if(i == 0 && data[yy][xx] != c){
				minx = Math.min(xx, minx);
				maxx = Math.max(maxx, xx);
			}
		}
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