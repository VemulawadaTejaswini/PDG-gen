import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		boolean can = false;
		for (int i = 1; i <= x; i++) {
			int j = x - i;
			if (y == j * 2 + i * 4 || y == i * 2 + j * 4 ) can = true;
		}


		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

		sc.close();
	}

}
