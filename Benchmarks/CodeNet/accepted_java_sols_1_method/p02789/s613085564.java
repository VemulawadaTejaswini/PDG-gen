import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		String ans;
		n = scanner.nextInt();
		m = scanner.nextInt();

		//橋君の提出が AC となる場合は Yes, そうでない場合は No と出力せよ。

		if (n == m) {
			ans = "Yes";
		} else {
			ans = "No";
		}

		System.out.println(ans);
	}

}