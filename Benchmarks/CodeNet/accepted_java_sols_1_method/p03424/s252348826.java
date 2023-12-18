import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String ans = "Three";

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.equals("Y")) {
				ans = "Four";
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
