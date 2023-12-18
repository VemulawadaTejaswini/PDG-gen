import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static boolean ok(int x, int y, int w, int h){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}
		return true;
	}
	
	public static boolean get_rect(int w, int h, int[][] map, int count, int[][] rect, boolean[][] checked){
		int color = 0;
		int left = Integer.MAX_VALUE;
		int right = Integer.MIN_VALUE;
		int up = Integer.MIN_VALUE;
		int down = Integer.MAX_VALUE;
		
		
		for(int y = 0; y < h; y++){
			for(int x = 0; x < w; x++){
				if(checked[y][x]){
					continue;
				}else if(map[y][x] == 0){
					continue;
				}
				
				if(color == 0){
					color = map[y][x];
					checked[y][x] = true;
					left = right = x;
					up = down = y;
				}else if(map[y][x] == color){
					checked[y][x] = true;
					left = Math.min(left, x);
					right = Math.max(right, x);
					up = Math.min(up, y);
					down = Math.max(down, y);
				}
			}
		}
		
		if(color != 0){
			rect[count][0] = left;
			rect[count][1] = up;
			rect[count][2] = right;
			rect[count][3] = down;
			rect[count][4] = color;
			return true;
		}else{
			return false;
		}
	}
	
	
	public static boolean check_rect(int w, int h, int[][] map, int len, int[][] rect, boolean[][] adj){
		for(int i = 0; i < len; i++){
			final int sx = rect[i][0];
			final int sy = rect[i][1];
			final int gx = rect[i][2];
			final int gy = rect[i][3];
			final int color = rect[i][4];
			
			boolean[] checked = new boolean[27];
			
			for(int y = sy; y <= gy; y++){
				for(int x = sx; x <= gx; x++){
					if(map[y][x] == 0){
						return false;
					}else if(map[y][x] != color){
						if(!checked[map[y][x]]){						
							for(int c = 0; c < len; c++){
								if(c == i){
									continue;
								}else if(rect[c][4] == map[y][x]){
									adj[i][c] = true;
									checked[map[y][x]] = true;
									break;
								}
							}
						}
					}
				}
			}
		}
		
		return true;
	}
	
	public static final int unvisited = 0;
	public static final int visiting = 1;
	public static final int visited = 2;
	public static boolean dfs(int node, boolean[][] adj, int[] state){
		state[node] = visiting;
		
		for(int i = 0; i < adj.length; i++){
			if(!adj[node][i]){
				continue;
			}else if(state[i] == unvisited){
				if(!dfs(i, adj, state)){
					state[node] = visited;
					return false;
				}
			}else if(state[i] == visiting){
				return false;
			}
		}
		
		state[node] = visited;
		return true;
	}
	
	public static boolean find_cycle(boolean[][] adj){
		int[] state = new int[adj.length];
		for(int i = 0; i < adj.length; i++){
			state[i] = unvisited;
		}
		for(int i = 0; i < adj.length; i++){
			if(state[i] == unvisited){
				if(!dfs(i, adj, state)){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean do_it(int h, int w, int[][] map){
		int cur = 0;
		int[][] rect = new int[7][5];
		boolean[][] checked = new boolean[h][w];
		
		while(get_rect(w, h, map, cur, rect, checked)){
			cur++;
		}
		
		boolean[][] adj = new boolean[cur][cur];
		if(!check_rect(w, h, map, cur, rect, adj)){
			return false;
		}
		
		if(!find_cycle(adj)){
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int T = sc.nextInt();
		
		for(int tt = 0; tt < T; tt++){
			final int h = sc.nextInt();
			final int w = sc.nextInt();
			
			int[][] map = new int[h][w];
			
			for(int i = 0; i < h; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < w; j++){
					if(input[j] == '.'){
						map[i][j] = 0;
					}else{
						map[i][j] = input[j] - 'A' + 1;
					}
				}
			}
			
			System.out.println(do_it(h, w, map) ? "SAFE" : "SUSPICIOUS");
		}

	}
}