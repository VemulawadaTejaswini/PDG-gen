import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	static int points0[][];
	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		//String str = new String();

		try{
			while(true){
				// 折れ線の数
				int n = Integer.parseInt(br.readLine());
				if(n == 0) return;

				// 最初のひとつ
				points0 = input(br);
				//printPoints(points0);

				//比較
				for(int i = 1; i <= n; i++){
					int pointsi[][] = input(br);
					//printPoints(points0);
					if(compare(points0, pointsi)) System.out.println(i);
				}
				System.out.println("+++++");

			}

		}catch(Exception e){
			System.err.println(e);
		}
	}

	static boolean compare(int points1[][], int points2[][]){
		return compareAsce(points1, points2) ||  compareDsce(points1, points2);
	}

	static boolean compareAsce(int points1[][], int points2[][]){
		return compare0(points1, points2) || compare90(points1, points2) || compare180(points1, points2);
	}

	static boolean compareDsce(int points1[][], int points2[][]){
		// 逆向きにする
		int new_points2[][] = new int[points2.length][2];
		int originx = points2[points2.length - 1][0];
		int originy = points2[points2.length - 1][1];
		new_points2[0][0] = 0;
		new_points2[0][1] = 0;
		for(int i = 1; i < points2.length; i++){
			new_points2[i][0] = points2[points2.length - 1 - i][0] - originx;
			new_points2[i][1] = points2[points2.length - 1 - i][1] - originy;
		}
		return compareAsce(points1, new_points2);
	}

	static boolean compare0(int points1[][], int points2[][]){
		for(int i = 0; i < points1.length; i++){
			if(points1[i][0] != points2[i][0] || points1[i][1] != points2[i][1]) return false;
		}
		return true;
	}

	static boolean compare90(int points1[][], int points2[][]){
		for(int i = 0; i < points1.length; i++){
			if(points1[i][0] != points2[i][1] || points1[i][1] != 0 - points2[i][0]) return false;
		}
		return true;
	}

	static boolean compare180(int points1[][], int points2[][]){
		for(int i = 0; i < points1.length; i++){
			if(points1[i][0] != 0 - points2[i][0] || points1[i][1] != 0 - points2[i][1]) return false;
		}
		return true;
	}

	static boolean compare270(int points1[][], int points2[][]){
		for(int i = 0; i < points1.length; i++){
			if(points1[i][0] != 0 - points2[i][1] || points1[i][1] != points2[i][0]) return false;
		}
		return true;
	}

	static int[][] input(BufferedReader br) throws Exception{
		int m = Integer.parseInt(br.readLine());
		int points[][] = new int[m][2];

		// 原点を0に
		String strs[] = br.readLine().split(" ");
		int originx = Integer.parseInt(strs[0]);
		int originy = Integer.parseInt(strs[1]);
		//System.out.println("原点: (" + originx + ", " + originy + ")");
		points[0][0] = 0;
		points[0][1] = 0;

		for(int i = 1; i < m; i++){
			strs = br.readLine().split(" ");
			points[i][0] = Integer.parseInt(strs[0]) - originx;
			points[i][1] = Integer.parseInt(strs[1]) - originy;
		}
		return points;
	}

	static void printPoints(int points[][]){
		for(int i = 0; i < points.length; i++){
			System.out.print("(" + points[i][0] + ", " + points[i][1] + ")\t");
		}
		System.out.println();
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