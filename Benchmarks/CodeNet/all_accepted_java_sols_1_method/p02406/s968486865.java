import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 3 && n <= 10000) {
			int i = 1;
			int x, a, b, c;
			for (i = 1; i <= n; i++) {
				x = i;
				if (x % 3 == 0) {
					System.out.print(" " + x);
				} else {
					while (true) {
						if (x % 10 == 3) {
							System.out.print(" " + i);
							break;
						}
						x /= 10;
						if (x != 0)
							continue;
						else
							break;
					}
				}
			}

			System.out.printf("\n");
			sc.close();
		}
	}
}