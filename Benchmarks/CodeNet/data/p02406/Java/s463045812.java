import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		do {
			END_CHECK_NUM: while (true) {
				int x = i;
				if (x % 3 == 0) {
					System.out.print(" " + i);
					break;
				} else {
					do {
						if (x % 10 == 3) {
							System.out.print(" " + i);
							break END_CHECK_NUM;
						}
						x /= 10;
					} while (x != 0);
				}
			}
			i++;
		} while (i <= n);
		System.out.println("");
	}
}
