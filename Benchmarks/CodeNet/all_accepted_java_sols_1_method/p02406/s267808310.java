import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int swi;

		while (i <= n) {
			int x = i;
			swi = 0;
			if (x % 3 == 0) {
				System.out.printf(" %d", i);
				swi = 1;
			}
			while (x != 0) {
				if (swi == 0) {
					if (x % 10 == 3) {
						System.out.printf(" %d", i);
						swi = 1;
					}
				}
				x = x / 10;
			}
			i++;

		}
		System.out.println();
		sc.close();
	}
}