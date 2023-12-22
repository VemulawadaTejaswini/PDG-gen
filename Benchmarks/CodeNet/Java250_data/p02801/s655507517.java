import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//入力を繰り返す
		Scanner sc = new Scanner(System.in);

		String  C= sc.next();
		char[] charary=C.toCharArray();
		//入力した次の文字を出力
		int ans = charary[0] + 1;
		System.out.println((char)ans);
	}

}
