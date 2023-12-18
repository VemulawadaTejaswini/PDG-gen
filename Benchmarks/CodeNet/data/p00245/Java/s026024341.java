import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static class Walk{
		int x, y, bit, price, time;

		public Walk(int x, int y, int time, int bit, int price) {
			super();
			this.x = x;
			this.y = y;
			this.bit = bit;
			this.price = price;
			this.time = time;
		}
	}
	
	public static int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			
			int[][] map = new int[H][W];
			int sx = -1, sy = -1;
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					char[] in = sc.next().toCharArray();
					
					if('0' <= in[0] && in[0] <= '9'){
						map[i][j] = (in[0] - '0');
					}else if(in[0] == 'P'){
						map[i][j] = -1;
						sx = j;
						sy = i;
					}else{
						map[i][j] = -1;
					}
				}
			}
			
			final int n = sc.nextInt();
			
			int[] prices = new int[10];
			int[] start = new int[10];
			int[] end = new int[10];
			Set<Integer> set = new HashSet<Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int max_time = 0;
			for(int i = 0; i < n; i++){
				final int g = sc.nextInt();
				
				prices[g] = sc.nextInt();
				start[g] = sc.nextInt();
				end[g] = sc.nextInt();
				set.add(g);
				list.add(g);
				
				max_time = Math.max(max_time, end[g]);
			}
			Collections.sort(list);
			
			boolean[][][] visited = new boolean[H][W][1 << n];
			boolean[][][] in_queue = new boolean[H][W][1 << n];
			
			Queue<Walk> queue = new LinkedList<Walk>();
			queue.add(new Walk(sx, sy, 0, 0, 0));
			in_queue[sy][sx][0] = true;
			
			int max = 0;
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				//System.out.println(walk.x + " " + walk.y + " " + walk.price + " " + walk.time + " " + Integer.toBinaryString(walk.bit));
				
				in_queue[walk.y][walk.x][walk.bit] = false;
				if(visited[walk.y][walk.x][walk.bit]){
					continue;
				}
				visited[walk.y][walk.x][walk.bit] = true;
				
				if(walk.bit == (1 << n) - 1 || walk.time >= max_time){
					max = Math.max(max, walk.price);
					continue;
				}
				
				//buy
				for(int[] move : move_dir){
					final int nx = walk.x - move[0];
					final int ny = walk.y - move[1];
						
					if(nx < 0 || nx >= W || ny < 0 || ny >= H){
						continue;
					}else if(map[ny][nx] < 0){
						continue;
					}else if(!set.contains(map[ny][nx])){
						continue;
					}
					
					final int pos = Collections.binarySearch(list, map[ny][nx]);
					
					if(walk.time < start[pos]){
						continue;
					}else if(walk.time >= end[pos]){
						continue;
					}else if((walk.bit & (1 << pos)) != 0){
						continue;
					}
					
					//buy
					walk.bit |= (1 << pos);
					walk.price += prices[pos];
				}
				
				max = Math.max(max, walk.price);
				
				//next
				for(int[] move : move_dir){
					final int nx = walk.x - move[0];
					final int ny = walk.y - move[1];
					
					if(nx < 0 || nx >= W || ny < 0 || ny >= H){
						continue;
					}else if(map[ny][nx] >= 0){
						continue;
					}else if(visited[ny][nx][walk.bit]){
						continue;
					}else if(in_queue[ny][nx][walk.bit]){
						continue;
					}else{
						queue.add(new Walk(nx, ny, walk.time + 1, walk.bit, walk.price));
						in_queue[ny][nx][walk.bit] = true;
					}
				}
			}
			
			System.out.println(max);
		}
	}

}