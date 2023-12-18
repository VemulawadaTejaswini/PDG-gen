

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");

		}

	}

}