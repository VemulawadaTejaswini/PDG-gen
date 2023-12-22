import java.util.Scanner;

public class Main {

	/*
	 * 必要なタップ数を求める
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();

		/*
		 * とりあえずa個あって1つあたりa-1個ずつ増えると考えてみる。
		 */

		int count = 0;
		int sum = 0;
		//count:タップの個数、sum:差込口の数
		if (b != 1) {
			//b=1の時、タップがそもそもいらない。
			count++;
			sum = a;
			while (sum < b) {
				count++;
				sum += (a - 1);
			}
		}

		System.out.println(count);

	}

}
