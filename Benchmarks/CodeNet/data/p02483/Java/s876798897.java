import java.util.Scanner;
 
class Main {
	
	private static int a, b, c;
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		sort(a, b, c);
	}
	
	private static void sort(int a, int b, int c) {
		if (b < a && c < a) {
			if (b < c) {
				System.out.println(b + " " + c + " " + a);
			} else {
				System.out.println(c + " " + b + " " + a);
			}
		} else if (a < b && c < b) {
			if (a < c) {
				System.out.println(a + " " + c + " " + b);
			} else {
				System.out.println(c + " " + a + " " + b);
			}
		} else if (a < c && b < c) {
			if (a < b) {
				System.out.println(a + " " + b + " " + c);
			} else {
				System.out.println(b + " " + a + " " + c);
			}
		}
	}
}