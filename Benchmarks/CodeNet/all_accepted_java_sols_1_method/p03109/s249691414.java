

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

	//日付が4月30以降の時1になる→.compareTo("2019/04/30")
			if (S.compareTo("2019/04/30") > 0) {

				System.out.println("TBD");
			}else {
				System.out.println("Heisei");
			}

	}
}