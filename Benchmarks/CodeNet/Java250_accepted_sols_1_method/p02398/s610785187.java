import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Integer count = 0;

		if (c < a) {
			System.out.println(count);
			return;
		}
		
		if(a == b && b == c) {
			System.out.println(1);
			return;
		}

		while (true) {

			if (c % a == 0) {
				count++;
			}

			if (a == b) {
				System.out.println(count);
				return;
			}

			a++;
		}

	}

}
