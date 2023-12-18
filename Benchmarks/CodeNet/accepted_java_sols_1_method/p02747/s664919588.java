import java.util.Scanner;

//日立製作所 社会システム事業部 プログラミングコンテスト2020
//A - Hitachi String
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		S = S.replaceAll("hi", "");
		if (S.length() == 0) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}

}
