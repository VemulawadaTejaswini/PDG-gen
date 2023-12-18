import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				String str = sc.nextLine();
				System.out.println(roman(str));
			}
		sc.close();

	}

	private static int roman(String str) {
		char[] c = str.toCharArray();
		int sum = 0;

			for (int i = 0; i < c.length; i++) {
				if ( i == c.length - 1 ) {
					sum += t(c[i]);
				} else if (t(c[i]) >= t(c[i + 1])) {
					sum += t(c[i]);
				} else {
					sum += t(c[i + 1]) - t(c[i]);
					i++;
				}
			}

		return sum;
	}

	private static int t(char c) {
		int t = 1;

			switch (c) {
			case 'I':
				t = 1;
				break;
			case 'V':
				t = 5;
				break;
			case 'X':
				t = 10;
				break;
			case 'L':
				t = 50;
				break;
			case 'C':
				t = 100;
				break;
			case 'D':
				t = 500;
				break;
			case 'M':
				t = 1000;
				break;
			}


		return t;
	}

}
