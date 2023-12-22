
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		String s = sc.next();
//
//		System.out.println(s.equals("Sunny") ? "Cloudy" : s.equals("Cloudy") ? "Rainy" : "Sunny");
//
//	}
//}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean flg = false;

		for (int i = 0; i < s.length(); i = i + 2) {
			if (!(s.charAt(i) == 'R' || s.charAt(i) == 'U' || s.charAt(i) == 'D')) {
				flg = true;
				break;
			}
		}

		for (int i = 1; i < s.length(); i = i + 2) {
			if (!(s.charAt(i) == 'L' || s.charAt(i) == 'U' || s.charAt(i) == 'D')) {
				flg = true;
				break;
			}
		}

		if (flg) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}