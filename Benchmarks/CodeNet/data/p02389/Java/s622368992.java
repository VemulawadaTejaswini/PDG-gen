import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int ans1 = a * b;
		int ans2 = 2 * a + 2 *b;
		System.out.println(ans1 + " " + ans2);

		sc1.close();

	}

}
