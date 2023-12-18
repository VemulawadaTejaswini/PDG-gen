import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a2b = sc.nextInt();
		int b2c = sc.nextInt();
		int c2a = sc.nextInt();

		int[] all = new int[6];
		all[0] = a2b + b2c;
		all[1] = c2a + b2c;
		all[2] = a2b + c2a;
		all[3] = b2c + c2a;
		all[4] = c2a + a2b;
		all[5] = b2c + a2b;

		int min = all[0];
		for (int i = 1; i < all.length; i++) {
			if (all[i] < min) {
				min = all[i];
			}

		}

		System.out.println(min);
		sc.close();
	}
}