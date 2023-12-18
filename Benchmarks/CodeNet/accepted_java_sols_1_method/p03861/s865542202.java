

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
//
//		b = Math.max(c,b/c*c);
//		if(a > b){
//			System.out.println(0);
//			return;
//		}
//		a = Math.max(c, a/c*c);
		long n1;

		if(a % c == 0){
			n1 = Math.max(0, a/c - 1);
		}
		else {
			n1 = a/c;
		}

		long n2 = b/c;

		long geta = a == 0 ? 1 : 0;
//		System.out.println(b - a);
		System.out.println(n2 - n1 + geta);
    }
}