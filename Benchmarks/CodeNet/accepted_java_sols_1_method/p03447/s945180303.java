import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = (X - A) % B;

		// 出力
		System.out.println(ans);
	}
}