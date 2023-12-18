import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (true) {

			if (n < 3 || n > 1000) {
				break;
			}
			while (i <= n) {
				if (i % 3 == 0) {
					System.out.printf(" %d", i);
				} else if (i % 10 == 3) {
					System.out.printf(" %d", i);
				}
				i++;
			}
		}
	}

}