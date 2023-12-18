import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int val = (a + b + c) / 2;

		int ans = (int) Math.sqrt(val * (val - a) * (val - b) * (val - c));

		System.out.println(ans);

		sc.close();
	}
}