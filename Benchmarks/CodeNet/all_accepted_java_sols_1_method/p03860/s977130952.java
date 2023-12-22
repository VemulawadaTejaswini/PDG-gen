import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//文字列の入力
		String a = sc.next();
		String s = sc.next();
		String c = sc.next();
		//最初の文字の抜き出し(s)
		char S [] = new char [s.length()];
		S[0] = s.charAt(0);
		System.out.println("A" + S[0] + "C");

	}

}
