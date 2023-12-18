

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String U = S.toUpperCase();
		String L = S.toLowerCase();


		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i) == U.charAt(i)) {
				System.out.print(L.charAt(i));
			}else {
				System.out.print(U.charAt(i));
			}
		}
		System.out.println();
	}
}

