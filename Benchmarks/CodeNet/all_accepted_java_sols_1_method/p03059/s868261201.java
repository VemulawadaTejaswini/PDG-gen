import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. 入力データの処理
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		sc.close();

		int productNum = T / A;
		System.out.println(productNum * B);
	}

}