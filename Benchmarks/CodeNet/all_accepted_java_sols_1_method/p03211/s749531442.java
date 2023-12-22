import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		int min = 999;
		for (int i = 0; i <= S.length() - 3; i++) {
			int tmp = Integer.parseInt(S.substring(i, i + 3));

			int sub = Math.abs(tmp - 753);
			if (sub < min) {
				min = sub;
			}
		}
		System.out.println(min);
	}
}