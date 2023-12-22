import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");

		if(!s[2].equals(s[3])) {
			System.out.println("No");
			return;
		}

		if(!s[4].equals(s[5])) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

	}
}