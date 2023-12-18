import java.util.Scanner;

public class Main {
	
	//private static final int[][] move = new int[][]{{0, -1},{1, 0}, {0, 1}, {-1, 0}};
	private static final int[] vx = new int[]{ 0, 1, 0, -1};
	private static final int[] vy = new int[]{-1, 0, 1,  0};
	
	private static int H = 0;
	private static int W = 0;
	private static int white_count = 0;
	
	private static boolean[][] using;
	private static int sx = -1;
	private static int sy = -1;
	
	private static boolean ans;
	
	private static boolean ok(final int x, final int y){
		if(0 <= x && x < W && 0 <= y && y < H){
			return true;
		}
		return false;
	}
	
	private static boolean chech(final int x, final int y){
		for(int j = 0; j < 4; j++){
			final int nx = x + vx[j];
			final int ny = y + vy[j];
			
			if(!ok(nx, ny)){
				continue;
			}else if(nx == sx && ny == sy){
				continue;
			}else if(using[ny][nx]){
				continue;
			}
			
			int count = 0;
			for(int k = 0; k < 4; k++){
				final int nnx = nx + vx[k];
				final int nny = ny + vy[k];
				
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
	
	private static void search(final int x, final int y, int count){
		if(ans){
			return;
		}
		
		if(white_count - count < Math.abs(x - sx) + Math.abs(y - sy)){
			return;
		}
		
		//System.out.println(x + " " + y + " " + count);
		
		for(int i = 0; i < 4; i++){
			final int nx = x + vx[i];
			final int ny = y + vy[i];
			
			if(!ok(nx, ny)){
				continue;
			}else if(nx == sx && ny == sy){
				if(count + 1 == white_count){
					ans = true;
				}
				
				return;
			}else if(using[ny][nx]){
				continue;
			}else if(!chech(nx, ny)){
				continue;
			}
			using[ny][nx] = true;
			
			search(nx, ny, count + 1);
					
			using[ny][nx] = false;
		}
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
						for(int k = 0; k < 4; k++){
							final int nx = j + vx[k];
							final int ny = i + vy[k];
							
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
					ans = false;
					search(sx, sy, 0);
					System.out.println(ans ? "Yes" : "No");
					//times.add("" + (System.nanoTime() - time) / 1000000000.0);
				}
			}
			
		}
			
	}

}