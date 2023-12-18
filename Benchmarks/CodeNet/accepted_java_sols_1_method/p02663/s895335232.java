import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int OneTime = H1 * 60 + M1;
		int TwoTime = H2 * 60 + M2;

		System.out.println(TwoTime-OneTime-K);
	}

}
