

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();

		if(str.length() % 2 == 1) {
			System.out.println("No");
			return;
		}

		if(str.substring(0, str.length()/2).equals(str.substring(str.length()/2))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
