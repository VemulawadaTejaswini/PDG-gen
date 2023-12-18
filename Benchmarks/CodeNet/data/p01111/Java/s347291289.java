import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int sum = 0;
			int min = 0;
			int count = 0;
			int b = sc.nextInt();
			if (b == 0) {
				break;
			}
			outside: for (int i = 1; i <= b; i++) {
				for (int j = i; j <= b; j++) {
					sum += j;
					min = i;
					count++;
					if (j == b / 2) {
						min = b;
						count = 1;
						break outside;
					}

					if (sum == b) {
						break outside;
					}

					if (sum > b) {
						count = 0;
						sum = 0;
						break;
					}

					if (i == b / 2) {
						min = b;
						count = 1;
						break outside;
					}
				}
			}
			System.out.println(min + " " + count);
		}
		sc.close();

	}

}

