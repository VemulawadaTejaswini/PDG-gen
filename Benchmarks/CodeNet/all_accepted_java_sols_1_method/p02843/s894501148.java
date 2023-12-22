import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x / 100;
		int z = x - y * 100;

		for (int i = 0; i < y; i++) {
			if (z / 5 > 0) {
				z -= 5;
			} else if (z / 4 > 0) {
				z -= 4;
			} else if (z / 3 > 0) {
				z -= 3;
			} else if (z / 2 > 0) {
				z -= 2;
			} else {
				z -= 1;
			}
		}

		if (z <= 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		sc.close();
	}

}
