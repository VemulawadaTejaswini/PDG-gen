import java.io.PrintWriter;
import java.util.Scanner;

// Aising2020_C
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		PrintWriter out = new PrintWriter(System.out);

		int x = 1;
		int y = 1;
		int z = 1;

		for (int n = 1; n <= N; n++) {
			int fn = 0;
			int count = 0;
			int sqrt = (int) Math.sqrt(n);

			for (int i = 1; i <= sqrt; i++) {
				x = i;
				if (x > y) {
					break;
				}
				for (int j = 1; j <= sqrt; j++) {
					y = j;
					if (y > z) {
						break;
					}
					for (int k = 1; k <= sqrt; k++) {
						z = k;
						fn = x * x + y * y + z * z + x * y + y * z + z * x;

						if (fn == n && x <= y && y <= z) {
							sqrt = z;
							count += calculateCombination(x, y, z);
						}
					}
				}
			}

			out.println(count);
			count = 0;
		}

		sc.close();
		out.flush();
	}

	private static int calculateCombination(int x, int y, int z) {

		if (x == y && y == z && z == x) {
			return 1;
		}

		if (x != y && y != z && z != x) {
			return 6;
		}

		return 3;
	}

}
