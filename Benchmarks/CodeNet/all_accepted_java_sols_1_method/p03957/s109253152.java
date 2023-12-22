import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		int idx = s.indexOf("C");
		if (idx != -1) {
			int idx2 = s.indexOf("F", idx);
			if (idx2 != -1) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}