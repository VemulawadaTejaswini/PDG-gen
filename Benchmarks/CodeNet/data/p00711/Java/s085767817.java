import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	static int answer;
	static char tiles[][];
	static int w;
	static int h;

	public static void main(String args[]){
		// 標準入力準備
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String str = new String();



		// 集合定義のためのハッシュ
		try{
			while(true){
				w = sc.nextInt();
				h = sc.nextInt();

				if(w == 0) break;

				answer = 0;
				tiles = new char[h][w];
				solve();
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static void solve(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0, y = 0;
		try{
			for(int i = 0; i < h; i++){
				System.out.println("readLine " + i);
				String str = br.readLine();
				for(int j = 0; j < w; j++){
					tiles[i][j] = str.charAt(j);
					if(tiles[i][j] == '@'){
						y = i;
						x = j;
					}
				}
			}
		}catch(Exception e){
			System.err.println(e);
		}

		printMatrix(tiles);
		//df(x, y);
		System.out.println(answer);
	}

	static void df(int x, int y){
		System.out.println("位置: (" + x + "," + y + ")");
		tiles[y][x] = '#';
		answer++;

		// 上
		if(y >= 0 && tiles[x][y-1] != '#')
			df(x, y-1);

		// 右
		if(x < w && tiles[x+1][y] != '#')
			df(x+1, y);

		// 下
		if(y < h && tiles[x][y+1] != '#')
			df(x, y+1);

		// 左
		if(x >= 0 && tiles[x-1][y] != '#')
			df(x-1, y);

	}


	static void printArray(ArrayList<Integer[]> array){
		System.out.println("PrintArray " + array.size());
		for(int i = 0; i < array.size(); i++){
			Integer set[] = array.get(i);
			System.out.print("(" + set[0] + ", " + set[1] + ")");
		}
		System.out.println();
	}

	static void printMatrix(int matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static void printMatrix(boolean matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static void printMatrix(char matrix[][]){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column]);
			}
			System.out.println();
		}
	}

	static void printArray(int array[]){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}

class OriginalSet{
	public ArrayList<Integer> set;

	OriginalSet(){
		set = new ArrayList<Integer>();
	}

	public void add(int inputInt){
		if(set.indexOf(inputInt) == -1){
			set.add(inputInt);
		}
	}

	public void addAll(OriginalSet inputSet){
		ArrayList<Integer> inputArray = inputSet.set;
		for(int i = 0; i < inputArray.size(); i++){
			add(inputArray.get(i));
		}
	}

	public void remove(int inputInt){
		set.remove((Integer)inputInt);
	}

	public void removeAll(OriginalSet inputSet){
		ArrayList<Integer> inputArray = inputSet.set;
		for(int i = 0; i < inputArray.size(); i++){
			remove(inputArray.get(i));
		}
	}

	public void print(){
		if(set.size() == 0){
			System.out.println("NULL");
			return;
		}
		// ソート
		Collections.sort(set);
		System.out.print(set.get(0));
		for(int i = 1; i < set.size(); i++){
			System.out.print(" " + set.get(i));
		}
		System.out.println();
	}
}