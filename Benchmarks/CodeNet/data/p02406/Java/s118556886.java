import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		do {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(""+i);
			}else{
				do {
					if (x % 10 != 3) {
						x /= 10;
					} else {
						System.out.print("" + i);
						break;
					}
				} while (x != 0);

			} else {
				System.out.print("" + i);
			}
		} while (++i <= n);
		System.out.println();
	}
}