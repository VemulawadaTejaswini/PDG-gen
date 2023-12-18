import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	static int sx, sy, gx, gy;
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
				String strs[] = br.readLine().split(" ");
				int h = Integer.parseInt(strs[1]);
				int w = Integer.parseInt(strs[0]);
				if(h == 0) return;
				
				int tile[][] = new int[h][w];
				for(int i = 0; i < h; i++){
					strs = br.readLine().split(" ");
					for(int j = 0; j < w; j++){
						tile[i][j] = Integer.parseInt(strs[j]);
						if(tile[i][j] == 2){
							sy = i;
							sx = j;
						}
						if(tile[i][j] == 3){
							gy = i;
							gx = j;
						}
					}
				}
				//System.out.println(sy + " " + sx + " " + gy + " " + gx);
				int ans = solve(tile, sx, sy, 0);
				if(ans == 11){
					System.out.println("-1");
				}else{
					System.out.println(ans);
				}
			}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	public static int solve(int tile[][], int x, int y, int count){
		tile[y][x] = 2;
		// printMatrix(tile);
		if(count >= 10) return 11;
		int up = 11, right = 11, down = 11, left = 11;
		// 上
		if(y > 0 && tile[y-1][x] != 1){
			// System.out.println("上に動かせる");
			up = goUp(tile, x, y, count);
		}
		
		// 右
		if(x < tile[y].length-1 && tile[y][x+1] != 1){
			// System.out.println("右に動かせる");
			right = goRight(tile, x, y, count);
		}
		
		// 下
		if(y < tile.length-1 && tile[y+1][x] != 1){
			// System.out.println("下に動かせる");
			down = goDown(tile, x, y, count);
		}
		
		// 左
		if(x > 0 && tile[y][x-1] != 1){
			// System.out.println("左に動かせる");
			left = goLeft(tile, x, y, count);
		}
		return up;
	}
	
	public static int goDown(int tile[][], int x, int y, int count){
		count++;
		// System.out.println("下に動かす" + count);
		for(; y < tile.length-1; y++){
			if(tile[y+1][x] == 3){
				// System.out.println("ゴールです: " + count);
				return count;
			}
			if(tile[y+1][x] == 1){
				// System.out.println("壁にぶつかった");
				tile[y+1][x] = 0;
				int result = solve(tile, x, y, count);
				tile[y+1][x] = 1;
				return result;
			}
		}
		return 11;
	}
	
	public static int goRight(int tile[][], int x, int y, int count){
		count++;
		// System.out.println("右に動かす" + count);
		for(; x < tile[y].length-1; x++){
			if(tile[y][x+1] == 3){
				// System.out.println("ゴールです: " + count);
				return count;
			}
			if(tile[y][x+1] == 1){
				// System.out.println("壁にぶつかった");
				tile[y][x+1] = 0;
				int result = solve(tile, x, y, count);
				tile[y][x+1] = 1;
				return result;
			}
		}
		return 11;
	}
	
	public static int goUp(int tile[][], int x, int y, int count){
		count++;
		// System.out.println("上に動かす" + count);
		for(; y > 0; y--){
			if(tile[y-1][x] == 3){
				// System.out.println("ゴールです: " + count);
				return count;
			}
			if(tile[y-1][x] == 1){
				// System.out.println("壁にぶつかった");
				tile[y-1][x] = 0;
				int result = solve(tile, x, y, count);
				tile[y-1][x] = 1;
				return result;
			}
		}
		return 11;
	}
	
	public static int goLeft(int tile[][], int x, int y, int count){
		count++;
		// System.out.println("左に動かす" + count);
		for(; x > 0; x--){
			if(tile[y][x-1] == 3){
				// System.out.println("ゴールです: " + count);
				return count;
			}
			if(tile[y][x-1] == 1){
				// System.out.println("壁にぶつかった");
				tile[y][x-1] = 0;
				int result = solve(tile, x, y, count);
				tile[y][x-1] = 1;
				return result;
			}
		}
		return 11;
	}
	
	
	public static void printArray(int array[]){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + "\t");
		System.out.println();
	}

	public static void printArray(boolean array[]){
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + "\t");
		System.out.println();
	}
	
	public static void printMatrix(int matrix[][]){
		for(int i = 0; i < matrix.length; i++){
			printArray(matrix[i]);
		}
	}
	
	public static void printMatrix(boolean matrix[][]){
		for(int i = 0; i < matrix.length; i++){
			printArray(matrix[i]);
		}
	}
}