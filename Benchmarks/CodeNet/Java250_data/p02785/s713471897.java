import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//モンスターのヒットポイント
		int h = sc.nextInt();
		//必殺技の種類
		int n = sc.nextInt();

		//敵の数
		int[] enemy = new int[h];

		for (int i = 0; i < h; i++) {
			enemy[i] = Integer.parseInt(sc.next());

		}
		Arrays.sort(enemy);
		h -= n;
		long num = 0L;

		for (int i = 0; i < h; i++) {
			num += enemy[i];

		}
		System.out.println(num);
		sc.close();

	}

}
