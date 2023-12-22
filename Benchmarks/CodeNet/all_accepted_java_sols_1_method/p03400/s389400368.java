import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int total = 0;
		int n =0;
		int d =0;
		int x =0;
		int a =0;

		n = sc1.nextInt();
		d = sc1.nextInt();
		x = sc1.nextInt();

		for (int i = 0 ; i < n ; i++) {
			a = sc1.nextInt();

			for (int j = 0 ; a * j < d ; j++) {
				total++;
			}
		}

		total += x;

		System.out.println(total);

		sc1.close();

	}

}