import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		//すぬけ君リスト
		boolean[] arrayGetSweets = new boolean[N];

		for (int i = 0; i < K; i++) {
			//お菓子iを持っている人数
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				//スイーツをもらったすぬけ君の番号
				int GetSweets = sc.nextInt();
				if (!arrayGetSweets[GetSweets - 1]) {
					arrayGetSweets[GetSweets - 1] = true;
				}
			}
		}
		sc.close();

		//お菓子を貰っていない人数をカウント
		int count = 0;
		for (boolean bool : arrayGetSweets) {
			if (!bool) {
				count++;
			}
		}
		System.out.println(count);

	}

}
