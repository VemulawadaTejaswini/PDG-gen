import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		char c = s.charAt(0);

		s = s.replace("" + c, "");

		String ans = "No";

		if (s.length() == 2 && s.charAt(0) == s.charAt(1))
			ans = "Yes";

		System.out.println(ans);

		sc.close();
	}

}
