import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		
		// 結果の出力
		if (S == "RRR") {
			System.out.println(3);
		}
		else if (S.contains("RR")) {
			System.out.println(2);
		}
		else if (S.contains("R")) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		sc.close();
	}
}
