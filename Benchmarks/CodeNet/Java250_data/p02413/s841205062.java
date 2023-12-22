import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();

		int[] rSum = new int[c];
		int cSum = 0, gSum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int cell = scan.nextInt();
				cSum += cell;
				rSum[j] += cell;
				System.out.print(cell + " ");
			}
			gSum += cSum;
			System.out.println(cSum);
			cSum = 0;
		}
		for (int i = 0; i < c; i++)
			System.out.print(rSum[i] + " ");
		System.out.println(gSum);

		System.exit(0);
	}

	private static int run(int n, int x) {
		int result = 0;
		for (int a = 1; a <= n; a++)
			for (int b = a + 1; b <= n; b++)
				for (int c = b + 1; c <= n; c++)
					if (a + b + c == x)
						++result;
		return (result);

	}
}