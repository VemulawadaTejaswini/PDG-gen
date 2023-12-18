import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int h, w;
	static char[][] field;
	static boolean[][] isPassed;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	static boolean read(){
		h = sc.nextInt();
		w = sc.nextInt();
		
		if(h == 0 && w == 0)return false;
		
		field = new char[h][w];
		isPassed = new boolean[h][w];
		
		for(int i = 0; i < field.length; i++)field[i] = sc.next().toCharArray();
		for(boolean[] arrays: isPassed)Arrays.fill(arrays, false);
		
		return true;
	}
	
	static void solve(){
		int gx = 0, gy = 0, nx = 0, ny = 0;
		int[] dx = {0, 1, 0, -1}, dy = {-1, 0, 1, 0};//up, right, down, left
		boolean isLoop = false;
		
		isPassed[0][0] = true;
		while(true){
			if(field[ny][nx] == '^'){
				nx = nx + dx[0]; ny = ny + dy[0];
			}else if(field[ny][nx] == '>'){
				nx = nx + dx[1]; ny = ny + dy[1];
			}else if(field[ny][nx] == 'v'){
				nx = nx + dx[2]; ny = ny + dy[2];
			}else if(field[ny][nx] == '<'){
				nx = nx + dx[3]; ny = ny + dy[3];
			}else{
				gx = nx; gy = ny;
				break;
			}
			if(isPassed[ny][nx]){isLoop = true; break;}
			isPassed[ny][nx] = true;
		}
		
		if(isLoop){
			System.out.println("LOOP");
		}else{
			System.out.println(gx + " " + gy);
		}
			
	}
}