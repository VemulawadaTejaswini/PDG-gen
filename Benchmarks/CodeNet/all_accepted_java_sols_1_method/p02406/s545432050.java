import java.util.Scanner;

public class  Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while (++i <= n) {
			int x = i;
			if (x % 3 == 0) System.out.print(" " + i);
			else {
				for (; x != 0; x /= 10) {
					if (x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
				}
			}
		}
		System.out.println();
	}
}