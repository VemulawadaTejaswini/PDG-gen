

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		String ans="No";

		if(x>=30) {
			ans="Yes";
		}

		System.out.println(ans);

		scanner.close();

	}

}
