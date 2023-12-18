import java.util.Scanner;

public class clear {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ

		//入力の準備
		Scanner scan = new Scanner(System.in);

		//入力値を受け取る
		String str = scan.next();
		//受け取った文字を数値に変換
		int x = Integer.parseInt(str);

		//xを３乗する
		int anser = 0;
		double y = (double)x;

		double z = Math.pow(y,3.0);
		anser = (int)z;
		


		System.out.println( anser );

		//scan.close();
	}
}

