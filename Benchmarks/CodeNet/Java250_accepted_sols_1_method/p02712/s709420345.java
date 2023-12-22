import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		long sum = 0;

		//入力した数分繰り返す
		for (int j = 1; j <= i; j++) {

			//Jが3、5両方割りきれる
			if (j % 3 == 0 && j % 5 == 0) {
				continue;
			}
			//Jが3で割り切れる
			else if (j % 3 == 0) {
				continue;
			}
			//Jが5で割り切れる
			else if (j % 5 == 0) {
				continue;
			}
			//3でも5でも割り切れない
			else {

			}
			sum += j;

		}
		System.out.println(sum);

		sc.close();

	}

}
