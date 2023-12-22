import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 出力

		if ((a >= 1 && a <= 9) && (b >= 1 && b <= 9)) {
			System.out.println(a * b);
		} else {
			System.out.println(-1);
		}

	}

}