import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int a1 = a % 10;
		int b1 = b % 10;
		int c1 = c % 10;
		int d1 = d % 10;
		int e1 = e % 10;

		int a10 = a;
		if(a%10 != 0) {
			a10 = (a/10 + 1) * 10;
		}
		int b10 = b;
		if(b%10 != 0) {
			b10 = (b/10 + 1) * 10;
		}
		int c10 = c;
		if(c%10 != 0) {
			c10 = (c/10 + 1) * 10;
		}
		int d10 = d;
		if(d%10 != 0) {
			d10 = (d/10 + 1) * 10;
		}
		int e10 = e;
		if(e%10 != 0) {
			e10 = (e/10 + 1) * 10;
		}
		int last = a;
		int last1 = a1;
		int last10 = a10;
		int other = b10 + c10 + d10 + e10;

		if(b1 != 0 && b1 < last1) {
			last = b;
			last1 = b1;
			other = other - b10 + last10;
			last10 = b10;
		}
		if(c1 != 0  && c1 < last1) {
			last = c;
			last1 = c1;
			other = other - c10 + last10;
			last10 = c10;
		}
		if(d1 != 0 && d1 < last1) {
			last = d;
			last1 = d1;
			other = other - d10 + last10;
			last10 = d10;
		}
		if(e1 != 0 && e1 < last1) {
			last = e;
			other = other - e10 + last10;
		}

		System.out.println(other + last);
	}

}