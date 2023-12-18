import java.util.*;

public class Main{
	int [] vx = {0,1,0,-1,1,1,-1,-1};
	int [] vy = {1,0,-1,0,1,-1,-1,1};
	char [][] data;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = 8;
			data = new char[n][n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next().toCharArray();
			}
			boolean update = true;
			while(update){
				update = false;
				int max = 0, x = 0, y = 0;
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						if(data[i][j] != '.')continue;
						int temp = find(i,j, 'o');
						if(max < temp){
							max = temp;
							x = j;
							y = i;
						}
					}
				}
				
				if(max > 0){
					update = true;
					data[y][x] = 'o';
					paint(x,y, 'o');
				}
				
				int max2 = 0, x2 = 0, y2 = 0;
				for(int i = n-1; i >= 0; i--){
					for(int j = n-1; j >= 0; j--){
						if(data[i][j] != '.')continue;
						int temp = find(i, j, 'x');
						if(max2 < temp){
							max2 = temp;
							x2 = j;
							y2 = i;
						}
					}
				}
				if(max2 > 0){
					update = true;
					data[y2][x2] = 'x';
					paint(x2,y2,'x');
				}
			}
			disp();
		}
	}

	private void disp() {
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}

	private void paint(int x, int y, char c) {
		for(int i = 0; i < vx.length; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			boolean flg = false;
			while(true){
				if(! isOK(xx,yy))break;
				if(data[yy][xx] == c){
					flg = true;
					break;
				}
				else if(data[yy][xx] == '.'){
					break;
				}
				xx += vx[i];
				yy += vy[i];
			}
			
			if(flg){
				xx = x + vx[i];
				yy = y + vy[i];
				while(true){
					if(! isOK(xx,yy))break;
					if(data[yy][xx] == c){
						break;
					}
					else if(data[yy][xx] == '.'){
						break;
					}
					data[yy][xx] = c;
					xx += vx[i];
					yy += vy[i];
				}
			}
		}
	}

	private int find(int y, int x, char c) {
		int count = 0;
		for(int i = 0; i < vx.length; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			int now = 0;
			while(true){
				if(! isOK(xx,yy))break;
				if(data[yy][xx] == c){
					count += now;
					break;
				}
				else if(data[yy][xx] == '.'){
					break;
				}
				now++;
				xx = xx + vx[i];
				yy = yy + vy[i];
			}
		}
		return count;
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < 8 && 0 <= yy && yy < 8)return true;
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}