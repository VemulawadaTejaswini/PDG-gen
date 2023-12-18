import java.util.Scanner;
import java.util.Stack;

public class Main {

	static boolean[][] map = new boolean[12][12];
	static int[] dx = new int[]{-1,0,1,0}, dy = new int[]{0,-1,0,1};

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			for (int i = 0; i < 12 ; i++) {
				String num = scan.next();
				for (int j = 0; j < 12 ; j++) {
					if(num.charAt(j)=='0') map[i][j]=false;
					else map[i][j]=true;
				}
			}

			int cnt = 0;
			for (int i = 0; i < 12 ; i++) {
				for (int j = 0; j < 12 ; j++) {
					if(map[i][j]){
						dfs(i,j);
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

	public static void dfs(int y,int x){
		Stack<int[]> stk = new Stack<int[]>();
		stk.push(new int[]{y,x});
		while(!stk.isEmpty()){
			int[] pos = stk.pop();
			int py = pos[0];
			int px = pos[1];
			map[py][px]=false;
			for (int i = 0; i < 4; i++) {
				int nx = px + dx[i];
				int ny = py + dy[i];
				if(0<=nx && nx<12 && ny>=0 && ny<12 && map[ny][nx]) stk.push(new int[]{ny,nx});
			}
		}
	}
}