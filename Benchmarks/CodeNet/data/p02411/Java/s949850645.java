import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public enum GRADE{
		A,
		B,
		C,
		D,
		F;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	static int m=0,f=0,r=0;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//成績を管理するリスト
		ArrayList<String> results = new ArrayList<String>();
		
		//入力処理
		while (inputNums()) {

			// 成績判定
			results.add(gradeing(m, f, r).toString());
		}

		//出力処理
		print(results);

	}

	//入力処理
	static boolean inputNums() {
		
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		if(m == -1 && f == -1 && r == -1) {
			return false;
		}else {
			return true;
		}
	}
	
	//成績評価
	static GRADE gradeing(int m, int f, int r) {
		// F
		if (m < 0 || f < 0) {
			return GRADE.F;
		}

		// A
		if (m + f >= 80) {
			return GRADE.A;
		}

		// B
		if (m + f >= 65) {
			return GRADE.B;
		}

		// C
		if (m + f >= 50||r>=50) {
			return GRADE.C;
		}

		// D
		if (m + f >=30 ) {
			return GRADE.D;
		}

		// F
		return GRADE.F;

	}
	
	//表示処理
	static void print(ArrayList<String> results) {
		results.forEach(s -> System.out.println(s));
	}

}

