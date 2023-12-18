import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*; 
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] field;
	static int m, n;
	static int[]dx = {-1, 0, 1, 0},dy = {0, 1, 0, -1};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		
		while(read()){
			slove();
		}
	}
	static boolean read(){
		m = sc.nextInt();
		if(m == 0)
			return false;
		n = sc.nextInt();
		
		field = new int[n+2][m+2];
		
		for(int i = 0; i < field.length; i++)
			fill(field[i], 0);
		
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= m; j++)
				field[i][j] = sc.nextInt();
		
		return true;
	}
	static void slove(){
		int ans = 0;
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= m; j++)
				if(field[i][j] == 1)
					ans = max(ans, rec(j, i, 1));
		System.out.println(ans);
	}
	static int rec(int x, int y, int step){
		int ret = 0;
		for(int i = 0; i < 4; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(field[ny][nx] == 1){
				field[y][x] = 0;
				ret = max(ret, rec(nx, ny, step+1));
				field[y][x] = 1;
			}else{
				ret = max(ret, step);
			}
		}
		return ret;
	}

}