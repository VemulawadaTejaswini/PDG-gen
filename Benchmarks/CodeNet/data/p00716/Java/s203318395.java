import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	static char tiles[][];
	static String dp_tiles[][];
	static int w;
	static int h;
	static String answer;
	public static void main(String args[]){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		//String str = new String();

		try{
			int n = Integer.parseInt(br.readLine());

			for(int i = 0; i < n; i++){
				int gankin = Integer.parseInt(br.readLine());
				int year = Integer.parseInt(br.readLine());
				int datanum = Integer.parseInt(br.readLine());
				int answer = 0;
				for(int j = 0; j < datanum; j++){
					String strs[] = br.readLine().split(" ");
					int torf = Integer.parseInt(strs[0]);
					double riritu = Double.parseDouble(strs[1]);
					int tesuu = Integer.parseInt(strs[2]);
					int thisAnswer;
					if(torf == 0){
						thisAnswer = tanri(gankin, riritu, year, tesuu);
					}else{
						thisAnswer = fukuri(gankin, riritu, year, tesuu);
					}

					if(thisAnswer > answer) answer = thisAnswer;
				}
				System.out.println(answer);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static int tanri(int gankin, double riritu, int year, int tesuu){
		int money = gankin;
		for(int y = 0; y < year; y++){
			//System.out.println(gankin * riritu);
			money += (gankin * riritu);
			gankin -= tesuu;
			money -= tesuu;
			//System.out.print("少女計算中: " + y + "年目, " + money + "円 ");
		}
		return money;
	}

	static int fukuri(int gankin, double riritu, int year, int tesuu){
		for(int y = 0; y < year; y++){
			//System.out.println(gankin * riritu);
			gankin += (gankin * riritu);
			gankin -= tesuu;
			//System.out.print("少女計算中: " + y + "年目, " + gankin + "円 ");
		}
		return gankin;
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