import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		String numStr = sc.next();

		String s = "Good";
		for (int i = 0; i < 3; i++) {
			if (numStr.charAt(i) == numStr.charAt(i + 1)) {
				s = "Bad";
				break;
			}
		}
		System.out.println(s);

	}

}
