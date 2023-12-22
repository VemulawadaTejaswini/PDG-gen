import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0)
				break;
			else
				opi(x, y);
			System.out.println();
		}
		sc.close();
	}

	static void opi(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

