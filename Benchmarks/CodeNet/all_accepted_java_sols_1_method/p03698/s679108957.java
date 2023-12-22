import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sb = s.nextLine();
		int na = sb.length();

		String ans = "yes";
		int i = 0;
		int j = 1;

		for (i = 0; i < na; i++) {
			for (j = 1; j < na - i; j++) {
				String a = sb.charAt(i) + "";
				String b = sb.charAt(j + i) + "";
				if (a.equals(b)) {
					ans = "no";
					break;
				}

			}
		}
		System.out.println(ans);
	}

}