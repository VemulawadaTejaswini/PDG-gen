import java.util.*;

public class Main{
	
	int [] vx = {0,1,0,-1,1,1,-1,-1};
	int [] vy = {1,0,-1,0,1,-1,-1,1};
	int n;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			char [][] data = new char[n][n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next().toCharArray();
			}
			
			int max = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(data[i][j] == '0')continue;
					for(int k = 0; k < vx.length; k++){
						int now = 1;
						int yy = i, xx = j;
						while(true){
							xx = xx + vx[k];
							yy = yy + vy[k];
							if(! isOK(xx,yy)) break;
							if(data[yy][xx] == '0') break;
							now++;
						}
						max = Math.max(max, now);
					}
				}
			}
			System.out.println(max);
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0<= xx && xx < n && 0<= yy && yy < n){
			return true;
		}
		return false;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}