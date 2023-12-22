import java.util.Scanner;

// https://atcoder.jp/contests/abc086/tasks/abc086_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(a*b%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		scanner.close();
	}

}