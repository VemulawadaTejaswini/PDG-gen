import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;



class Main{
	public static void main(String args[]){
		(new Main()).sets();
	}


	ArrayList<Integer[]> setArray;

	void sets(){
		// 標準入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		// 集合定義のためのハッシュ
		try{
			while((str = br.readLine()) != null){
				// メソッドと引数を分離
				String input_strs[] = str.split(" ");
				int v = Integer.parseInt(input_strs[0]);
				int d = Integer.parseInt(input_strs[1]);
				setArray = new ArrayList<Integer[]>();

				int fibs[] = {1, 1, 2};

				for(int i = 0; i < v; i++){
					fibs[2] = fibs[2] % 1001;
					//System.out.println(fibs[2]);

					checkSet(fibs[2], d);

					fibs[0] = fibs[1];
					fibs[1] = fibs[2];
					fibs[2] = fibs[0] + fibs[2];
				}
				//printArray(setArray);
				System.out.println(setArray.size());
			}
		}catch(Exception e){
			//System.err.println(e);
		}
	}

	void checkSet(int fib, int d){
		Integer newSet[] = {fib, fib};
		ArrayList<Integer[]> removeSet = new ArrayList<Integer[]>();
		for(int i = 0; i < setArray.size(); i++){
			Integer targetSet[] = setArray.get(i);

			// 重なってない場合1: newSet が下にあるとき
			if(newSet[1] < targetSet[0]){
				if(targetSet[0] - newSet[1] < d){
					newSet[1] = targetSet[1];
					//setArray.remove(targetSet);
					removeSet.add(targetSet);
				}

			// 重なってない場合2: newSet が上にあるとき
			}else if(targetSet[1] < newSet[0]){
				if(newSet[0] - targetSet[1] < d){
					newSet[0] = targetSet[0];
					//setArray.remove(targetSet);
					removeSet.add(targetSet);
				}

			// そうでない = 重なっているとき
			}else{
				newSet[0] = Math.min(newSet[0], targetSet[0]);
				newSet[1] = Math.max(newSet[1], targetSet[1]);
				//setArray.remove(targetSet);
				removeSet.add(targetSet);
			}
		}
		setArray.removeAll(removeSet);
		setArray.add(newSet);
		//printArray(setArray);
	}

	void printArray(ArrayList<Integer[]> array){
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