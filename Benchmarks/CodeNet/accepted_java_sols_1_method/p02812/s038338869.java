import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		// コンソール入力
		Scanner scan = new Scanner(System.in);
		// 文字列の長さ
		int N = scan.nextInt();
		// 文字列
		String S = scan.next();
		// 入力終わり
		scan.close();
		// カウント用変数
		int result = 0;
		//フラグ
		boolean A = false;
		boolean B = false;

		// 文字列を一文字ずつ取得し、
		// 連続したABCの塊がいくつあるかカウントする
		for(char tmp:S.toCharArray()) {
			if(tmp=='A'&&!A&&!B) {
				A=true;
			}else if(tmp=='B'&&A&&!B) {
				B=true;
			}else if(tmp=='C'&&A&&B) {
				result++;
				A=false;
				B=false;
			}else {
				if(tmp!='A') {
				A=false;
				}
				B=false;
			}
		}
		System.out.println(result);
	}
}