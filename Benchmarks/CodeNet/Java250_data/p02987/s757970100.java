import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int countA = 1;
		int countB = 1;

		char a;
		char b;

		a = s.charAt(0);
		for (int j = 1; j < s.length(); j++) {
			b = s.charAt(j);
			if (a == b ) {
				countA++;
			}
		}
//		System.out.println(countA);

		if (countA == 2) {
			if (s.charAt(0) != (s.charAt(1))) {
				a = s.charAt(1);
				for (int j = 2; j < s.length(); j++) {
					b = s.charAt(j);
					if (a ==  b) {
						countB++;
					}
				}
			} else {
				a = s.charAt(2);
				b = s.charAt(3);
				if (a == b) {
					countB++;
				}
			}
		}
//		System.out.println(countB);

		if (countA == 2 & countB == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
