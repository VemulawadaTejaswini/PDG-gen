import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1 = 0, r2 = 0, r3 = 0;
		for (int i = 0; i < 10; i++) {
			int n = scan.nextInt();
			if (r3 < n) {
				r3 = n;
				if (r2 < r3) {
					int t = r2;
					r2 = r3;
					r3 = t;
					if (r1 < r2) {
						t = r1;
						r1 = r2;
						r2 = t;
					}
				}
			}

		}
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.exit(0);
	}
}