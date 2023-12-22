
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Coin500 = 0;
		int Coin5 = 0;

		while(X >= 500) {
			X = X - 500;
			Coin500++;
		}
		while(X >= 5) {
			X = X - 5;
			Coin5++;
		}

		System.out.println(Coin500*1000 + Coin5*5);
	}

}
