import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		if (b<=c || d <= a) {
			System.out.println(0);
			return;
		}
		if (a <= c) {
			if (d<=b) {
				System.out.println(d-c);
				return;				
			} else {
				System.out.println(b-c);
				return;
			}
		}
		if (a > c) {
			if (d<b) {
				System.out.println(d-a);
				return;				
			} else {
				System.out.println(b-a);
				return;
			}
		}
	}
}
