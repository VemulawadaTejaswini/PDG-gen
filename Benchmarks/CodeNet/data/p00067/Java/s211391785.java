
import java.util.*;

public class Main {
	int n, ans;
	int [][] data;
	int [] vx ={0,1,0,-1};
	int [] vy ={1,0,-1,0};

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = 12;
			data = new int[n][n];
			for(int i = 0; i < n; i++){
				String s = sc.next();
				for(int j = 0; j < n; j++){
					data[i][j] = s.charAt(j) - '0';
				}
			}
			ans = 0;
			for(int i = 0; i <  n; i++){
				for(int j = 0; j < n; j++){
					if(data[i][j] == 1){
						ans++;
						dfs(j,i);
					}
				}
			}
			System.out.println(ans);
		}
		
	}

	private void dfs(int x, int y) {
		data[y][x] = 0;
		for(int i = 0; i < 4; i++){
			int yy = y + vy[i];
			int xx = x + vx[i];
			if(! isOK(xx,yy))continue;
			if(data[yy][xx] == 1){
				dfs(xx,yy);
			}
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < n && 0<= yy && yy < n){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}