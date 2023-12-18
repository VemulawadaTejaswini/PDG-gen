import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		String str = sc1.next();
		int count = 0;
		int rest = 15 - str.length();

		for ( int i = 0 ; i < str.length() ; i++ ) {
			if(str.charAt(i) == 'o') {
				count++;
			}
		}

		if ((count + rest) >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc1.close();

	}

}
