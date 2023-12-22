import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;

		//数値を文字列に変換
		String str = String.valueOf(N);

		for (int i = 0; i < str.length(); i++) {
			String sub = str.substring(i,i+1);
			int x = Integer.parseInt(sub);

			sum = sum + x;
		}

		if (N%sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}