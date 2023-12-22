import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int Coin = sc.nextInt();

		//入力したコインを500で割る
		int coin500 = Coin / 500;
		//入力したコインを5で割る
		int coin5 = (Coin % 500) / 5;

		//結果
		int Coinsum = coin500 * 1000 + coin5 * 5;
		System.out.println(Coinsum);

		sc.close();

	}

}
