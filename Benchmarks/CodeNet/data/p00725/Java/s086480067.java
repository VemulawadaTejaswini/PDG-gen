
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	public static final int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean is_ok(int x, int y, int w, int h){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}
		
		return true;
	}
	
	public static class Shot{
		int clash;
		int[][] clash_list;
		int x, y;
		
		public Shot(int clash, int[][] clash_list, int x, int y, int c_x, int c_y) {
			super();
			this.clash = clash;
			this.clash_list = new int[10][];
			for(int i = 0; i < clash - 1; i++){
				this.clash_list[i] = new int[]{clash_list[i][0], clash_list[i][1]};
			}
			this.clash_list[clash - 1] = new int[]{c_x, c_y};
			this.x = x;
			this.y = y;
		}
		
		public Shot(int clash, int x, int y){
			super();
			this.clash = clash;
			this.clash_list = new int[10][];
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			boolean[][] is_wall = new boolean[h][w];
			int s_x = 0, s_y = 0, g_x = 0, g_y = 0;
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					final int t = sc.nextInt();
					
					if(t == 1){
						is_wall[i][j] = true;
					}else if(t == 2){
						s_x = j;
						s_y = i;
					}else if(t == 3){
						g_x = j;
						g_y = i;
					}
				}
			}
			
			//System.out.println(s_x + " " + s_y + " " + g_x + " " + g_y);
			
			LinkedList<Shot> queue = new LinkedList<Shot>();
			queue.add(new Shot(0, s_x, s_y));
			
			boolean found = false;
			while(!queue.isEmpty()){
				Shot shot = queue.poll();
				
				if(shot.clash >= 10){
					continue;
				}
				
				//System.out.println(shot.clash + " " + shot.x + " " + shot.y);
				
				for(int i = 0; i < shot.clash; i++){
					is_wall[shot.clash_list[i][1]][shot.clash_list[i][0]] = false;
				}
				
				for(int[] move : move_dir){
					int n_x = shot.x + move[0];
					int n_y = shot.y + move[1];
					
					if(!is_ok(n_x, n_y, w, h) || is_wall[n_y][n_x]){
						continue;
					}else if(n_x == g_x && n_y == g_y){
						System.out.println(shot.clash + 1);
						found = true;
						break;
					}
					
					while(true){
						n_x += move[0];
						n_y += move[1];
						
						if(!is_ok(n_x, n_y, w, h)){
							break;
						}else if(is_wall[n_y][n_x]){
							//System.out.println("> " + shot.clash + " " + n_x + " " + n_y);
							queue.add(new Shot(shot.clash + 1, shot.clash_list, n_x - move[0], n_y - move[1], n_x, n_y));
							break;
						}else if(n_x == g_x && n_y == g_y){
							System.out.println(shot.clash + 1);
							found = true;
							break;
						}
					}
					
					if(found){
						break;
					}
				}
				
				if(found){
					break;
				}
				
				for(int i = 0; i < shot.clash; i++){
					is_wall[shot.clash_list[i][1]][shot.clash_list[i][0]] = true;
				}
			}
			
			if(!found){
				System.out.println(-1);
			}
		}
		
	}

}