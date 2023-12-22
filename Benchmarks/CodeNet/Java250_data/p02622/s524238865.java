import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S = sc.nextLine();
		String T = sc.nextLine();
		int c = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != T.charAt(i))
				c++;
		}
		System.out.println(c);
	}

}
