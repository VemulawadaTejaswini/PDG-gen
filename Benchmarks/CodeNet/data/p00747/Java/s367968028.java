
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0)
				break;
			
			boolean[][] wwall = new boolean[h][w];
			boolean[][] hwall = new boolean[h][w];
			
			for(int i=0;i<2*h-1;i++){
				if(i%2==0){
					for(int j=0;j<w-1;j++)
						wwall[i/2][j] = sc.nextInt()==1;
				}else{
					for(int j=0;j<w;j++)
						hwall[i/2][j] = sc.nextInt()==1;
				}
			}
			
			System.out.println(solve(w, h, wwall, hwall));
		}
		
	}

	final int MAX = 100000;
	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };
	public int solve(int w, int h, boolean[][] wwall, boolean[][] hwall) {
		int[][] map = new int[h][w];
		for(int i=0;i<map.length;i++)
			Arrays.fill(map[i], MAX);
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{0, 0, 1});
		map[0][0] = 0;
		while(!q.isEmpty()){
			int[] cur = q.poll();
			for(int i=0;i<4;i++){
				int nx = cur[0] + dx[i];
				int ny = cur[1] + dy[i];
				
				if(nx<0 || w<=nx || ny<0 || h<=ny || 
						(i%2==1 && hwall[Math.min(cur[1], ny)][nx]) ||
						(i%2==0 && wwall[ny][Math.min(cur[0], nx)]))
					continue;
				
				int nc = cur[2]+1;
				if(map[ny][nx]>nc){
					map[ny][nx] = nc;
					q.add(new int[]{nx, ny, nc});
				}
			}
		}
		
		return map[h-1][w-1]==MAX ? 0 : map[h-1][w-1];
	}

}