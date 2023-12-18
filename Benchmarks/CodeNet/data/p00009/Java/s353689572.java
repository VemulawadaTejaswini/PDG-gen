import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long n;

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			n = in.nextInt();

			System.out.println(primeCount(n));
		}
	}

	private static long primeCount(long n) {

		long[] list = new long[(int) n];
		int count = 0;

		list[0] = 0;
		for (int i = 1; i < n; i++)
			list[i] = 1;

		for (int i = 1; i < (int) Math.sqrt(n); i++) {
			if (list[i] == 1)
				for (int j = (i + 1); (i + 1) * j <= n; j++)
					list[(i + 1) * j - 1] = 0;
		}

		for (int i = 0; i < n; i++)
			if (list[i] == 1)
				count++;

		return count;
	}

}