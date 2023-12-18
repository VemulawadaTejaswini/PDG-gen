import java.util.Arrays; 
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Pos{
		int x, y;

		public Pos(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			boolean[][] is_visited = new boolean[H][W];
			boolean[][] is_wall = new boolean[H][W];
			
			int s_x = -1, s_y = -1;
			
			for(int i = 0; i < H; i++){
				char[] ch = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++){
					is_visited[i][j] = false;
					is_wall[i][j] = ch[j] == '#';
					
					if(ch[j] == '@'){
						s_x = j;
						s_y = i;
					}
				}
			}
			
			LinkedList<Pos> queue = new LinkedList<Pos>();
			
			queue.add(new Pos(s_x, s_y));
			int count = 0;
			
			while(!queue.isEmpty()){
				Pos pos = queue.poll();
				
				if(is_visited[pos.y][pos.x]){
					continue;
				}
				
				is_visited[pos.y][pos.x] = true;
				count++;
				
				if(pos.x != 0 && !is_wall[pos.y][pos.x - 1] && !is_visited[pos.y][pos.x - 1]){
					queue.add(new Pos(pos.x - 1, pos.y));
				}
				
				if(pos.x != W-1 && !is_wall[pos.y][pos.x + 1] && !is_visited[pos.y][pos.x + 1]){
					queue.add(new Pos(pos.x + 1, pos.y));
				}
				
				if(pos.y != 0 && !is_wall[pos.y - 1][pos.x] && !is_visited[pos.y - 1][pos.x]){
					queue.add(new Pos(pos.x, pos.y - 1));
				}
				
				if(pos.y != H-1 && !is_wall[pos.y + 1][pos.x] && !is_visited[pos.y + 1][pos.x]){
					queue.add(new Pos(pos.x, pos.y + 1));
				}
			}
			
			System.out.println(count);
		}
		
	}
}