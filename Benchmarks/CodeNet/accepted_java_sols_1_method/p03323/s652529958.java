import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();

		if ( a < 9 && b < 9) {
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}

		sc1.close();
	}

}