import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 1;
		int x = sc.nextInt();

		do {
			if (n % 3 == 0) {
				System.out.print(" " + n);
			}else{
				int i = n;
				while (i != 0) {
					if ((i % 10) == 3) {
						System.out.print(" " + n);
						break;
					}
					i /= 10;
				}
			}
			n++;
		} while (n != x + 1);
		System.out.println();
	}
}