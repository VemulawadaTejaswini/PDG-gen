import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		sc.close();


		if (s.equals(t.substring(0, t.length()-1)) &&
				t.matches(s + "[a-z]")) {
				//t.substring(t.length(), t.length()).matches("[a-z]")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}