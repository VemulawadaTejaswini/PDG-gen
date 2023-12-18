import java.util.Scanner;

public class Main_paiza {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();

		String result = T.replace(S, "");
		if (result.matches("[a-z]")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
