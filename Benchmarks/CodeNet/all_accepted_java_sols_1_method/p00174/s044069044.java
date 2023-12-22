import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String s1, s2, s3;

		while (true) {
			s1 = sc.next();
			if (s1.equals("0")) {
				break;
			}
			s2 = sc.next();
			s3 = sc.next();
			
			a = 0;
			b = 0;
			for (int i = 1; i < s1.length(); i++) {
				if (s1.charAt(i) == 'A') {
					a++;
				} else {
					b++;
				}
			}
			if (s2.charAt(0) == 'A') {
				a++;
			} else {
				b++;
			}
			System.out.println(a + " " + b);
			
			a = 0;
			b = 0;
			for (int i = 1; i < s2.length(); i++) {
				if (s2.charAt(i) == 'A') {
					a++;
				} else {
					b++;
				}
			}
			if (s3.charAt(0) == 'A') {
				a++;
			} else {
				b++;
			}
			System.out.println(a + " " + b);
			
			a = 0;
			b = 0;
			for (int i = 1; i < s3.length(); i++) {
				if (s3.charAt(i) == 'A') {
					a++;
				} else {
					b++;
				}
			}
			if (b < a) {
				a++;
			} else {
				b++;
			}
			System.out.println(a + " " + b);
		}
	}
}