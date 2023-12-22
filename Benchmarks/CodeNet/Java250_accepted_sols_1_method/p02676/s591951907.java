import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数の入力
		int K = sc.nextInt();
		//文字列の入力
		String S = sc.next();
		//配列の定義
		char [] s = new char [K];
		//条件分岐
		if (S.length() <= K) {
			System.out.println(S);
		}else {  //文字列の切り出し
			for(int i = 0; i < K; i++) {
				s[i] = S.charAt(i);
				System.out.print(s[i]);
			}
			System.out.println("...");
		}
	}

}
