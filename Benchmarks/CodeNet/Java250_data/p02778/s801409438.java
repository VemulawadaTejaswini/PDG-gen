import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

	//入力表示
	 String S = scanner.next();
	 
	 //文字数を確認
	 S.length();
	 
	 //空の文字列を用意
	 String t = "";

	 //xを文字数の数繰り返す
	 for(int i=0;i<S.length();i++) {
		 
		 t+="x";
		 
	 }
	 System.out.println(t);

		scanner.close();
	}
}
