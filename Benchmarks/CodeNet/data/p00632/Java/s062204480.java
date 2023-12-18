import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
	static int tile[][];
	static Deque<Integer[]> queue;
	static int h, w;
	static int playerMaxTurn;
	
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
				String strs[] = br.readLine().split(" ");
				h = Integer.parseInt(strs[0]);
				w = Integer.parseInt(strs[1]);
				if(h == 0) return;
				
				tile = new int[h][w];
				int ax = 0, ay = 0, bx = 0 , by = 0;
				//test for commit
				
				// フィールド読み取り
				for(int y = 0; y < h; y++){
					String input = br.readLine();
					for(int x = 0; x < w; x++){
						char masu = input.charAt(x);
						switch(masu){
						case '.':
							tile[y][x] = -1;
							break;
						case '#':
							tile[y][x] = -2;
							break;
						case 'A':
							tile[y][x] = 0;
							ax = x;
							ay = y;
							break;
						case 'B':
							tile[y][x] = -1;
							bx = x;
							by = y;
							break;
						}
					}
				}
				// フィールド読み取りここまで
				// printMatrix(tile);
				
				// 到達ターン数の計算
				queue = new ArrayDeque<Integer[]>();
				Integer item[] = {ax, ay, 0};
				queue.addLast(item);
				calc();
				// printMatrix(tile);
				
				// 幽霊の動きをインプット
				String str = br.readLine();
				int pattern_length = str.length();
				char pattern[] = new char[pattern_length];
				for(int i = 0; i < pattern_length; i++){
					pattern[i] = str.charAt(i);
				}
				
				// 幽霊の動きシミュレート
				simulate(bx, by, pattern);
			}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	static void simulate(int x, int y, char pattern[]){
		int turn = 0;
		while(true){
			int beforePositionX = x;
			int beforePositionY = y;
			for(int i = 0; i < pattern.length; i++){
				turn++;
				// System.out.println("turn " + turn + ": " + x + ", " + y);
				switch(pattern[i]){
				case '8': // 上
					if(y >= 1) y--;
					break;
				case '6': // 右
					if(x <= w-2) x++;
					break;
				case '4': // 左
					if(x >= 1) x--;
					break;
				case '2': // 下
					if(y <= h-2) y++;
					break;
				}
				if(tile[y][x] >= 0 && tile[y][x] <= turn){
					System.out.println(turn + " " + y + " " + x);
					return;
				}
			}
			if(turn >= playerMaxTurn){
				if(beforePositionX == x && beforePositionY == y){
					System.out.println("impossible");
					return;
				}
			}
		}
	}
	
	static void calc(){
		// System.out.println("calc");
		if(queue.size() == 0) return;
		Integer item[] = queue.removeFirst();
		int x = item[0];
		int y = item[1];
		int turn = item[2];
		turn++;
		playerMaxTurn = turn;
		// 上
		if(y >= 1 && tile[y-1][x] == -1){
			tile[y-1][x] = turn;
			Integer nextItem[] = {x, y-1, turn};
			queue.addLast(nextItem);
		}
		
		// 下
		if(y <= h-2 && tile[y+1][x] == -1){
			tile[y+1][x] = turn;
			Integer nextItem[] = {x, y+1, turn};
			queue.addLast(nextItem);
		}
		
		// 左
		if(x >= 1 && tile[y][x-1] == -1){
			tile[y][x-1] = turn;
			Integer nextItem[] = {x-1, y, turn};
			queue.addLast(nextItem);
		}
		
		// 右
		if(x <= w-2 && tile[y][x+1] == -1){
			tile[y][x+1] = turn;
			Integer nextItem[] = {x+1, y, turn};
			queue.addLast(nextItem);
		}
		
		calc();
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