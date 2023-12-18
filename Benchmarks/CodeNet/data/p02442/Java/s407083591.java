import java.util.ArrayList;
import java.util.Scanner;


public class Main {
//	入力値
	static Scanner scInputData = new Scanner(System.in);
//	配列
	static ArrayList<Integer> arrA = new ArrayList<Integer>();
	static ArrayList<Integer> arrB = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
//		配列Aを取得する処理
		getArr(arrA);
//		配列Bを取得する処理
		getArr(arrB);
//		配列の要素を辞書式順に比較する処理
		compareArr(arrA, arrB);

	}
	
	private static void compareArr(ArrayList<Integer> arrX,
			ArrayList<Integer> arrY) {
//		比較試行回数
		int indexToCompare = (arrX.size() <= arrY.size()) ? arrX.size() : arrY.size();
//		比較判定変数
		boolean compareCheck = false;
//		どちらかが要素取得できない場合、処理を終了
		for( int index=0; index < indexToCompare; index++) {
			compareCheck = compareVal(arrX.get(index), arrY.get(index));
//			引き分け以外は処理を終了
			if(compareCheck) {
				break;
			}
		}
//		最後まで引き分けの場合、配列が長いほうの勝利
		if(compareCheck == false) {
			if(arrX.size() < arrY.size()) {
				winB();
			}else {
				winA();
			}
		}
	}


	private static boolean compareVal(int valX, int valY) {
		if( valX == valY) {
			return false;
		}else if(valX < valY) {
			winB();
			return true;
		}else {
			winA();
			return true;
		}
	}


	private static void winA() {
		System.out.println(0);
	}
	
	private static void winB() {
		System.out.println(1);
	}


	private static void getArr(ArrayList<Integer> arr) {
//		 配列の要素数
		int iArrNum = 0;
		iArrNum = scInputData.nextInt();
		while(arr.size() < iArrNum) {
			arr.add(scInputData.nextInt());
		}
	}

}

