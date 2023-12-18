

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int X = Integer.parseInt(lines[0]);
		int A = Integer.parseInt(lines[1]);

		if(X < A) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
	}

}
