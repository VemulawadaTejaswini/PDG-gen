import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();

		if ( n % 2 == 0) {
			System.out.println(n);
		}
		else {
			System.out.println(n * 2);
		}

		sc1.close();

	}

}