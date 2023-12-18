

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < 1 || 10000 < a || b < 1 || 10000 < b || c < 1 || 10000 < c) {
			System.out.println("有効範囲は1 =< a,b,c =< 10,000です。");
		} else if (a <= b) {
			if (b <= c) {
				System.out.println(a + " " + b + " " + c);
			} else if (a <= c && c <= b) {
				System.out.println(a + " " + c + " " + b);
			} else if (c <= a) {
				System.out.println(c + " " + a + " " + b);
			}
		} else if (b <= a) {
			if (a <= c) {
				System.out.println(b + " " + a + " " + c);
			} else if (b <= c && c <= a) {
				System.out.println(b + " " + c + " " + a);
			} else if (c <= b) {
				System.out.println(c + " " + b + " " + a);
			}
		}
		sc.close();
	}

}

