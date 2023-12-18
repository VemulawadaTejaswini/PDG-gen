import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//文字の入力
		String s = sc.next();
		//条件分岐
		if(s.equals("a") || s.equals("e") || s.equals("i") ||
				s.equals("o") || s.equals("u")) {
			System.out.println("vowel");
			return;
		}else {
			System.out.println("consonant");
		}
	}

}
