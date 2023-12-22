import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int n = sc.nextInt();
			
			int result = 0;
			switch (d) {
			case 0:
				if (n == 100) {
					result = 101;
				} else {
					result = n;
				}
				break;
			case 1:
				if (n == 100) {
					result = 10100;
				} else {
					result = 100 * n;
				}
				break;
			case 2:
				if (n == 100) {
					result = 1010000;
				} else {
					result = 10000 * n;
				}
				break;
			}
			
			System.out.println(result);
		}

	}

}