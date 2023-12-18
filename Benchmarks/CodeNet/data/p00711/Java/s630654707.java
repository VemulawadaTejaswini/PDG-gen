
import java.util.*;
public class Main {
	int ans, w,h;
	char [][] data;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			data = new char[h][w];
			int sx = -1, sy = -1;
			for(int i = 0; i < h; i++){
				String s = sc.next();
				for(int j = 0 ; j < w; j++){
					data[i][j] = s.charAt(j);
					if(data[i][j] == '@'){
						data[i][j] = '.';
						sx = j;
						sy = i;
					}
				}
			}
			ans = 0;
			dfs(sx, sy);
			System.out.println(ans);
		}
	}

	private void dfs(int sx, int sy) {
		ans++;
		data[sy][sx] = '*';
		for(int i = 0 ; i < 4; i++){
			int yy = sy + vy[i];
			int xx= sx + vx[i];
			
			if(0 <= yy&& yy < h && 0<= xx && xx < w){
				if(data[yy][xx] == '.'){
					dfs(xx,yy);
				}
			}
		}
		
	}

	private int solvec(int n) {
		int a = n / 500;
		if(n % 500 != 0) a++;
		int aa = a / 3;
		int aaa = a% 3;
		double sum = (double)850 * aa * 3 * 88 / 100 + 850 * aaa;
		return (int)sum;
	}

	private int solveb(int n) {
		int a = n / 300;
		if(n % 300 != 0) a++;
		int aa = a / 4;
		int aaa = a% 4;
		double sum = (double)550 * aa * 4 * 85 / 100 + 550 * aaa;
		return (int)sum;
	}

	private int solvea(int n) {
		int a = n / 200;
		if(n % 200 != 0) a++;
		int aa = a / 5;
		int aaa = a% 5;
		double sum = (double)380 * aa * 5 * 8 / 10 + 380 * aaa;
		return (int)sum;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}