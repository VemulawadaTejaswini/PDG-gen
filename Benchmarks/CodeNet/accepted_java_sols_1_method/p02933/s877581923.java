

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();

		if(3200 <= a) {
			System.out.println(s);
		}else {
			System.out.println("red");
		}
	}

}
