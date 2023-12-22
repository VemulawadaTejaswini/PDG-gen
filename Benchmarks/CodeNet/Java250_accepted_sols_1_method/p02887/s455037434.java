import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();

		char before = '0';
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != before) {
				before = c;
				count++;
			}
		}

		System.out.println(count);
	}

}