

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		String[] ss = S.split("");
		String[] tt = T.split("");

		for (int i = 0; i < ss.length; i++) {
			String kaiten = "";
			kaiten += tt[ss.length - 1];
			for (int j = 0; j <= ss.length - 2; j++) {
				kaiten += tt[j];
			}
			if (kaiten.equals(S)) {
				System.out.println("Yes");
				return;
			}
			tt = kaiten.split("");
		}
		System.out.println("No");
	}
}
