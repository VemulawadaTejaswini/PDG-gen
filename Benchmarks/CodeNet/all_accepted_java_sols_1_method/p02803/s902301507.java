import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();

		char[][] c = new char[H][W];
		int ans=0;
		for (int h = 0; h < H; h++) {
			String s = scan.next();
			for (int w = 0; w < W; w++) {
				c[h][w] = s.charAt(w);
			}
		}

		boolean[][] flag = new boolean[H][W];
		Queue<int[]> queue = new ArrayDeque<int[]>();
		for(int sh = 0; sh < H; sh++){
			for(int sw = 0; sw < W; sw++){
				if(c[sh][sw] != '#'){
					
					for(int i = 0; i < H; i++){
						Arrays.fill(flag[i], false);
					}
					
					int[] a = {sh, sw, 0};
					queue.add(a);
					flag[sh][sw] = true;
					int[] dx={1,0,-1,0,};
					int[] dy={0,-1,0,1,};
					while (!queue.isEmpty()) {
						int[] rem = queue.remove();
						int y = rem[0];
						int x = rem[1];
						int depth=rem[2];
						for (int i=0;i<4;i++) {
							if(0 <= y+dy[i] && y+dy[i] < H && 0 <= x+dx[i] && x+dx[i] < W){
								if (c[y+dy[i]][x+dx[i]]=='#' || flag[y+dy[i]][x+dx[i]] == true) {
								} else {
									int[] ad = {y+dy[i],x+dx[i],depth+1};
									queue.add(ad);
									flag[y+dy[i]][x+dx[i]] = true;
									ans = Math.max(depth + 1, ans);
								}
							}
						}
					}
				}
			}
		}

		System.out.println(ans);
	}
}