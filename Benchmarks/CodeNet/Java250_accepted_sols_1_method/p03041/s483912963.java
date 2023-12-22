import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		String[] s = sc.next().split("");
		s[k - 1] = s[k -1].toLowerCase();

		System.out.println(String.join("", s));
	}
}