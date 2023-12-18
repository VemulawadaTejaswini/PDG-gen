import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		char[] c = s.toCharArray();

		boolean can = true;
		for (int i = 0; i < s.length(); i++) {
			if (i == a && c[i] != '-') {
				can = false;
			}
			if (i != a && c[i] == '-') {
				can = false;
			}
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
