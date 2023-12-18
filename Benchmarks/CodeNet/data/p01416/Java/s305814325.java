import java.util.*;

public class Main{
	char [][] data;
	int w,h;
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			h = sc.nextInt();
			w = sc.nextInt();
			data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			int sum = 0;
			for(int k = 0; k < 26; k++){
				int prev = sum;
				for(int i = 0; i < h; i++){
					for(int j = 0; j < w; j++){
						if(data[i][j] == '.'){
							sum += erase(i,j);
						}
					}
				}
				if(prev == sum){
					break;
				}
			}
			
			System.out.println(sum);
		}
	}

	private int erase(int y, int x) {
		char [] panel = new char[4];
		Arrays.fill(panel, '*');
		int [][] pos = new int[4][2];
		for(int i = 0; i < 4; i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			while(true){
				if(! isOK(xx,yy)) break;
				if(data[yy][xx] != '.'){
					panel[i] = data[yy][xx];
					pos[i][0] = xx;
					pos[i][1] = yy;
					break;
				}
				xx = xx + vx[i];
				yy = yy + vy[i];
			}
		}
		int count = 0;
		for(int i = 0; i < 4; i++){
			if(panel[i] == '*') continue;
			for(int j = i + 1; j < 4; j++){
				if(i == j) continue;
				
				if(panel[i] == panel[j]){
					data[pos[i][1]][pos[i][0]] = '.';
					data[pos[j][1]][pos[j][0]] = '.';
					count+= 2;
				}
			}
		}
		return count;
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= xx && xx < w && 0 <= yy && yy < h){
			return true;
		}
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}