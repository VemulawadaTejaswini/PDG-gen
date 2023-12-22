import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力A(モンスター体力)
		int a = sc.nextInt();

		//入力B(サーバルの攻撃値)
		int b = sc.nextInt();

		int attacked = 0;

		//モンスターの体力を0以下にする
		for (int i = 1; a > 0; i++) {

			a = a - b;

			attacked = i;
		}

		System.out.println(attacked);

	}
}
