import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int r = sc1.nextInt();

		if ( r < 1200) {
			System.out.println("ABC");
		}
		else if ( r < 2800) {
			System.out.println("ARC");
		}
		else {
			System.out.println("AGC");
		}

		sc1.close();

	}

}