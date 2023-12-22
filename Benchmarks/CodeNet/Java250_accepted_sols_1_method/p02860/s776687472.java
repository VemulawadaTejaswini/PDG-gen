import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();

		if (n % 2 != 0) {
			System.out.println("No");
			sc.close();
			return;
		}

		StringBuilder firstHalf = new StringBuilder();
		StringBuilder secondHalf = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char charS = S.charAt(i);
			if (i < n / 2) {
				firstHalf.append(charS);
			} else {
				secondHalf.append(charS);
			}
		}

		if (firstHalf.toString().equals(secondHalf.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}