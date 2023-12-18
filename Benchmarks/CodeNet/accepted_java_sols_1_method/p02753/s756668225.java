import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] array = sc.nextLine().toCharArray();
		char before = array[0];

		for (char c : array) {
			if (c != before) {
				System.out.println("Yes");
				return;
			}
			before = c;
		}
		System.out.println("No");
	}
}
