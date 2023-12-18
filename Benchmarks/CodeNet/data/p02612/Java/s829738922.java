import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//
		// 処理
		//
		// 境界値 0, 1000, 10000

		int count = 0;
		if(n % 1000 == 0) {
			count = n / 1000;
		}else {
			count = n / 1000 + 1;
		}
		System.out.println(1000 * count - n);

	}

}
