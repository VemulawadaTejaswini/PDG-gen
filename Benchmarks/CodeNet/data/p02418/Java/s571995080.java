import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String p = sc.nextLine();

		int sLen = s.length();
		int pLen = p.length();
		boolean ok = false;
		for (int i = 0; i < sLen; i++) {

			for (int j = 0; j < pLen; j++) {

				if(s.charAt((i + j)%sLen) != p.charAt(j)) {
					break;
				}

				if(j == pLen-1) ok = true;

			}

			if(ok) break;

		}

		System.out.println(ok ? "Yes" : "No");

	}
}