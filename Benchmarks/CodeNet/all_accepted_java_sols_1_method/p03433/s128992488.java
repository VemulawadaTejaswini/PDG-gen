import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int A = sc.nextInt();
		String ans = "No";
		if (N % 500 <= A) {
			ans = "Yes";
		}

		// 出力
		System.out.println(ans);
	}
}
