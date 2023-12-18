import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int x = s.nextInt();

			if (n == 0 && a == 0 && b == 0 && c == 0 && x == 0)
				break;

			int[] y = new int[n];
			for (int t = 0; t < n; t++) {
				y[t] = s.nextInt();
			}

			int frame = 0;
			int random = x;
			int check = 0;

			for (int i = 0; i < n; i++) {
				if (check != 0) {
					frame++;
					random = Random(a, b, c, random);
					check = 1;
				}
				while (y[i] != random) {
					frame++;
					random = Random(a, b, c, random);
					if (frame > 10000)
						break;
				}
				check=1;
				if (frame > 10000)
					break;
			}

			if (frame > 10000) {
				System.out.println(-1);
			} else {
				System.out.println(frame);
			}

		}
		s.close();
	}

	public static int Random(int a, int b, int c, int x) {
		return (a * x + b) % c;
	}
}