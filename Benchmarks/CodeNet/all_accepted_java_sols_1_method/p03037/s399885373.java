import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = 0;
		int max = 1000000;

		for (int i = 0; i < M; i++) {

			min = Math.max(min, sc.nextInt());
			max = Math.min(max, sc.nextInt());
		}
		System.out.println(Math.max(max - min + 1, 0));
	}
}