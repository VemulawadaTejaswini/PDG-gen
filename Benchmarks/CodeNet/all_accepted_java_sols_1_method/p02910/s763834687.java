import java.util.Scanner;

public class Main {

//	高橋君はタップダンスをすることにしました。タップダンスの動きは文字列 
//	S
//	 で表され、
//	S
//	 の各文字は L, R, U, D のいずれかです。各文字は足を置く位置を表しており、
//	1
//	 文字目から順番に踏んでいきます。
//
//	S
//	 が以下の 
//	2
//	 条件を満たすとき、またその時に限り、
//	S
//	 を「踏みやすい」文字列といいます。
//
//	奇数文字目がすべて R, U, D のいずれか。
//	偶数文字目がすべて L, U, D のいずれか。
//	S
//	 が「踏みやすい」文字列なら Yes を、そうでなければ No を出力してください。

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if((c == 'U') || (c == 'D')) {
				continue;
			}
			if(i%2 == 0) {
				if(c != 'R') {
					System.out.println("No");
					return;
				}
			}else if(i%2 == 1) {
				if(c != 'L') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
