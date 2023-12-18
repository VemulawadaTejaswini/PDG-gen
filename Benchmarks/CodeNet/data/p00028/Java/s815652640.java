import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);

		int[] intArray = new int[100];
		while(stdIn.hasNext()){
			intArray[stdIn.nextInt()-1]++;
		}
		int[] indexArray = indexOfMaxArrayNumber(intArray);

		for(int i:indexArray){
			System.out.println(i);
		}
	}
	//受け取った配列のなかで、最大の値を持っている要素の添え字＋１を配列にして返す
	//最大の値が複数あったときは、添え字＋１の値を小さい順に配列に格納して返す
	public static int[] indexOfMaxArrayNumber(int[] intArray){
		List<Integer> indexList = new ArrayList<Integer>();
		int max = 0;
		//intArrayの最大値を求める
		for(int i:intArray){
			max = Math.max(i, max);
		}

		for(int i = 0;i < intArray.length; i++){
			if(intArray[i] == max){
				indexList.add(i + 1);
			}
		}
		int[] indexArray = new int[indexList.size()];
		for(int i = 0;i < indexArray.length; i++){
			indexArray[i] = indexList.get(i);
		}
		return indexArray;
	}
}