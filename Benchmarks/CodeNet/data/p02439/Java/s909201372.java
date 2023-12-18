import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
		ArrayList<Integer> arrA = new ArrayList<Integer>();
		int max = 0, min = 0;
//		入力値を取得する処理
		Scanner scInputData = new Scanner(System.in);
		while(scInputData.hasNext()) {
			arrA.add(scInputData.nextInt());
		}
		max = Math.max(arrA.get(0), arrA.get(1));
		max = Math.max(arrA.get(2), max);
		
		min = Math.min(arrA.get(0), arrA.get(1));
		min = Math.min(arrA.get(2), min);

		System.out.println(min + " " + max);
		
		
		scInputData.close();

	}

}

