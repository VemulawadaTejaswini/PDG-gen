import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static class Result {
		// 成績の種類
		public enum GRADE {
			A, B, C, D, F;
		}

		GRADE grade = GRADE.F;

		// 成績判定
		Result(int m, int f, int r) {
			if (m < 0 || f < 0) {
				return;
			} else if (m + f >= 80) {
				grade = GRADE.A;
			} else if (m + f >= 65) {
				grade = GRADE.B;
			} else if (m + f >= 50 || r >= 50) {
				grade = GRADE.C;
			} else if (m + f >= 30) {
				grade = GRADE.D;
			}
		}
	}

	static Scanner sc = new Scanner(System.in);

	static int m = 0, f = 0, r = 0;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 成績を管理するリスト
		ArrayList<Result> ResultList = new ArrayList<Result>();

		// 入力処理
		while (inputNums()) {
			// 成績を生成
			Result result = new Result(m, f, r);
			// リストに追加
			ResultList.add(result);
		}

		// 出力処理
		print(ResultList);
	}

	// 入力処理
	static boolean inputNums() {

		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		if (m == -1 && f == -1 && r == -1) {
			return false;
		} else {
			return true;
		}
	}

	// 表示処理
	static void print(ArrayList<Result> List) {
		List.forEach(v -> System.out.println(v.grade.toString()));
	}

}

