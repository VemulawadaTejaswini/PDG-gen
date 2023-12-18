import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int sum = 0;

		while (k > 0) {
			if (a != 0) {
				a--;
				k--;
				sum += 1;
			} else if (b != 0) {
				b--;
				k--;
				sum += 0;
			} else if (c != 0) {
				c--;
				k--;
				sum += -1;
			}
		}

		System.out.println(sum);
		sc.close();

	}
}