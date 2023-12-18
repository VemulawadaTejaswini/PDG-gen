import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = 0;
		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == 'o')
				n++;
		}
		System.out.print(700 + 100 * n);
	}
}