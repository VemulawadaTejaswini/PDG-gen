import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		char seven = '7';
		if(N.charAt(0) == seven
			|| N.charAt(1) == seven
			|| N.charAt(2) == seven) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
