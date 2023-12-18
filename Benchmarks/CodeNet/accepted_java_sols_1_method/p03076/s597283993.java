import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int max = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			sum += num;

			int x = 0;
			if (num % 10 != 0) {
				x = 10 - (num % 10);
			}
			sum += x;

			max = Math.max(max, x);
			//System.out.println(sum);
		}

		sum -= max;

		System.out.println(sum);
	}

}
