import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] s = new int[13];
		int[] h = new int[13];
		int[] c = new int[13];
		int[] d = new int[13];

		for (int i = 0; i < 13; i++) {
			s[i] = 0;
			h[i] = 0;
			c[i] = 0;
			d[i] = 0;
		}
		int rest = sc.nextInt();
		for (int k = 1; k < rest * 2; k = k + 2) {

			String mark = sc.next();

			int number = sc.nextInt();

			if (mark.equals("S")) {
				s[number - 1] = 1;
			}
			if (mark.equals("H")) {
				h[number - 1] = 1;
			}
			if (mark.equals("C")) {
				c[number - 1] = 1;
			}
			if (mark.equals("D")) {
				d[number - 1] = 1;
			}

		}

		for (int j = 1; j <= 13; j++) {
			if (s[j - 1] == 0)
				System.out.println("S " + j);
		}
		for (int j = 1; j <= 13; j++) {
			if (h[j - 1] == 0)
				System.out.println("H " + j);
		}
		for (int j = 1; j <= 13; j++) {
			if (c[j - 1] == 0)
				System.out.println("C " + j);
		}
		for (int j = 1; j <= 13; j++) {
			if (d[j - 1] == 0)
				System.out.println("D " + j);
		}

	}

}

