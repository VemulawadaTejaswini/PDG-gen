import java.text.ParseException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		int[] ac = new int[n];

		String s = sc.next();

		char[] array = s.toCharArray();

		for (int i = 1; i < n; i++) {

			if (i != 0) {
				ac[i] = ac[i - 1];
			}

			if (array[i] == 'C') {
				if (array[i - 1] == 'A') {
					ac[i]++;
				}
			}
		}

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			System.out.println(ac[r - 1] - ac[l - 1]);

		}
	}

}
