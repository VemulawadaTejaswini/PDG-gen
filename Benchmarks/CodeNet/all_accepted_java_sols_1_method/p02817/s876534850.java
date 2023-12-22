import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	String s = sca.next();
	String t = sca.next();

	// 処理
	String ans = t + s;


	// 出力
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}