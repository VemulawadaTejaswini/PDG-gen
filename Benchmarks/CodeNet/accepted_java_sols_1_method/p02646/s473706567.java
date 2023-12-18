

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		Long A = scan.nextLong();
		Long V = scan.nextLong();
		Long B = scan.nextLong();
		Long W = scan.nextLong();
		Long T = scan.nextLong();

		Long x = B-A;
		if(x<0) {
			x = x*(-1L);
		}

		if(V>W) {
			if(x <= (V-W)*T) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
	}

}
