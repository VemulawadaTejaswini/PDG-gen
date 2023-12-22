import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//正しい
		String s = sc.nextLine();
		//間違い
		String t = sc.nextLine();

		//カウント
		int count = 0;

		//文字の長さを繰り返す
		for(int i= 0;i < s.length();i++) {
			//s,tの判定処理
			if(s.substring(i,i+1).equals(t.substring(i,i+1))){



			}
			//s,tの入力が違う場合
			else {
				count++;
			}
		}
		System.out.println(count);
		sc.close();


	}

}
