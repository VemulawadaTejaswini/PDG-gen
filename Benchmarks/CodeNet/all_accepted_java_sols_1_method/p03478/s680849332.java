import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int a = sc.nextInt();
		final int b = sc.nextInt();

		int result = 0;
		for (int i = 1; i <= n; i++) {
			final String iList[] = (String.valueOf(i)).split("");
			int iTotal = 0;
			for (final String item : iList) {
				iTotal = iTotal + Integer.parseInt(item);
			}

			if (a <= iTotal && iTotal <= b) {
				result = result + i;
			}
		}

		System.out.print(result);

	}

}
