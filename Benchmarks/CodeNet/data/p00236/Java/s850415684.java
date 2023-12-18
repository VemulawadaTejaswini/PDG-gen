import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static final int[][] move = new int[][]{{0, -1},{1, 0}, {0, 1}, {-1, 0}};
	
	public static int H = 0;
	public static int W = 0;
	public static int white_count = 0;
	
	public static boolean[][] using;
	public static int sx = -1;
	public static int sy = -1;
	
	public static boolean ok(final int x, final int y){
		if(0 <= x && x < W && 0 <= y && y < H){
			return true;
		}
		return false;
	}
	
	public static boolean chech(final int x, final int y){
		for(int[] dir1 : move){
			final int nx = x + dir1[0];
			final int ny = y + dir1[1];
			
			if(!ok(nx, ny)){
				continue;
			}else if(nx == sx && ny == sy){
				continue;
			}else if(using[ny][nx]){
				continue;
			}
			
			int count = 0;
			for(int[] dir2 : move){
				final int nnx = nx + dir2[0];
				final int nny = ny + dir2[1];
				
				if(!ok(nnx, nny)){
					continue;
				}else if(using[nny][nnx]){
					continue;
				}
				
				count++;
			}
			
			if(count <= 1){
				return false;
			}
		}
		return true;
	}
	
	public static boolean search(final int x, final int y, int count){
		if(white_count - count < Math.abs(x - sx) + Math.abs(y - sy)){
			return false;
		}
		
		//System.out.println(x + " " + y + " " + count);
		
		for(int[] dir : move){
			final int nx = x + dir[0];
			final int ny = y + dir[1];
			
			if(!ok(nx, ny)){
				continue;
			}else if(nx == sx && ny == sy){
				if(count + 1 == white_count){
					return true;
				}else{
					return false;
				}
			}else if(using[ny][nx]){
				continue;
			}else if(!chech(nx, ny)){
				continue;
			}
			using[ny][nx] = true;
			
			if(search(nx, ny, count + 1)){
				return true;
			}
			
			using[ny][nx] = false;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		ArrayList<String> times = new ArrayList<String>();
		ArrayList<Integer> hs = new ArrayList<Integer>();
		ArrayList<Integer> ws = new ArrayList<Integer>();
		ArrayList<Integer> cs = new ArrayList<Integer>();
		final long start = System.nanoTime();
		*/
		
		while(true){
			//final int W = sc.nextInt();
			//final int H = sc.nextInt();
			
			W = sc.nextInt();
			H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			//boolean[][] is_block = new boolean[H][W];
			//boolean[][] using = new boolean[H][W];
			
			using = new boolean[H][W];
			//int white_count = 0;
			white_count = 0;
			sx = -1;
			sy = -1;
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					using[i][j] = sc.nextInt() == 1;
					
					if(using[i][j] == false){
						white_count++;
						if(sx == -1){
							sx = j;
							sy = i;
						}
					}
				}
			}
			/*
			if((System.nanoTime() - start) > 8000000000L && (H == 7 || W == 7)){
				//System.err.println(hs);
				//System.err.println(ws);
				//System.err.println(cs);
				//System.err.println(times);
				for(int i = 0; i < H; i++){
					for(int j = 0; j < W; j++){
						System.err.print(using[i][j] ? " " : "x"); 
					}
					System.err.println();
				}
				System.err.println("-------");
				
			}
			

			hs.add(H);
			ws.add(W);
			cs.add(white_count);
			final long time = System.nanoTime();
			*/
			if(white_count == 0){
				System.out.println("No");
				//times.add("" + (System.nanoTime() - time) / 1000000000.0);
			}else if(white_count == H * W && H == 7 && W == 7){
				System.out.println("No");
				//times.add("" + (System.nanoTime() - time) / 1000000000.0);
			}else{
				boolean can = true;
				LOOP:
				for(int i = 0; i < H; i++){
					for(int j = 0; j < W; j++){
						if(using[i][j]){
							continue;
						}
						
						int count = 0;
						for(int[] dir: move){
							final int nx = j + dir[0];
							final int ny = i + dir[1];
							
							if(!ok(nx, ny)){
								continue;
							}else if(!using[ny][nx]){
								count++;
							}
						}
						
						if(count <= 1){
							can = false;
							break LOOP;
						}
					}
				}
				
				if(!can){
					System.out.println("No");
					//times.add("" + (System.nanoTime() - time) / 1000000000.0);
				}else{
					System.out.println(search(sx, sy, 0) ? "Yes" : "No");
					//times.add("" + (System.nanoTime() - time) / 1000000000.0);
				}
			}
			
		}
			
	}

}