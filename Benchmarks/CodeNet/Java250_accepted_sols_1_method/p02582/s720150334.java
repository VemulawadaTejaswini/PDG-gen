import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		char b = a.charAt(0);
		char c = a.charAt(1);
		char d = a.charAt(2);
		char f = 'R';

		if(b==c && c==d && d==f) {

			System.out.println("3");

		}else if((b==c && c==f) || (c==d && d==f)) {

			System.out.println("2");

		}else if(!(b==f || c==f || d==f)) {

			System.out.println("0");

		}else {
			System.out.println("1");
		}
	}
}