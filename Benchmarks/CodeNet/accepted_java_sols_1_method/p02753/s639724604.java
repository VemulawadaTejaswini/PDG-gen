import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		
		//入力表示
		String S = scanner.next();
		
		if(S.equals("AAA") ||S.equals("BBB") ) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
		scanner.close();
	}
}