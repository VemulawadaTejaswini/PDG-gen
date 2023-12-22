
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int i = 0;
		int j = 0;
		int count = 0;


		int ary1[] = new int[2 * m];
		for (i = 0; i < 2 * m; i++) {
			ary1[i] = s.nextInt();


		}

		int ary[] = new int[n];

		for (i = 0; i < n; i++) {
			count = 0;
			for (j = 0; j < 2 * m; j++) {

				if (ary1[j] == i + 1) {
					count++;


				}
			}
			ary[i] = count;
			System.out.println(ary[i]);

		}

	}

}