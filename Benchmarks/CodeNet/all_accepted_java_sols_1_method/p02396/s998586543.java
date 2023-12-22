import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int i = 0;

		while (true) {
			int tmp = sc1.nextInt();
			i++;
			if (tmp > 0) {
				System.out.println("Case " + i + ": " + tmp);
			}
			else break;
		}

		sc1.close();

	}

}

