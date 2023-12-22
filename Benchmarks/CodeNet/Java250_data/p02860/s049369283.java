import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		scan.close();

		String s1 = s.substring(0, n / 2);
		String s2 = s.substring(n / 2, n);

		if (n % 2 == 0 && s1.equals(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}