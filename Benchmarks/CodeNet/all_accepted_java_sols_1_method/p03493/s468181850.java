import java.util.Scanner;

// https://atcoder.jp/contests/abc081/tasks/abc081_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		int count = str.length() - str.replaceAll("1", "").length();
		System.out.println(count);

		scanner.close();
	}
}