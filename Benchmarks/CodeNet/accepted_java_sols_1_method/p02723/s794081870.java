import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

//	文字列の判別
		if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
