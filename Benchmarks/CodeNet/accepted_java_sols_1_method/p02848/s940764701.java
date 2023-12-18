import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		scan.close();

		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int c1 = c[i] + n;
			if (c1 > 90)
				c1 = c1 - 26;
			System.out.print((char) c1);

		}
	}
}