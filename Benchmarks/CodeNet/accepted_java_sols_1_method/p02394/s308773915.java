import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int w = sc1.nextInt();
		int h = sc1.nextInt();
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		int r = sc1.nextInt();
		boolean flg = true;

		//横チェック
		if ( x - r < 0 | x + r > w) {
			flg = false;
		}

		//縦チェック
		if ( y - r < 0 | y + r > h) {
			flg = false;
		}

		if(flg) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		sc1.close();

	}

}
