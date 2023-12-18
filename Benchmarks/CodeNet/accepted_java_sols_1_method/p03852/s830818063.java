import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = s.charAt(0);
		if(c=='a' || c=='i' || c=='u' || c=='e' || c=='o' ) {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}

}
