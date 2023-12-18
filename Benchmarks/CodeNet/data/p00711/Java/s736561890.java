
import java.util.Scanner;

/**
 * AOJ id=1130
 * Red and Black
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0) break;
			map = new char[h][w];
			for(int i=0;i<h;i++)
				map[i] = sc.next().toCharArray();
			solve(map);
		}
	}

	int w;
	int h;
	char[][] map;
	public void solve(char[][] map) {
		int sx = -1;
		int sy = -1;
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				if(map[i][j]=='@'){
					sx = j;
					sy = i;
					break;
				}
			}
			if(sx>=0)
				break;
		}
		System.out.println(rec(sx, sy));
		
	}

	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };
	private int rec(int curx, int cury) {
		if(map[cury][curx]=='#')
			return 0;	
		
		map[cury][curx] = '#';
		int res = 1;
		for(int i=0;i<4;i++){
			int nx = curx + dx[i];
			int ny = cury + dy[i];
			
			if(nx<0 || w<=nx || ny<0 || h<=ny)
				continue;
			res += rec(nx, ny);
		}
		
		
		return res;
	}

}