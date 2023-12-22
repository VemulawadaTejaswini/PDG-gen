import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//モンスターのヒットポイント
		int h = sc.nextInt();
		//必殺技の種類
		int n = sc.nextInt();
		//アライグマの初期値
		int cr = 0;

		for (int i = 0; i < n; i++) {
			cr += Integer.parseInt(sc.next());

		}
		//同じ技を使わない
		if(cr >= h) {
			System.out.println("Yes");
		}
		//それ以外
		else {
			System.out.println("No");
		}
		sc.close();

	}

}