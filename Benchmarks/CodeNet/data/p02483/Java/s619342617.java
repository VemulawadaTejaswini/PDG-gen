import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int d = 0;
		
		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		if (b > c) {
			d = c;
			c = b;
			b = d;
		}
		if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		
		System.out.println(a + " " + b + " " + c);
	}
}