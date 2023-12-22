

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int N = Integer.parseInt(lines[0]);
		int A = Integer.parseInt(lines[1]);
		int B = Integer.parseInt(lines[2]);

		if(N * A < B) {
			System.out.println(N*A);
		}else {
			System.out.println(B);
		}
	}

}
