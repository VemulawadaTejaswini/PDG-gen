import java.util.*;

public class Main {
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	int ans,w,h;
	int [][] data;
	private void doit(){
		Scanner sc = new Scanner (System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			int sx=0,sy=0;
			if(w == 0 && h == 0) break;
			data = new int[h][w];
			for(int i=0; i < h; i++){
				for(int j=0; j < w; j++){
					data[i][j] = sc.nextInt();
					if(data[i][j] == 2){
						data[i][j] = 0;
						sx = j;
						sy = i;
					}
				}
			}
			ans = 11;
			dfs(sx,sy,0);
			//System.out.print("ANS= ");
			System.out.println(ans == 11 ? -1: ans);
		}
	}

	private void dfs(int x, int y, int count) {
		if(count == 10) return ;
		//System.out.println("x= " + x + " y= " + y + " count= " + count);
		for(int i=0; i < 4;i++){
			int nextX = x + vx[i];
			int nextY = y + vy[i];
			if(! isOK(nextX, nextY)) continue;
			if(data[nextY][nextX] == 1) continue;
			while(true){
				if( isOK(nextX, nextY) && data[nextY][nextX] == 0){
					nextX += vx[i];
					nextY += vy[i];
				}
				else{
					break;
				}
			}
			if(! isOK(nextX, nextY)) continue;
			if(data[nextY][nextX] == 1){
				data[nextY][nextX] = 0;
				int stopX = nextX - vx[i];
				int stopY = nextY - vy[i];
				dfs(stopX, stopY,count + 1);
				data[nextY][nextX] = 1;
			}
			else if(data[nextY][nextX] == 3){
				ans = Math.min(ans, count+1);
			}
		}
	}
	
	private boolean isOK(int x, int y){
		if(0 <= x && x < w && 0 <= y && y < h){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}