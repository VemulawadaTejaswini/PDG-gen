import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		final int H = Integer.parseInt(in[0]);
		final int W = Integer.parseInt(in[1]);
		final int N = Integer.parseInt(in[2]);
		
		int[][] map = new int[H][W];
		int sx=0;  int sy=0;
		for(int i=0; i<H; ++i){
			char[] str = sc.nextLine().toCharArray();
			for(int j=0; j<W; ++j){
				switch(str[j]){
				case 'S':
					map[i][j] = 0;
					sy = i;
					sx = j;
					break;
				case 'X':
					map[i][j] = -1;
					break;
				case '.':
					map[i][j] = 0;
					break;
				default:
					map[i][j] = Integer.parseInt(str[j] + "");
				}
			}
		}
		
		//algorithm(BFS)
		final int[][] ofs = {
				{1, 0}, {0, 1}, {-1,0}, {0,-1}
		};
		boolean visited[][] = new boolean [H][W];
		int d[][] = new int[H][W];
		Queue<int[]> que = new LinkedList<int[]>();
		int ne[] = {sx, sy};
		que.offer(ne);
		visited[ne[1]][ne[0]] = true;
		d[ne[1]][ne[0]] = 0;
		int n = 0;
		int count = 0;
		while(n!=N){
			ne = que.poll();
			
			for(int i=0; i<ofs.length; ++i){
				final int[] e = {
						ne[0] + ofs[i][0], ne[1] + ofs[i][1]
				};
				boolean f = true;
				for(int j=0; j<e.length; ++j){
					if(e[j] < 0 || (j==1 && H<=e[j]) || (j==0 && W<=e[j]) ){ f=false; }	//はみ出し防止
				}
				if(f){
					if(map[ e[1] ][ e[0] ] >= 0 && !visited[ e[1] ][ e[0] ]){
						que.offer(e);
						visited[ e[1] ][ e[0] ] = true;
						d[ e[1] ][ e[0] ] = d[ ne[1] ][ ne[0] ] +1;
						if(map[ e[1] ][ e[0] ] == n+1){
							++n;
							count += d[ e[1] ][ e[0] ];
							que.clear();
							visited = new boolean[H][W];
							d = new int[H][W];
							que.offer(e);
							visited[ e[1] ][ e[0] ] = true;
							d[ e[1] ][ e[0] ] = 0;
							break;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}